import java.math.BigInteger;
import java.util.Scanner;

public class PotenciaCalcular {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a base (inteiro): ");
        BigInteger base = scanner.nextBigInteger();

        System.out.print("Digite o expoente (inteiro): ");
        int expoente = scanner.nextInt();

        BigInteger resultado = base.pow(expoente);

        System.out.println("Resultado: " + base + "^" + expoente + " = " + resultado);

        scanner.close();

    }
    
}
