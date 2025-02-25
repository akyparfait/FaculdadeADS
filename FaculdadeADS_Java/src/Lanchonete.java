import java.util.Scanner;

public class Lanchonete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o código do item: ");
        int codigo = scanner.nextInt();
        System.out.print("Digite a quantidade: ");
        int quantidade = scanner.nextInt();

        double preco;

        switch (codigo) {
            case 100 -> preco = 1.20;
            case 101 -> preco = 1.30;
            case 102 -> preco = 1.50;
            case 103 -> preco = 1.20;
            case 104 -> preco = 1.30;
            case 105 -> preco = 1.00;
            default -> {
                System.out.println("Código inválido!");
                scanner.close();
                return;
            }
        }

        double total = preco * quantidade;
        System.out.printf("Total: R$ %.2f%n", total);

        scanner.close();
    }
}

