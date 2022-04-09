package exercicios;

import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        int A, B, C;
        System.out.print("Insira o valor de A: ");
        Scanner a = new Scanner(System.in);
        A = a.nextInt();
        System.out.print("Insira o valor de B: ");
        Scanner b = new Scanner(System.in);
        B = b.nextInt();
        System.out.print("Insira o valor de C: ");
        Scanner c = new Scanner(System.in);
        C = c.nextInt();

        System.out.println("Atividade A");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - ");
        System.out.println("O resultado final á soma de B por C é " + B + C);
        System.out.println("O resultado final á multiplicação de A por C é " + A * C);
        System.out.println("");

        System.out.println("Atividade B");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - ");
        System.out.println("O resultado final á soma de A², B² e C² é " + Math.pow(A,2) + Math.pow(B,2) + Math.pow(C,2));
        System.out.println("");

        System.out.println("Atuividade C");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - ");
        System.out.println("O resultado final ao quadrado da soma de A, B e C: " + Math.pow(A + B + C, 2));
        System.out.println("");

        /* Testar valor das variáveis
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        */
    }
}
