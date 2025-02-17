import java.util.Scanner;

public class Velocidadeprojetil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a distância percorrida (km): ");
        double distanciaKm = scanner.nextDouble();
        
        System.out.print("Digite o tempo gasto (min): ");
        double tempoMin = scanner.nextDouble();

        double velocidade = (distanciaKm * 1000) / (tempoMin * 60);
        
        System.out.println("A velocidade do projétil é: " + velocidade + " m/s");
        
        scanner.close();
    }
    
}
