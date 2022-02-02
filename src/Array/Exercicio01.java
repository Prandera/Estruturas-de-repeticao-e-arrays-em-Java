package Array;

import java.util.Scanner;

//Faça um Programa que leia um vetor de 5 números inteiros e mostre-os.
public class Exercicio01 {
    public static void main(String[] args) {
        int[] array = new int[5];
        int i;
        Scanner scan = new Scanner(System.in);

        for (i = 0; i < array.length; i++) {
            System.out.print("Digite o valor da " + (i + 1) + "ª posição: ");
            array[i] = scan.nextInt();
        }

        System.out.print("\n\nExibindo o array: ");
        for (i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
