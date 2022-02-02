package Array;

import java.util.Scanner;

//Faça um Programa que leia 20 números inteiros e armazene-os num vetor. Armazene os números pares no vetor PAR e os números IMPARES no vetor impar. Imprima os três vetores.
public class Exercicio05 {
    public static void main(String[] args) {

        //INCOMPLETO!Não sei como identificar um espaço null pois o vetor de int coloca automaticamente o 0, deixando "impossivel" de saber se é um 0 de null ou um 0 do usuário.

        //Os numeros fornecidos pelo usuario podem ser todos impares ou todos pares, por isso os dois vetores possuem o mesmo tamanho que o vetor principal.
        int[] array = new int[20], par = new int[20], impar = new int[20];
        int i;
        Scanner scan = new Scanner(System.in);

        System.out.println("Para que esse programa funcione, os números digitados devem ser MAIOR ou IGUAL a 1.");
        for (i = 0; i < array.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            array[i] = scan.nextInt();
        }

        for (i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0)
                par[i] = array[i];
            else
                impar[i] = array[i];
        }

        System.out.print("\nArray PRINCIPAL: ");
        for (int vetor : array) {
            System.out.print(vetor + " | ");
        }

        System.out.print("\nArray PAR: ");
        for (i = 0; i < par.length; i++) {
            if (par[i] != 0)
                System.out.print(par[i] + " | ");
        }

        System.out.print("\nArray IMPAR: ");
        for (i = 0; i < impar.length; i++) {
            if (impar[i] != 0)
                System.out.print(impar[i] + " | ");
        }
    }
}
