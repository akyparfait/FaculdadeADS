import java.time.Year;
import java.util.Scanner;

public class CalcularIdade {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o ano do seu nascimento: ");
        int anoNascimento = scanner.nextInt();

        int anoAtual = Year.now().getValue();
        
        int idade = anoAtual - anoNascimento;
        System.out.println("Você tem " + idade + " anos.");
        
        scanner.close();
    }
}
