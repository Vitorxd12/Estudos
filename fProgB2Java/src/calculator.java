import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String botao;
        String[] nmValid = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String[] opValid = {"*", "/", "-", "+", "="};
        StringBuilder stringBuilder = new StringBuilder("0");
        int typedNumberInt = 0;
        int answer = 0;
        boolean firstNumber = true;
        boolean isOperador = false;
        boolean isNumero = false;
        boolean flag = true;

        //main loop
        while (flag) {
            //pegar botão e checar se é operador ou numero
            botao = sc.nextLine();
            for (int i = 0; i < nmValid.length; i++) {
                if (botao.equals(nmValid[i])) {
                    isNumero = true;
                    break;
                } else {
                    isNumero = false;
                }
            }
            for (int i = 0; i < opValid.length; i++) {
                if (botao.equals(opValid[i])) {
                    isOperador = true;
                    break;
                } else {
                    isOperador = false;
                }
            }
            if (!isOperador && !isNumero) {
                flag = false;
                break;
            }
            //calcul do numero
            if (isNumero) {
                stringBuilder.append(botao);
                typedNumberInt = Integer.parseInt(stringBuilder.toString());
            } else {
                if (firstNumber) {
                    answer = typedNumberInt;
                    firstNumber = false;
                } else {
                    if (botao.equals("+")) {
                        answer += typedNumberInt;
                    } else if (botao.equals("-")) {
                        answer -= typedNumberInt;
                        System.out.println(answer);
                    } else if (botao.equals("*")) {
                        answer *= typedNumberInt;
                        System.out.println(answer);
                    } else if (botao.equals("/")) {
                        answer /= typedNumberInt;
                        System.out.println(answer);
                    } else if (botao.equals("=")) {
                        answer += typedNumberInt;
                        System.out.println(answer);
                    }
                }
                typedNumberInt = 0;
                stringBuilder.delete(0, stringBuilder.length());
                System.out.println("parcial" + answer);
            }
        }
    }
}
