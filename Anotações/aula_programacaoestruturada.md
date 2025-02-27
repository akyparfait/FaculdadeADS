# Programação  Estruturada 𓆩♡𓆪

## Estrutura de dados

- Refere-se à maneira como os dados são organizados e armazenados em um computador. É fundamental para a eficiência dos algoritmos e para a resolução de problemas computacionais complexos.

## **<font color=lightpink>Definição ₍ ᐢ.ˬ.ᐢ₎˚୨୧</font>**

- A estrutura de dados é uma forma de organizar e armazenar dados de modo e facilitar o acesso e a manipulação dessas informações.

---

### Tipos de estrutura de dados:

#### ( vai cair na provinha)

1. Arrays = Coleção de elementos do mesmo tipo;
2. Listas = Elementos encadeados;
3. Pilhas ( Stacks ) = Usado em tarefas como controle de chamadas de funções;
4. Filas ( Queues ) = Usado em simulações e gerenciamento de tarefas;

<font color=lightgreen>5. Árvores</font> = Usada em estruturas de dados complexas e em algortitmos de busca.

> **Árvores:** São Muito utilizada para parte de busca

6. Grafos: Conjunto de vértices conectados por arestas, usado para representar redes, mapas e relações entre objetos.

<font color=lightgreen>7. Tabelas Hash</font> Estrutura que mapeia chaves para valores.

> **Hash:** Coluna de banco de dados que criptografa uma senha.

8. Filas de prioridade: Estrutura que mantém elementos com base em sua prioridade.

- Um dado está dentro de uma busca logo é tratado como preferência.

---

## Memória volátil

- A memória volátil roda junto com o sistema, é acumulativo, bancos no cycle são melhores.

# Arrays e Matrizes

> Indice em array sempre se inicia em 0


| 1  | 2  | 3  | 4  |
| -- | -- | -- | -- |
|    |    |    |    |
| 48 | 36 | 02 | 12 |
|    |    |    |    |
|    |    |    |    |

- Por isso aqui se dá por 5 e não 4
- Arrays são estruturas de dados que aramazem coleções de elementos do mesmo tipo, acessíveis por um indíce único.
- Arrays são usados para armazenar vários valores do mesmo tipo em uma lista ordenada, onde cada valor é identificado por um índice numérico.
- Matrizes são como arrays multidimensionais, ou seja, são usadas para armazenar outros valores.

![1740573538626](images/aula_programacaoestruturada/1740573538626.png)

```java
// Exemplo:
public class Casamento {
    public static void main(String[] args){
        // ...

        String convidados[] = new String[5];
        convidados[0] = "Fulano";
        convidados[1] = "Ciclano";
        convidados[2] = "Beltrano";
        convidados[3] = "Zeca";
        convidados[4] = "Pagodinho";

        for (int i = 0; i < convidados.lenght; i++) {
            System.out.println("Convidado: " + convidados[i]);
        }

    }
}

```

## Alocação de memória

- Efeito sanfona não acontece em lista fixa
- O zero é responsável por preencher uma informação;
- Se o zero estiver vazio puxa pois o início nunca deve ser vazio; (pode cair na provinha);
- Na dinâmica pode se colocar o índice 4;
- Dinâmica pode botar todo mundo pra dentro até lotar;
- Vale ressaltar que nem todas as linguagens de programação usam índices baseados em 0 para arrays, algumas usam base 1 ou outras convenções;
- Se todos os campos forem preenchidos dentro da memória a execução será mais rápida;
- O tamanho do índice pode ser variável ou fixo.
