import java.util.Scanner;

public class Volumedaesfera {
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
        
        // Solicita o raio da esfera
        System.out.print("Digite o raio da esfera: ");
        double raio = scanner.nextDouble();
        
        // Calcula o volume da esfera
        double volume = (4.0 / 3.0) * 3.14159 * Math.pow(raio, 3);
        
        // Exibe o resultado
        System.out.println("O volume da esfera é: " + volume);
        
        scanner.close();
    }
    
}
