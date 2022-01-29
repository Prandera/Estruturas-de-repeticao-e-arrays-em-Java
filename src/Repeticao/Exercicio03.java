package Repeticao;
/*Faça um programa que leia e valide as seguintes informações:
Nome: maior que 3 caracteres;
Idade: entre 0 e 150;
Salário: maior que zero;
Sexo: 'f' ou 'm';
Estado Civil: 's', 'c', 'v', 'd';*/

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        String nome;
        String sexo;
        String estadoCivil;
        int idade;
        float salario;
        boolean condicao = false;
        Scanner scan = new Scanner(System.in);

        //Receber e validar o nome
        do {
            System.out.println("Digite o seu Nome: ");
            nome = scan.next();
        } while (nome.length() <= 2);

        //Receber e validar o sexo
        System.out.println("Digite seu Sexo (M ou F): ");
        do {
            sexo = scan.next();
            switch (sexo) {
                case "m":
                    condicao = true;
                    break;
                case "M":
                    condicao = true;
                    break;
                case "F":
                    condicao = true;
                    break;
                case "f":
                    condicao = true;
                    break;
                default:
                    System.out.println("Sexo inválido! Tente novamente.");
                    break;
            }
        } while (condicao == false);

        //Receber e validar o Estado Civil
        do {
            System.out.println("Digite seu Estado Civil:\n(Solteiro, Casado, Viuvo ou Divorciado)");
            estadoCivil = scan.next();
        } while (!estadoCivil.equalsIgnoreCase("solteiro") &&
                !estadoCivil.equalsIgnoreCase("casado") &&
                !estadoCivil.equalsIgnoreCase("viuvo") &&
                !estadoCivil.equalsIgnoreCase("divorciado"));

        //Receber e validar a Idade
        do {
            System.out.println("Digite sua Idade: ");
            idade = scan.nextInt();
        } while (idade < 0 && idade > 150);

        //Receber e validar o Salário
        System.out.println("Digite seu Salário: ");
        do {
            salario = scan.nextFloat();
            if (salario < 0)
                System.out.println("Valor inválido! Tente novamente.");
        } while (salario < 0);

        //Printando todos os valores
        System.out.println("\nNome: " + nome
                + "\nSexo: " + sexo.toUpperCase()
                + "\nIdade: " + idade
                + "\nEstado Civil: " + estadoCivil
                + "\nSalário: R$" + salario);
    }
}
