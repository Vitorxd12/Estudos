package ListaExercicios6_ForLoop;

import java.util.Scanner;
/*
02 - Elabore um programa para controlar os serviços prestados pela “Barbearia Inho”. Nesta barbearia
trabalham os profissionais Dilsinho (D) e os irmãos Betinho (B) e Netinho (N). Os serviços prestados
são: corte cabelo (SC), barba (SB), cabelo e barba (CB). Elabore um programa para ler os dados
(profissional e serviço) de 10 clientes. Ao final, informe:
- número de serviços prestados pelos irmãos para “SC”;
- percentual de serviços prestados por Dilsinho;
- Total arrecadado pela barbearia considerando os seguintes valores:
SC  R$ 30,00 SB R$ 20,00 CB  40,00
*/
public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nClien = 10;
        int dilsin = 0, irmaos = 0, total = 0, scIrm = 0;
        String escolPro, escolServ;
        for (int i = 0; i < nClien; i++) {
            boolean escolValid = true;
            System.out.println("\nBem vindo a barbearia do Inho!\nVocê gostaria de cortar seu cabelo com qual profissional?");
            System.out.println("Digite 'D' para cortar com Dilsinho, 'B' para cortar com Betinho ou 'N' para cortar com Netinho");
            escolPro = sc.nextLine().toUpperCase();
            if (escolPro.equals("D")) {
                System.out.println("Você vai amar o corte do Dilsinho!");
                dilsin++;
            } else if (escolPro.equals("B") || escolPro.equals("N")) {
                System.out.println("Os irmãos são muito talentosos. Você vai adorar!");
                irmaos++;
            } else {
                System.out.println("Não trabalhamos com este profissional. Acredito que ele seja funcionário da concorrência.");
                escolValid = false;
            }
            if (escolValid) {
                System.out.println("Qual o serviço que do seu interesse? \n(Digite 'SC' para só cabelo, 'SB' para só barba e 'CB' para fazer Cabelo e barba.)");
                escolServ = sc.nextLine().toUpperCase();
                if (escolServ.equals("SC")) {
                    total += 30;
                } else if (escolServ.equals("SB")) {
                    total += 20;
                } else if (escolServ.equals("CB")) {
                    total += 40;
                } else{
                    System.out.println("Digite um serviço válido!");
                }
                if (escolServ.equals("SC") && (!escolPro.equals("D"))) {
                    scIrm++;
                }
            }
        }

        System.out.println("Número de cortes de cabelo, sem barba, prestados pelos irmãos: " + scIrm);
        System.out.println(100 * dilsin / nClien + "% dos cortes forma feitos por dilsinho");
        System.out.println("Total arrecadado pela barbearia: " + total);
    }
}