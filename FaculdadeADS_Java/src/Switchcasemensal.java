import java.util.Scanner;

public class Switchcasemensal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número entre 1 e 12: ");
        int numero = scanner.nextInt();

        String mes;
        mes = switch (numero) {
            case 1 -> "Janeiro";
            case 2 -> "Fevereiro";
            case 3 -> "Março";
            case 4 -> "Abril";
            case 5 -> "Maio";
            case 6 -> "Junho";
            case 7 -> "Julho";
            case 8 -> "Agosto";
            case 9 -> "Setembro";
            case 10 -> "Outubro";
            case 11 -> "Novembro";
            case 12 -> "Dezembro";
            default -> "Número inválido! Digite um valor entre 1 e 12.";
        };

        System.out.println("Mês correspondente: " + mes);
        scanner.close();
    }
}
