package Repeticao;

//Supondo que a população de um país A seja da ordem de 80000 habitantes com uma taxa anual de crescimento de 3% e que
// a população de B seja 200000 habitantes com uma//taxa de crescimento de 1.5%. Faça um programa que calcule e escreva
// o número de anos necessários para que a população do país A ultrapasse ou iguale a população do país B, mantidas as
// taxas de crescimento.
public class Exercicio04 {
    public static void main(String[] args) {
        float paisA = 80000F;
        float paisB = 200000F;
        int i = 0;

        while (paisA < paisB) {
            paisA += paisA * 0.03;
            paisB += paisB * 0.015;
            i++;
        }

        System.out.println("População A: " + paisA + "\nPopulação B: " + paisB);
        System.out.println("Serão necessários " + i + " anos para que A ultrapasse B.");
    }
}
