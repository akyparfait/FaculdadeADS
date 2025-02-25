# Conceito

## Banco de Dados

- É uma coleção de dados persistentes utilizada pelos sistemas de aplicação de uma empresa.
- **Conjunto**: É uma coleção.
- **Grupo lógico de arquivos** relacionados entre si.
- Envolve um aspecto hierárquico na organização de um banco de dados, desde o bit que se agrupa em byte, que por sua vez compõem campos.
- **Banco de dados**: É um conjunto integrado de elementos ou de registros de dados que estão relacionados entre si de maneira lógica em formato de tabela ou outro.

## Diagrama Entidade-Relacional (DER)

- **Modelo conceitual**: A lógica que há por trás.
- **Modelo lógico**: Método de desenvolvimento.
- **Modelo físico**: Onde se armazena fisicamente os dados.

## Níveis de Usuários

- **Usuários** = Nível externo (mapeamento externo/conceitual).
- **Esquema conceitual** = Nível médio.

## Evolução dos Bancos de Dados

- **Antes da década de 60**: Feitos em cartões e lidos por sistemas ópticos.
- **Década de 60**: Surgimento da IBM, estrutura organizacional semelhante a uma árvore genealógica (**boom dos dados hierárquicos**).
- **Década de 70**: Introdução do modelo relacional, sendo o **R** o primeiro banco de dados relacional.
- **Década de 80**: Modelos hierárquicos diminuíram; criação da linguagem **SQL (Structured Query Language)**.
- **Anos 2000**: 
  - **MySQL** é comprado pela **SUN**.
  - **2009**: **SUN** é comprada pela **Oracle**.
  - **2009**: Lançamento do **MariaDB**.
  - **2009**: Lançamento do **MongoDB**.

## Sistemas de Arquivos (Antes dos Bancos de Dados Formais)

- Eram armazenados em fitas magnéticas ou discos.
- Cada sistema criava e gerenciava seus próprios arquivos.
- Problemas como **redundância**, **inconsistência** e **dificuldade de acesso** eram comuns.
  - **Redundância**: Repetição desnecessária de dados.

## Modelos Hierárquicos e em Redes

### Diferença:
- **Hierárquico**: Registro em linha que possui filhos.
- **Em rede**: Pode ter mais de um pai para os registros.

## SQL (Modelo Relacional)

- O modelo relacional sempre terá **entidades** que fazem **relacionamentos** e possuem **atributos**.
- Cardinalidade: Define os relacionamentos entre entidades de um banco de dados.
  - **Um para Um (1:1)**.
  - **Um para Muitos (1:N)**.
  - **Muitos para Muitos (N:N)**.
  - **Zero ou Um para Muitos (0:1:N)**.
- Organização em linhas.
- **Chave estrangeira**: Referencia outro ambiente.
- **Registro**: Cada componente será uma nova linha, que representa atributos desse registro.
- A junção disso tudo forma a **instância**.
- A primeira linha de cada tabela será o **campo**.

## Escalabilidade

- **Escalabilidade Vertical**: Aumenta a capacidade da máquina.
- **NoSQL (Não relacional)**: Foco em **escalabilidade horizontal**, tudo armazenado em um único banco.

## Princípio ACID

- **A - Atomicidade**: Tudo ou nada; se apagar um pedido anterior, remove os próximos.
- **C - Consistência**: Só armazena os dados depois da conclusão para evitar problemas.
- **I - Isolamento**: Os dados estão bem organizados e isolados sem repetição.
- **D - Durabilidade**: O dado não pode sumir.

