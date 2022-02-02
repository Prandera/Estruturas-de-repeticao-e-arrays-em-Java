package Array;

import java.util.Scanner;

//Faça um Programa que leia 4 notas, mostre as notas e a média na tela.
public class Exercicio03 {
    public static void main(String[] args) {
        float[] array = new float[4];
        float media = 0;
        int i;
        Scanner scan = new Scanner(System.in);

        for (i = 0; i < array.length; i++) {
            System.out.print("Digite a " + (i + 1) + "ª nota: ");
            array[i] = scan.nextFloat();
            media += array[i];
        }

        System.out.print("\nNotas: ");
        for (i = 0; i < array.length; i++) {
            System.out.print(array[i] + " | ");
        }

        System.out.println("\nMédia: " + (media / 4));
    }
}
