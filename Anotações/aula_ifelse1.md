# Estrutura Condicional (if-else) em Programação

## Introdução
A estrutura condicional `if-else` é utilizada em programação para executar diferentes blocos de código com base em uma condição lógica. É uma das estruturas fundamentais de controle de fluxo.

## Sintaxe Básica

### Em Python:
```python
if condição:
    # Código executado se a condição for verdadeira
else:
    # Código executado se a condição for falsa
```

### Em Java:
```java
if (condicao) {
    // Código executado se a condição for verdadeira
} else {
    // Código executado se a condição for falsa
}
```

## Estruturas Condicionais Encadeadas
Podemos utilizar múltiplas condições com `elif` (Python) ou `else if` (Java, C, etc.).

### Exemplo em Python:
```python
if x > 10:
    print("Maior que 10")
elif x > 5:
    print("Maior que 5 e menor ou igual a 10")
else:
    print("Menor ou igual a 5")
```

### Exemplo em Java:
```java
if (x > 10) {
    System.out.println("Maior que 10");
} else if (x > 5) {
    System.out.println("Maior que 5 e menor ou igual a 10");
} else {
    System.out.println("Menor ou igual a 5");
}
```

## Operadores Relacionais e Lógicos
As condições podem envolver operadores:

- **Relacionais**: `>`, `<`, `>=`, `<=`, `==`, `!=`
- **Lógicos**: `and`, `or`, `not` (Python) ou `&&`, `||`, `!` (Java, C, etc.)

### Exemplo com operadores lógicos:
```python
if idade >= 18 and tem_habilitacao:
    print("Pode dirigir")
```

```java
if (idade >= 18 && temHabilitacao) {
    System.out.println("Pode dirigir");
}
```

## Conclusão
A estrutura condicional `if-else` permite que um programa tome decisões baseadas em condições específicas. Ela é essencial para a lógica de qualquer aplicação e pode ser combinada com outras estruturas para criar fluxos de controle mais complexos.

