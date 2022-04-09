package exercicios;

import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        int n1, n2;
        System.out.print("Insira um valor inteiro: ");
        n1 = extracted().nextInt();
        System.out.println("O número inserido é: " + n1);
        System.out.println("O sucessor deste número é: " + ++n1);
        n2 = n1 - 1;
        System.out.println("O antecessor deste número é " + --n1);
    }

    private static Scanner extracted() {
        return new Scanner(System.in);
    }
}
