//Informar um preço de um produto. Se pagamento à vista calcular o desconto de 10% e
//mostrar o novo valor.. Se a venda for no cartão de crédito, realizar o desconto de 5% e
// mostrar o novo valor.

import java.util.Scanner;

public class Descontodevalor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Insira o valor do produto: ");
        Double valorproduto = scanner.nextDouble();

        System.out.printf("Insira a forma de pagamento (1- À vista, 2- Cartão de crédito)");
        Double formapagamento = scanner.nextDouble();
        
        if(formapagamento == 1){
            valorproduto *= 0.9; 
            System.out.println("A forma de pagamento escolhida foi à vista e recebeu 10% de desconto. ");

        } else if (formapagamento == 2) {
            valorproduto *= 0.95; 
            System.out.printf("A forma de pagamento escolhida foi com cartão de crédito ");
        } else {
            System.out.printf("Opção inválida! desconto não aplicado. ");
        }

        System.out.printf("O valor final do produto fica: %.2f", valorproduto);

        scanner.close();
    }
}


