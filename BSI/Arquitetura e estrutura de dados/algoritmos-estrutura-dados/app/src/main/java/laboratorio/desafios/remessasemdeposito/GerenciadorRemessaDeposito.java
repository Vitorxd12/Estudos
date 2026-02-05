package laboratorio.desafios.remessasemdeposito;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Iterator;

import estruturas.lineares.IFila;
import estruturas.lineares.IPilha;
import estruturas.lineares.dinamicas.fila.FilaComListaDuplamenteEncadeada;
import estruturas.lineares.dinamicas.pilha.PilhaComListaSimplesmenteEncadeada;

/**
 * Gerenciador de Remessas - CEASA Aracaju
 * * Esta classe orquestra o fluxo logístico utilizando:
 * 1. Fila (FIFO): Para respeitar a ordem de chegada das carretas/remessas.
 * 2. Map (LinkedHashMap): Para indexar áreas de estoque por ID do produto.
 * 3. Pilha (LIFO): Para garantir que o item no topo seja o mais acessível.
 * 4. Insertion Sort: Para manter o estoque ordenado por data de validade.
 */
public class GerenciadorRemessaDeposito implements IGerenciadorRemessaDeposito {

    // Atributo 1: Fila que armazena as remessas (vetores de itens) pendentes de processamento
    private IFila<IItemEstoque[]> remessasPendentes;

    // Atributo 2: Mapeamento de IDs para suas respectivas Pilhas de armazenamento
    // O LinkedHashMap é usado para preservar a ordem em que os produtos foram conhecidos
    private Map<String, IPilha<IItemEstoque>> armazenamentoEstoque;

    public GerenciadorRemessaDeposito() {
        // Inicialização das estruturas conforme exigido pelo projeto
        this.remessasPendentes = new FilaComListaDuplamenteEncadeada<>();
        this.armazenamentoEstoque = new LinkedHashMap<>();
    }

    @Override
    public void receberRemessa(IItemEstoque[] remessa) {
        // As remessas chegam e são colocadas no fim da fila (Semântica FIFO)
        this.remessasPendentes.enfileirar(remessa);
    }

    @Override
    public void processarTodasRemessas() {
        // Processamento em lote: esvazia a fila de remessas uma por uma
        while (!this.remessasPendentes.estaVazia()) {
            IItemEstoque[] remessa = this.remessasPendentes.desenfileirar();
            this.processarUmaUnicaRemessa(remessa);
        }
    }

    @Override
    public void processarUmaUnicaRemessa(IItemEstoque[] remessa) {
        // Cada item dentro de uma remessa deve ser categorizado e guardado
        for (IItemEstoque novoItem : remessa) {
            String id = novoItem.obterID();

            // Se o produto (ex: "Uva") ainda não tem uma pilha no mapa, criamos agora
            if (!this.armazenamentoEstoque.containsKey(id)) {
                this.armazenamentoEstoque.put(id, new PilhaComListaSimplesmenteEncadeada<>());
            }

            IPilha<IItemEstoque> pilhaEstoque = this.armazenamentoEstoque.get(id);

            // Chamada da lógica de ordenação por inserção para manter a validade correta
            this.inserirOrdenadoPorValidade(pilhaEstoque, novoItem);
        }
    }

    /**
     * Lógica de Ordenação por Inserção (Insertion Sort) adaptada para Pilhas.
     * O objetivo é manter o item com a MENOR data de validade no TOPO da pilha.
     */
    private void inserirOrdenadoPorValidade(IPilha<IItemEstoque> pilha, IItemEstoque novoItem) {
        // Pilha auxiliar para manobra de dados
        IPilha<IItemEstoque> pilhaAuxiliar = new PilhaComListaSimplesmenteEncadeada<>();

        // Enquanto o item no topo for "mais novo" (vencer depois) que o novo item,
        // nós o movemos para a pilha auxiliar para abrir caminho.
        // O topo deve ser sempre o vencimento mais próximo.
        while (!pilha.estaVazia() &&
                pilha.obterTopo().obterDataValidade().isBefore(novoItem.obterDataValidade())) {
            pilhaAuxiliar.empilhar(pilha.desempilhar());
        }

        // Inserimos o novo item na sua posição correta (estratégia de inserção)
        pilha.empilhar(novoItem);

        // Retornamos os itens da manobra para a pilha principal (mantendo a ordem)
        while (!pilhaAuxiliar.estaVazia()) {
            pilha.empilhar(pilhaAuxiliar.desempilhar());
        }
    }

    @Override
    public String obterStatusArmazenamento() {
        if (this.armazenamentoEstoque == null || this.armazenamentoEstoque.isEmpty()) {
            return "Itens Armazenados no Depósito? NÃO";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("Itens Armazenados no Depósito? SIM\n");

        for (Map.Entry<String, IPilha<IItemEstoque>> entrada : this.armazenamentoEstoque.entrySet()) {
            String produtoID = entrada.getKey();
            IPilha<IItemEstoque> pilhaOriginal = entrada.getValue();

            sb.append("- ").append(produtoID).append(": ");

            if (pilhaOriginal.estaVazia()) {
                sb.append("Vazio");
            } else {
                // Técnica segura: Desempilhar para ler e usar uma auxiliar para restaurar
                IPilha<IItemEstoque> pilhaAuxiliar = new PilhaComListaSimplesmenteEncadeada<>();

                while (!pilhaOriginal.estaVazia()) {
                    IItemEstoque item = pilhaOriginal.desempilhar();
                    sb.append(item.toString());

                    pilhaAuxiliar.empilhar(item);

                    if (!pilhaOriginal.estaVazia()) {
                        sb.append(" -> ");
                    }
                }

                // Restaura a pilha original para não destruir o estoque
                while (!pilhaAuxiliar.estaVazia()) {
                    pilhaOriginal.empilhar(pilhaAuxiliar.desempilhar());
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    @Override
    public IItemEstoque recuperarProximoItemDaRemessa(String ID) {
        IPilha<IItemEstoque> pilha = this.armazenamentoEstoque.get(ID);

        // O item mais acessível é o topo da pilha (LIFO)
        // Graças ao Insertion Sort, o topo é sempre o que vence primeiro
        if (pilha != null && !pilha.estaVazia()) {
            return pilha.desempilhar();
        }
        return null;
    }

    @Override
    public boolean temRemessasRecebidasPendentesDeProcessamento() {
        // Verifica se ainda existem carretas na fila de espera
        return !this.remessasPendentes.estaVazia();
    }
}