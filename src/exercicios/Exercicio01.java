package exercicios;

public class Exercicio01 {
    public static void main(String[] args) {
        System.out.print("\n\tAtividade A");
        System.out.print("\n\t- - - - - - - - - - - - - - - - - - - - ");
        System.out.print("\n\t35 - {5 + [15 : (3 + 2) - (18 + 2) : 10] + 3 . (5 + 2) + 3} = ");
        double resultA = 35 - (5 + (15 / (3 + 2) - (18 + 2) / 10) + 3 * (5 + 2) + 3);
        System.out.println(resultA);

        System.out.println("");
        System.out.print("\n\tAtividade B");
        System.out.print("\n\t- - - - - - - - - - - - - - - - - - - - ");
        System.out.print("\n\t{5 + 2 . [15 - (2^4 : 8) + 3 . (2^3 - 7)] - 3^3} = ");
        double resultB = 5 + 2 * (15 - (Math.pow(2,4) / 8) + 3 * (Math.pow(2,3) - 7)) - Math.pow(3,3);
        System.out.println(resultB);

        System.out.println("");
        System.out.print("\n\tAtividade C");
        System.out.print("\n\t- - - - - - - - - - - - - - - - - - - - ");
        System.out.print("\n\t(1)^2 : {3 + 2 . [5 – 2 : 2] + 5 (3 - 1^2)}^0 = ");
        double resultC = Math.pow((1),2) / Math.pow((3 + 2 * (5 - 2 / 2) + 5 + (3 - Math.pow(1,2))),0);
        System.out.println(resultC);
    }
}
