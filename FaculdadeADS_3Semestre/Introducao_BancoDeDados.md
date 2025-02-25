# Conceito

## Banco de dados: É uma coleção de dados persistentes utilizada pelos sistemas de aplicação de uma empresa;

Conjunto: É uma coleção;

Grupo lógico de arquivos relacionados entre si;

Envolvemos um aspecto hierárquico envolvido na organização de um banco de dados, indo desde o bit que se agrupa em byte, por vez
compõem campos;

Banco de dados: É um conjunto integrado de elementos ou de registros de dados que estão relacionados entre si de maneira lógica 
em formato de tabela ou outro.

Diagrama entidade Relacional (DER)

Modelo conceitual ( é a lógica que há por trás )
Modelo lógico ( Método de desenvolvimento )
Modelo físico ( Onde se armazena ) [ vai fazer o armazenamento fisicamente ]


Usuários = Nível externo (mapeamento externo/conceitual)
Esquema conceitual = Nível médio

Evolução dos BDs

Antes da década de 60 = Feitos em cartões - era lido por sistemas opticos; 

Década de 60 = surgimento da IBM e feitos como uma árvore genealógica (FOI O *BOOM* DE DADOS HIERÁRQUICOS);

Década de 70 = Modelo relacional, R como primeiro banco de dados relacional;

Década de 80 = Modelos hierárquicos diminuiram;
Criou SQL (Structured Query Language) criava dados de uma tabela

Anos 2000 = MySQL é comprado pela SUN 
     2009   SUN é comprada pela Oracle
     2009   Lançamento do MariaDB
     2009   Lançamento do MongoDB

Sistemas de Arquivos (Antes dos bancos de dados formais)
Eram armazenados em fitas magnéticas ou discos
Criava e gerenciava os seus próprios arquivos e aconteciam vários erros como redundância, inconsistência e dificuldade de acesso.
Redundância = repetição desnecessária de dados.

Modelos hierárquicos e em redes

Diferença
Hierárquico ( registro em linha que possui filhos ) 
Em rede ( só precisa de um registro para os dados, pode ter mais de um pai)

SQL (modelo relacional)
[ modelo relacional sempre terá entidades que fazem relacionamentos quais colocam atributos e podem fazer ''emições'' 
para identificadores ]

Cardinalidade: Define os relacionamentos entre entidades de uma base de dados (ele ameaçou colocar na prova)
-> Um para Um (1:1);
-> Um para muitos (1:N);
-> muitos para muitos (N:N);
-> zero ou um para muitos (0:1:N);

Organização em linhas
Chave estrangeira = vai para o outro ambiente (por isso o nome);

Cúpula ou registro (registrar cada componente vai ser uma nova linha ou no caso novo registro cada linha se refere a atributos;
desse registro)

Cada atributo registrado será um registro mas não deixa de ser atributo;

A junção disso tudo é instância;

Primeira linha de cada tabela será o campo;

escalabilidade Vertical = aumenta capacidade de máquina.

NoSQL (Não relacional)

Foco em escalabilidade horizontal = Tudo em um banco;


Princípio ACID

A - Atomicidade ( É tudo ou nada se apagar um pedido anterior remove os próximos )
C - Consistência ( Só armazena os dados depois da conclusão para não ter problemas )
I - Isolamento ( O dados estão bem organizados e isolados sem repetição )
D - Durabilidade ( O dado não pode sumir )