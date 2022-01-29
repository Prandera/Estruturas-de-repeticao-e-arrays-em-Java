package Repeticao;

import java.util.Scanner;

//Faça um programa que peça 10 números inteiros, calcule e mostre a quantidade de números pares e a quantidade de números impares.
public class Exercicio14 {
    public static void main(String[] args) {
        int num, impar, par, i;
        Scanner scan = new Scanner(System.in);
        par = impar = 0;

        for (i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º numero: ");
            num = scan.nextInt();
            if ((num % 2) == 0)
                par++;
            else
                impar++;
        }

        System.out.println("Total de números pares: " + par
                + "\nTotal de números ímpares: " + impar);
    }
}
