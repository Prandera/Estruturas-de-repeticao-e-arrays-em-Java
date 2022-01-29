package Repeticao;

//Altere o programa anterior para mostrar no final a soma dos números.

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        int numA, numB, i, soma = 0;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.print("Digite o valor inteiro de A: ");
            numA = scan.nextInt();
            System.out.print("Digite o valor inteiro de B: ");
            numB = scan.nextInt();
        } while (numA == numB);

        if (numA > numB) {
            for (i = numB; i <= numA; i++) {
                System.out.print(i + " ");
                soma += i;
            }
        } else {
            for (i = numA; i <= numB; i++) {
                System.out.print(i + " ");
                soma += i;
            }
        }

        System.out.println("\nTotal da soma dos numeros: " + soma);
    }
}

