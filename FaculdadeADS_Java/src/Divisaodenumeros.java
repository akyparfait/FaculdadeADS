import java.util.Scanner;

public class Divisaodenumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Digite o dividendo: ");
        float x = scanner.nextInt();

        System.out.printf("Digite o divisor: ");
        float y = scanner.nextInt();

        if(y == 0){
            System.out.printf("Não é possível dividir por 0");
        }else{
            float resultado = x / y;
            System.out.printf("O resultado da divisão entre\n %.2f / %.2f = %.2f\n", x, y, resultado);
        }
        scanner.close();

    }
}
