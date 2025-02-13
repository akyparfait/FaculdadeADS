import java.util.Scanner;

public class Mediadenumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Digite a primeira nota: ");
        Double p1 = scanner.nextDouble();

        System.out.printf("Digite a segunda nota: ");
        Double p2 = scanner.nextDouble();

        System.out.printf("Digite a terceira nota: ");
        Double p3 = scanner.nextDouble();

        Double media = (p1 + p2 + p3) / 3;

        System.out.printf("A média das notas é: %.2f", media);

        scanner.close();
        
    }
}
