package Repeticao;

//Faça um programa que peça dois números, base e expoente, calcule e mostre o primeiro número elevado ao
//segundo número. Não utilize a função de potência da linguagem.

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        int base, expoente, total, i;
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o valor da base: ");
        total = base = scan.nextInt();
        System.out.print("Digite o valor da expoente: ");
        expoente = scan.nextInt();

        for (i = 1; i < expoente; i++)
            total *= base;

        System.out.println("Total: " + total);
    }
}
