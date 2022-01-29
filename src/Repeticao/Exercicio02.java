package Repeticao;

//Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao nome do usuário, mostrando uma mensagem de erro e voltando a pedir as informações.

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        String usuario;
        String senha;
        boolean condicao = false;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Por favor, digite o usuario: ");
            usuario = scan.next();
            System.out.println("Por favor, digite a senha: ");
            senha = scan.next();
            if (senha.equals(usuario))
                System.out.println("Usuario e Senhas iguais! Por favor, tente novamente.");
            else
                condicao = true;
        } while (condicao == false);

        System.out.println("Usuario: " + usuario + "\nSenha: " + senha);
    }
}
