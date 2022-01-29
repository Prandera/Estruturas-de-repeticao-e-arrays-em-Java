package Repeticao;

//Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor seja inválido e continue pedindo até que o usuário informe um valor válido.

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean condicao = false;
        double nota;
        System.out.println("Por favor, digite uma nota: ");

        do {
            nota = scan.nextDouble();
            if (nota >= 0 && nota <= 10)
                condicao = true;
            else
                System.out.println("Valor inválido! Tente novamente.");
        } while (condicao == false);


        System.out.println("Valor da nota: " + nota);
    }
}