import java.util.Scanner;

public class SucessorAntecessor {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor inteiro: ");
        int numero = scanner.nextInt();

        int antecessor = numero - 1;
        int sucessor = numero + 1;

        System.out.println("O valor do Antecessor é: " + antecessor);
        System.out.println("O valor do Sucessor é: " + sucessor);

        scanner.close();

    }
}
