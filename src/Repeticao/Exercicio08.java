package Repeticao;

//Faça um programa que leia 5 números e informe a soma e a média dos números.

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        int i, num = 0;
        float media;
        Scanner scan = new Scanner(System.in);

        for (i = 1; i <= 5; i++) {
            System.out.print("Digite o " + i + "º número: ");
            num += scan.nextInt();
        }

        media = (float) num / 5;
        System.out.println("\nSoma dos valores: " + num + "\nMédia dos valores: " + media);
    }
}
