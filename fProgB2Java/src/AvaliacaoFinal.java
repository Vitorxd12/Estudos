public class AvaliacaoFinal {
    public static void main(String[] args) {
        int nCapSul = 4, somaTempNord = 0, nTempNord = 0, somaTempSul = 0, somaTri1 = 0, nTempTri1 = 0;
        int[] vMediaSul = new int[3];
        int[] vMaxMes = new int[4];
        int[][] matriz = {
                {35, 32, 32, 26}, //Aracaju
                {32, 32, 30, 25}, //Salvador
                {30, 31, 35, 29}, //Recife
                {34, 30, 33, 30}, //Maceió
                {33, 30, 32, 29}, //Porto Alegre
                {32, 29, 31, 28}, //Florianopolis
                {33, 34, 32, 29}, //Curitiba

        };

        //Loop principal
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 4; j++) {
                //Media  das temperaturas do nordeste
                if (i < 4) {
                    somaTempNord += matriz[i][j];
                    nTempNord++;
                }
                //Media das capitais da região sul
                if (i >= 4) {
                    somaTempSul += matriz[i][j];
                    vMediaSul[i - 4] = somaTempSul / nCapSul;
                }
                //Media Trimestre 1
                if (j < 3) {
                    somaTri1 += matriz[i][j];
                    nTempTri1++;
                }
                //Maior temperatura de cada mes
                if (matriz[i][j] > vMaxMes[j]) {
                    vMaxMes[j] = matriz[i][j];
                }
            }
            //Resetando variaveis para prox loop
            somaTempSul = 0;
        }

        //Print Resultados
        System.out.println("\nA media das temperaturas das capitais do nordeste ao longo dos 4 primeiros meses foi: " + (somaTempNord / nTempNord));
        System.out.print("Medias das temperaturas de cada capital da região sul: ");
        for (int i = 0; i < vMediaSul.length; i++) {
            System.out.printf("% 4d", vMediaSul[i]);
        }
        System.out.println("\nA media das temperaturas das capitais do nordeste ao longo dos 4 primeiros meses foi: " + (somaTri1 / nTempTri1));
        System.out.print("Temperatura maxima de cada mês: ");
        for (int i = 0; i < vMaxMes.length; i++) {
            System.out.printf("% 4d", vMaxMes[i]);
        }
        System.out.println();
    }
}
