package testes;

import java.util.Scanner;

public class insercao_de_valores {
    public static void main(String[] args) {
        System.out.printf("Informe um número: ");
        Scanner valor_n = new Scanner(System.in);
        int n = valor_n.nextInt();
        System.out.println("Número informado: " + n);

        Scanner pn = new Scanner(System.in);
        float percent_n = pn.nextFloat();
        System.out.println("Porcentagem: " + percent_n);
    }
}