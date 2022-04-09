package exercicios;

import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {
        System.out.println("Votos válidos: ");
        Scanner lerValidos = new Scanner(System.in);
        int validos = lerValidos.nextInt();

        System.out.println("Votos nulos: ");
        Scanner lerNulos = new Scanner(System.in);
        int nulos = lerNulos.nextInt();

        System.out.println("Votos brancos: ");
        Scanner lerBrancos = new Scanner(System.in);
        int brancos = lerBrancos.nextInt();

        System.out.println("Votos válidos: " + validos);
        System.out.println("Votos nulos: " + nulos);
        System.out.println("Votos brancos: " + brancos);

        int totalVotos = validos + nulos + brancos;

        System.out.println((validos / totalVotos) * 100);
    }
}
