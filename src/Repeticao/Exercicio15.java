package Repeticao;

import java.util.Scanner;

//A série de Fibonacci é formada pela seqüência 1,1,2,3,5,8,13,21,34,55,... Faça um programa capaz de gerar a série até o n−ésimo termo.
public class Exercicio15 {
    public static void main(String[] args) {
        int i, n, atual, anterior;
        Scanner scan = new Scanner(System.in);

        System.out.print("Quantos valores da sequencia Fibonacci devemos exibir? ");
        n = scan.nextInt();

        atual = 1;
        anterior = 0;

        for (i = 1; i <= n; i++) {
            System.out.print(atual + ", ");
            atual += anterior;
            anterior = atual - anterior;
        }
    }
}
