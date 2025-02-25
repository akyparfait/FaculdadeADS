# Algoritmo para verificar se um número é par ou ímpar

Este programa em Java solicita que o usuário digite um número inteiro e verifica se ele é **par** ou **ímpar**.

## 📌 Código em Java:

```java
import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é par.");
        } else {
            System.out.println("O número " + numero + " é ímpar.");
        }

        scanner.close();
    }
}

 ```
### Como funciona?  
1. O programa usa a classe `Scanner` para ler um número inteiro do usuário.  

2. Ele verifica se o número é divisível por 2 (`numero % 2 == 0`).  

   - Se for verdadeiro, o número é **par**.  

   - Caso contrário, é **ímpar**.  

3. O resultado é exibido no console.  

### O que é o %?
O símbolo % em Java representa o operador de módulo. Ele retorna o resto da divisão entre dois números.

```

- System.out.println(10 % 3);  
Resultado: 1 (porque 10 ÷ 3 = 3 e sobra 1)

- System.out.println(8 % 2);
Resultado: 0 (porque 8 ÷ 2 = 4 e sobra 0)

- System.out.println(15 % 4);  
Resultado: 3 (porque 15 ÷ 4 = 3 e sobra 3)



   