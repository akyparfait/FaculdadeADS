import java.util.Scanner;

public class Numerodigitado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Solicita um número a um usuário
        System.out.print("Digite o primeiro número: ");
        int numero = scanner.nextInt();

        //Exibe o número Digitado
        System.out.println("Esse é o número digitado: " + numero);

        scanner.close();

    }
    
}
