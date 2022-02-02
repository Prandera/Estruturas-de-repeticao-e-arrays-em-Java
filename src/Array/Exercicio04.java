package Array;

import java.util.Scanner;

//Faça um Programa que leia um vetor de 10 caracteres, e diga quantas consoantes foram lidas. Imprima as consoantes.
public class Exercicio04 {
    public static void main(String[] args) {
        String[] array = new String[10];
        int i, numeroDeConsoantes = 0;
        Scanner scan = new Scanner(System.in);

        i = 0;
        do {
            System.out.print("Digite o " + (i + 1) + "º caracter: ");
            String letra = scan.next();
            if (!(letra.equalsIgnoreCase("a") ||
                    letra.equalsIgnoreCase("e") ||
                    letra.equalsIgnoreCase("i") ||
                    letra.equalsIgnoreCase("o") ||
                    letra.equalsIgnoreCase("u"))) {
                numeroDeConsoantes++;
                array[i] = letra;
            }
            i++;
        } while (i < array.length);

        System.out.print("\nExibindo o vetor: ");
        for (String consoante : array) {
            System.out.print(consoante + " ");
        }

        System.out.print("\nExibindo as consoantes: ");
        for (String consoante : array) {
            if (consoante != null)
                System.out.print(consoante + " ");
        }

        System.out.println("\nTotal de consoantes: " + numeroDeConsoantes);
    }
}
