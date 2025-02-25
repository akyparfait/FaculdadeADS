# Sintaxe opcional - switch-case

O `switch-case` é uma estrutura de controle de fluxo utilizada para simplificar a tomada de decisão baseada em um valor específico. Ele pode substituir sequências longas de `if-else`, tornando o código mais organizado e legível.

## Sintaxe Padrão

A sintaxe básica do `switch-case` em Java é a seguinte:

```java
switch (expressao) {
    case valor1:
        // Código a ser executado
        break;
    case valor2:
        // Código a ser executado
        break;
    default:
        // Código a ser executado caso nenhum caso corresponda
}
```

### Explicação:
- `switch (expressao)`: A expressão é avaliada e comparada com os valores dos `case`.
- `case valor:`: Se a expressão corresponder ao valor especificado, o bloco de código associado será executado.
- `break;`: Impede que a execução continue nos próximos casos.
- `default:` (opcional): Define um bloco de código a ser executado se nenhum `case` for correspondente.

## Sintaxe Alternativa: Switch Expressions (Java 12+)

A partir do Java 12, a estrutura `switch` pode ser usada de forma mais concisa e funcional, eliminando a necessidade do `break`.

```java
int numero = 2;
String resultado = switch (numero) {
    case 1 -> "Um";
    case 2 -> "Dois";
    case 3 -> "Três";
    default -> "Outro";
};
```

### Vantagens dessa sintaxe:
- Uso da seta (`->`) para definir os blocos de código, reduzindo a verbosidade.
- Permite que `switch` retorne um valor diretamente para uma variável.
- Maior segurança contra quedas acidentais entre `case` (fall-through).

## Exemplo Completo

```java
public class ExemploSwitch {
    public static void main(String[] args) {
        int dia = 3;
        
        String nomeDia = switch (dia) {
            case 1 -> "Domingo";
            case 2 -> "Segunda-feira";
            case 3 -> "Terça-feira";
            case 4 -> "Quarta-feira";
            case 5 -> "Quinta-feira";
            case 6 -> "Sexta-feira";
            case 7 -> "Sábado";
            default -> "Dia inválido";
        };
        
        System.out.println("O dia escolhido foi: " + nomeDia);
    }
}
```

## Conclusão
A sintaxe tradicional do `switch-case` é útil para tomadas de decisão baseadas em valores fixos. No entanto, a nova sintaxe introduzida no Java 12 torna o código mais limpo e funcional, reduzindo a necessidade de `break` e permitindo a atribuição direta de valores.

