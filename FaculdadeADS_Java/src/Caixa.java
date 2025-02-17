//Elaborar um programa que calcule e apresente o valor do volume de uma caixa retangular,
// utilizando a fórmula VOLUME = COMPRIMENTO * LARGURA* ALTURA.
import java.util.Scanner;

public class Caixa {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite o valor do comprimento da caixa");
        float comprimento = scanner.nextFloat();

        System.out.println("digite o valor da largura da caixa");
        float largura = scanner.nextFloat();

        System.out.println("digite o valor da altura da caixa");
        float altura = scanner.nextFloat();

        float volume = (comprimento * largura * altura);

        System.out.println("O volume da caixa retangular é: " + volume);

        scanner.close();

    }
}
