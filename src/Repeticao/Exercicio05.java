package Repeticao;

//Altere o programa anterior permitindo ao usuário informar as populações e as taxas de crescimento iniciais. Valide a entrada e permita repetir a operação.

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        double paisA, paisB, indiceA, indiceB;
        Scanner scan = new Scanner(System.in);
        int i = 0;

        System.out.println("\nInsira os valores para calcularmos quantos anos serão necessários para a " +
                "população do Pais A ultrapassar a população do Pais B");

        do {
            System.out.print("Digite a população do País A: ");
            paisA = scan.nextFloat();
            if (paisA <= 0)
                System.out.println("Valor inválido!");
        } while (paisA <= 0);

        do {
            System.out.print("Digite a população do País B: ");
            paisB = scan.nextFloat();
            if (paisB <= paisA)
                System.out.println("Valor inválido!");
        } while (paisB <= paisA);

        do {
            System.out.print("Digite a porcentagem da Taxa de Crescimento do País A: ");
            indiceA = scan.nextFloat() / 100;
            if (indiceA <= 0)
                System.out.println("Valor inválido!");
        } while (indiceA <= 0);

        do {
            System.out.print("Digite a porcentagem da Taxa de Crescimento do País B: ");
            indiceB = scan.nextFloat() / 100;
            if (indiceB >= indiceA)
                System.out.println("Valor inválido! A Taxa deve ser menor que a do País A!");
            else if (indiceB <= 0)
                System.out.println("Valor inválido! A Taxa deve ser maior que zero!");
        } while (indiceB >= indiceA || indiceB <= 0);

        while (paisA < paisB) {
            paisA += paisA * indiceA;
            paisB += paisB * indiceB;
            i++;
        }

        System.out.println("População A: " + paisA + "\nPopulação B: " + paisB);
        System.out.println("Serão necessários " + i + " anos para que A ultrapasse B.");
    }
}
