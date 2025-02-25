# Escopo e Inicialização na Programação

## 📌 O que é Escopo?
O **escopo** em programação define onde uma variável pode ser acessada dentro do código. Ele determina a **visibilidade** e o **tempo de vida** da variável.

### Tipos de Escopo

1. **Escopo Global**  
   - A variável pode ser acessada de **qualquer parte do código**.
   - Em algumas linguagens, pode ser perigoso, pois pode causar conflitos inesperados.

2. **Escopo Local**  
   - A variável **só pode ser acessada dentro do bloco** onde foi declarada.
   - Muito usado dentro de funções e classes para evitar interferências externas.

3. **Escopo de Bloco**  
   - Definido por `{ }` em linguagens como Java, JavaScript e C.
   - Variáveis declaradas dentro de um bloco **não existem fora dele**.

### Exemplo de Escopo em Java

```java
public class ExemploEscopo {
    static int global = 10; // Escopo global (acessível em toda a classe)

    public static void main(String[] args) {
        int local = 5; // Escopo local (apenas dentro do método main)

        if (local > 0) {
            int bloco = 20; // Escopo de bloco (só existe dentro do if)
            System.out.println("Dentro do bloco: " + bloco);
        }

        // System.out.println(bloco); // Erro! 'bloco' não é visível aqui
        System.out.println("Variável global: " + global);
    }
}

```

## 🚀  Conclusão

- Escopo define onde uma variável pode ser usada.
- Inicialização garante que a variável tenha um valor antes de ser acessada.
- Sempre inicialize variáveis antes de usá-las para evitar erros inesperados.