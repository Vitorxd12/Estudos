package Aula_0_Preparatorio;

import java.util.Scanner;

public class DataInputs {
    public static void main(String[] args) {
        //first we call the class. call Scanner, atribuite it a name, and the rest. IntelliJ will complete.
        //check if IDE imported the library
        Scanner scanner = new Scanner(System.in);

        System.out.println("sup dog whats your name");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);
    }
}
