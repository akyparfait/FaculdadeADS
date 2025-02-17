// Crie um programa que recebe uma temperatura em graus Celsius e apresentá-la convertida
// em graus Fahrenheit. A fórmula de conversão é F = (9 * C + 160) / 5, sendo F a temperatura
// em Fahrenheit e C a temperatura em Celsius.

import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o valor de graus em Celsius: ");
        double Celsius = scanner.nextDouble();

        double Fahrenheit = (9 * Celsius + 160) / 5;

        System.out.println("O valor de Fahrenheit é: " + Fahrenheit);

        scanner.close();

    }
}

