# Tabela Verdade e Expressões Lógicas em Programação

## Introdução
A **tabela verdade** é uma ferramenta usada na lógica para determinar o resultado de expressões booleanas. Em programação, expressões lógicas são amplamente utilizadas em estruturas condicionais, como `if`, `while` e operadores lógicos.

## Operadores Lógicos Básicos
Em muitas linguagens de programação, os operadores lógicos são:

- **AND (E)**: `&&` (Java, JavaScript, C, etc.) ou `and` (Python)
- **OR (OU)**: `||` (Java, JavaScript, C, etc.) ou `or` (Python)
- **NOT (NÃO)**: `!` (Java, JavaScript, C, etc.) ou `not` (Python)

## Tabelas Verdade dos Operadores Lógicos

### Operador AND (`&&` ou `and`)
| A | B | A && B |
|---|---|--------|
| V | V | V      |
| V | F | F      |
| F | V | F      |
| F | F | F      |

O operador `AND` retorna verdadeiro somente se ambas as expressões forem verdadeiras.

### Operador OR (`||` ou `or`)
| A | B | A || B |
|---|---|--------|
| V | V | V      |
| V | F | V      |
| F | V | V      |
| F | F | F      |

O operador `OR` retorna verdadeiro se pelo menos uma das expressões for verdadeira.

### Operador NOT (`!` ou `not`)
| A | !A |
|---|----|
| V | F  |
| F | V  |

O operador `NOT` inverte o valor da expressão lógica.

## Exemplo em Código
Em Python:
```python
A = True
B = False

print(A and B)  # Falso
print(A or B)   # Verdadeiro
print(not A)    # Falso
```

Em JavaScript:
```javascript
let A = true;
let B = false;

console.log(A && B);  // Falso
console.log(A || B);  // Verdadeiro
console.log(!A);      // Falso
```

## Conclusão
A tabela verdade ajuda a entender como os operadores lógicos funcionam e a prever os resultados de expressões booleanas em programação. Isso é essencial para o controle de fluxo e desenvolvimento de algoritmos eficientes.

