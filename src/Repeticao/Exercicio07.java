package Repeticao;

//Faça um programa que leia 5 números e informe o maior número.

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        int i, num, maior = 0;
        Scanner scan = new Scanner(System.in);

        for (i = 1; i <= 5; i++) {
            System.out.print("Digite o " + i + "º número: ");
            num = scan.nextInt();
            if (num > maior)
                maior = num;
        }

        System.out.println("Maior número : " + maior);
    }
}
