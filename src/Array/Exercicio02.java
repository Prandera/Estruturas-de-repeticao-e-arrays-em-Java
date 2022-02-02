package Array;

import java.util.Scanner;

//Faça um Programa que leia um vetor de 10 números reais e mostre-os na ordem inversa.
public class Exercicio02 {
    public static void main(String[] args) {
        int[] array = new int[10];
        int i = 0;
        Scanner scan = new Scanner(System.in);

        while (i < array.length) {
            System.out.print("Digite o valor da " + (i + 1) + "ª posição: ");
            array[i] = scan.nextInt();
            i++;
        }

        System.out.print("\nExibindo o vetor em ordem inversa: ");
        for (i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }

}
