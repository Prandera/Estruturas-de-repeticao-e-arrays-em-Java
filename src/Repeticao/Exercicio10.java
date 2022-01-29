package Repeticao;

//Faça um programa que receba dois números inteiros e gere os números inteiros que estão no intervalo compreendido por eles.

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        int numA, numB, i;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.print("Digite o valor inteiro de A: ");
            numA = scan.nextInt();
            System.out.print("Digite o valor inteiro de B: ");
            numB = scan.nextInt();
        } while (numA == numB);

        if (numA > numB) {
            for (i = numB; i <= numA; i++)
                System.out.print(i + " ");
        } else {
            for (i = numB; i >= numA; i--)
                System.out.print(i + " ");
        }
    }
}
