# Estrutura Repetitiva Enquanto (while) em Programação

## O que é a Estrutura de Repetição `while`?
A estrutura de repetição `while` é uma das formas de criar loops em programação. Ela permite que um bloco de código seja executado repetidamente enquanto uma determinada condição for verdadeira.

## Sintaxe do `while` em Java
```java
while (condicao) {
    // Bloco de código a ser repetido enquanto a condição for verdadeira
}
```

A execução ocorre da seguinte maneira:
1. A condição é avaliada antes de cada iteração do loop.
2. Se a condição for `true`, o bloco de código dentro do `while` é executado.
3. Após a execução do bloco, a condição é verificada novamente.
4. O loop continua até que a condição se torne `false`.

## Exemplo Básico
Exemplo de um programa que imprime os números de 1 a 10 usando `while`:

```java
public class ExemploWhile {
    public static void main(String[] args) {
        int numero = 1;

        while (numero <= 10) {
            System.out.println(numero);
            numero++; 
        }
    }
}
```

## Cuidados com o Loop `while`
- **Evitar loops infinitos**: Se a condição nunca for falsa, o loop nunca terminará, causando um loop infinito.
- **Modificar a variável de controle**: É essencial que, dentro do loop, a variável de controle seja alterada para que a condição possa ser satisfeita em algum momento.

Exemplo de loop infinito (evitar isso!):
```java
int numero = 1;
while (numero > 0) { 
    System.out.println(numero);
}
```

## Conclusão
O `while` é útil quando o número de repetições não é conhecido antecipadamente e depende de uma condição ser verdadeira. É uma estrutura fundamental para loops condicionais em programação.

