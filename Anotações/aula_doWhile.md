# Estrutura de Repetição `do while`

A estrutura de repetição `do while` é uma variação do loop `while`, onde o bloco de código é executado pelo menos uma vez antes de a condição ser verificada. Isso ocorre porque a condição de parada é avaliada **após** a execução do bloco de código.

## Sintaxe Geral

A sintaxe do `do while` é a seguinte:

```c
 do {
    // Código a ser executado
 } while (condição);
```

## Funcionamento

1. O bloco de código dentro de `do` é executado **ao menos uma vez**.
2. Depois da execução, a **condição** dentro de `while` é avaliada.
3. Se a condição for **verdadeira**, o loop continua a ser executado.
4. Se a condição for **falsa**, o loop é encerrado.

## Exemplos em Diferentes Linguagens

### Java
```java
public class Main {
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.println("Número: " + i);
            i++;
        } while (i <= 5);
    }
}
```
**Saída:**
```
Número: 1
Número: 2
Número: 3
Número: 4
Número: 5
```

### JavaScript
```javascript
let i = 1;
do {
    console.log("Número: " + i);
    i++;
} while (i <= 5);
```

### C
```c
#include <stdio.h>

int main() {
    int i = 1;
    do {
        printf("Número: %d\n", i);
        i++;
    } while (i <= 5);
    return 0;
}
```

### Python (Simulação, pois Python não possui `do while` nativo)
```python
i = 1
while True:
    print(f"Número: {i}")
    i += 1
    if not (i <= 5):
        break
```

## Diferença entre `do while` e `while`

| Característica    | `do while`                        | `while`                        |
|------------------|---------------------------------|------------------------------|
| Execução mínima | Pelo menos uma vez             | Pode nunca ser executado     |
| Local da condição | No final do loop               | No início do loop            |

## Quando Usar `do while`?
- Quando é necessário **garantir** que o bloco de código seja executado pelo menos uma vez.
- Quando a condição de repetição **só pode ser verificada após** a primeira iteração.

O `do while` é útil para casos como menus interativos, onde o programa precisa exibir a interface pelo menos uma vez antes de processar a entrada do usuário.

