package estruturas.lineares.estaticas.lista;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

import estruturas.lineares.IListaLinear;

public class ListaSequencial<T> implements IListaLinear<T>, Iterable<T> {

    /////////////
    //Atributos//
    /////////////

    private int tamanho;
    private T[] elementos;

    //////////////
    //Construtor//
    //////////////

    @SuppressWarnings("unchecked")
    public ListaSequencial(int capacidade) {
        if (capacidade < 0) {
            throw new IllegalArgumentException("A capacidade do vetor não pode ser negativa");
        }
        this.tamanho = 0;
        this.elementos = (T[]) new Object[capacidade];
    }

    ////////////////////////
    //Operações Auxiliares//
    ////////////////////////

    //Verifica se a posicao/indice passado como parâmetro está fora dos limites do vetor (IndexOutOfBounds)
    private void verificarPosicao(int posicao, int minimo, int maximo) {
        if (posicao < minimo || posicao > maximo) {
            throw new IndexOutOfBoundsException(
                    String.format("Índice: %d, Tamanho: %d", posicao, this.tamanho)
            );
        }
    }

    //Verifica a capacidade do vetor
    private void verificarCapacidade() {
        if (this.tamanho == this.elementos.length) {
            throw new IllegalStateException("Capacidade máxima atingida.");
        }
    }

    ////////////////////////////////////////////
    //Operações de Consulta (Query Operations)//
    ////////////////////////////////////////////

    @Override
    public int tamanho() {
        return this.tamanho;
    }

    @Override
    public boolean estaVazia() {
        return this.tamanho == 0;
    }

    @Override
    public int posicao(T elemento) {
        for (int indice = 0; indice < this.tamanho; indice++) {
            if (Objects.equals(elemento, this.elementos[indice])) {
                return indice;
            }
        }
        return -1;
    }

    @Override
    public boolean contem(T elemento) {
        return this.posicao(elemento) != -1;
    }

    @Override
    public String imprimir() {
        return Arrays.toString(Arrays.copyOf(this.elementos, this.tamanho));
    }

    @Override
    public T obter(int posicao) {
        this.verificarPosicao(posicao, 0, this.tamanho - 1);
        return (T) this.elementos[posicao];
    }

    ////////////////////////////////////////////////////////////
    //Operações Básicas de Mutação (Basic Mutation Operations)//
    ////////////////////////////////////////////////////////////

    @Override
    public void inserir(T elemento, int posicao) {
        if (posicao < 0 || posicao > this.tamanho) {
            System.out.println("Posição Invalida. A posição deve estar entre 0 e " + this.tamanho);
            return;
        }
        if (this.tamanho == this.elementos.length) {
            System.out.println("Lista cheia, capacidade máxima atingida.");
            return;
        }
        for (int i = this.tamanho - 1; i >= posicao; i--) {
            this.elementos[i + 1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.tamanho++;
    }

    @Override
    public void atualizar(int posicao, T elemento) {
        if (posicao > 0 || posicao < this.tamanho) {
            this.elementos[posicao] = elemento;
        }
    }

    @Override
    public T remover(int posicao) {
        if (posicao < 0 || posicao > this.tamanho) {
            System.out.println("Posição Invalida. A posição deve estar entre 0 e " + this.tamanho);
            return null;
        }
        if (this.tamanho == 0) {
            System.out.println("Lista vazia, capacidade minima atingida.");
            return null;
        }
        T valorRemovido = this.elementos[posicao];
        for (int i = posicao; i < this.tamanho - 1; i++) {
            this.elementos[i] = this.elementos[i + 1];
        }
        this.elementos[this.tamanho - 1] = null;
        this.tamanho--;
        return valorRemovido;
    }

    @Override
    public void limpar() {
        for (int i = 0; i < this.tamanho; i++) {
            this.elementos[i] = null;
            this.tamanho = 0;
        }
    }

    ////////////////////////////////////////////////////////////////
    //Operações Derivadas de Mutação (Derived Mutation Operations)//
    ////////////////////////////////////////////////////////////////

    public void inserirInicio(T elemento) {
        inserir(elemento, 0);
    }

    public void removerElemento(T elemento) {
        for (int i = 0; i < this.tamanho; i++) {
            if (Objects.equals(elemento, this.elementos[i])) {
                remover(i);
                i--;
                System.out.println("uepaa");
            }
        }
    }

    public void removerInicio() {
        remover(0);
    }

    public void removerFim() {
        remover(this.tamanho - 1);
    }

    ////////////////////////////////////////////////
    //Operações de Iteração (Iteration Operations)//
    ////////////////////////////////////////////////

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int posicao = 0;

            @Override
            public boolean hasNext() {
                return posicao < tamanho;
            }

            @Override
            public T next() throws NoSuchElementException  {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                return elementos[posicao++];
            }
        };
    }

}