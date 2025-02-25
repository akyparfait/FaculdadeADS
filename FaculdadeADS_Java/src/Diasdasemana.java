import java.util.Scanner;

public class Diasdasemana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número de 1 a 7: ");
        int numero = scanner.nextInt();

        String dia = switch (numero) {
            case 1 -> "domingo";
            case 2 -> "segunda-feira";
            case 3 -> "terça-feira";
            case 4 -> "quarta-feira";
            case 5 -> "quinta-feira";
            case 6 -> "sexta-feira";
            case 7 -> "sábado";
            default -> "Número inválido! Digite um valor entre 1 e 7.";
        };

        System.out.println("Dia correspondente: " + dia);
        scanner.close();
    }
}
