### Como Transformar um Número Decimal para Binário

Para converter um número **decimal** para **binário**, usamos o processo de divisões sucessivas por **2**. A cada divisão, anotamos o **resto** da operação. Esse **resto** será **0** ou **1**, e esses valores representam os bits do número binário.

#### Passos:
1. Divida o número por 2.
2. Anote o **resto** (0 ou 1).
3. Use o **quociente** (resultado da divisão) para dividir novamente por 2.
4. Repita até o quociente ser **0**.
5. O número binário será a leitura dos restos de baixo para cima.

#### Exemplo:
Para converter o número **23**:
- 23 ÷ 2 = 11 (resto 1)
- 11 ÷ 2 = 5 (resto 1)
- 5 ÷ 2 = 2 (resto 1)
- 2 ÷ 2 = 1 (resto 0)
- 1 ÷ 2 = 0 (resto 1)

Lendo os restos de baixo para cima: **10111**.

Portanto, **23 (decimal)** = **10111 (binário)**.


# Operadores Bitwise

Os **operadores bitwise** (ou **operadores binários**) são usados para realizar operações diretamente nos **bits** de números inteiros. Eles são muito úteis quando trabalhamos com manipulação de dados em baixo nível, como em programação de sistemas ou criptografia.

#### Tipos de Operadores Bitwise:

1. **AND (`&`)**:
   - Compara os bits de dois números e retorna **1** apenas quando ambos os bits são **1**.
   - Exemplo: `5 & 3` → **0101 & 0011** → **0001** (1 em decimal)

2. **OR (`|`)**:
   - Compara os bits de dois números e retorna **1** quando pelo menos um dos bits é **1**.
   - Exemplo: `5 | 3` → **0101 | 0011** → **0111** (7 em decimal)

3. **XOR (`^`)**:
   - Compara os bits de dois números e retorna **1** quando os bits são diferentes.
   - Exemplo: `5 ^ 3` → **0101 ^ 0011** → **0110** (6 em decimal)

4. **NOT (`~`)**:
   - Inverte todos os bits do número (também chamado de **complemento de 1**).
   - Exemplo: `~5` → **~0101** → **1010** (dependendo da arquitetura do computador, o valor resultante pode variar, mas no caso de 5 é -6 em decimal devido ao uso de complemento de 2 para representar números negativos).

5. **Shift à Esquerda (`<<`)**:
   - Desloca os bits de um número para a esquerda, preenchendo com **0** à direita. Cada deslocamento à esquerda equivale a multiplicar por 2.
   - Exemplo: `5 << 1` → **0101 << 1** → **1010** (10 em decimal)

6. **Shift à Direita (`>>`)**:
   - Desloca os bits de um número para a direita, descartando o bit mais à direita. Cada deslocamento à direita equivale a dividir por 2.
   - Exemplo: `5 >> 1` → **0101 >> 1** → **0010** (2 em decimal)

#### Exemplos Práticos:

- **5 & 3**:
  - 5 em binário: **0101**
  - 3 em binário: **0011**
  - Resultado: **0001** (1 em decimal)

- **5 | 3**:
  - 5 em binário: **0101**
  - 3 em binário: **0011**
  - Resultado: **0111** (7 em decimal)

#### Aplicações:
Operadores bitwise são comumente usados para:
- **Máscaras de bits**: Modificar ou verificar bits específicos de um número.
- **Operações de baixo nível**: Como manipulação de hardware ou otimização de desempenho.
- **Criptografia**: Para codificar ou decodificar dados.

Exemplo:

```java
public class BitwiseExample {
    public static void main(String[] args) {
        int n1 = 5;  // 0101 em binário
        int n2 = 3;  // 0011 em binário

        // Operação bitwise AND
        System.out.println("Resultado de n1 & n2: " + (n1 & n2));
    }
}
