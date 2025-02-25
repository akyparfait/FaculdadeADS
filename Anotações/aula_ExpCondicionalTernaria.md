
# Expressão Condicional Ternária

A expressão condicional ternária é uma maneira compacta de escrever uma estrutura condicional, similar ao `if-else`, mas em uma única linha de código. Ela é bastante usada quando queremos simplificar uma expressão condicional simples e torná-la mais legível. A sintaxe da expressão ternária é a seguinte:

```javascript
condição ? expressão1 : expressão2;
```

### Componentes da expressão ternária

1. **condição**: A condição que será avaliada. Pode ser qualquer expressão que seja retornada como `true` ou `false`.
2. **expressão1**: O valor ou expressão que será retornado se a condição for verdadeira (`true`).
3. **expressão2**: O valor ou expressão que será retornado se a condição for falsa (`false`).

### Funcionamento

Quando a condição é avaliada:

- Se for verdadeira (`true`), **expressão1** é executada e seu valor é retornado.
- Se for falsa (`false`), **expressão2** é executada e seu valor é retornado.

### Exemplo Básico

```javascript
let idade = 20;
let resultado = (idade >= 18) ? 'Adulto' : 'Menor';
console.log(resultado);  // Saída: 'Adulto'
```

### Explicação do Exemplo

Neste exemplo, a condição `(idade >= 18)` é avaliada. Como `idade` é 20, que é maior que 18, a condição é verdadeira, então a expressão `'Adulto'` é retornada e atribuída à variável `resultado`.

Se a idade fosse menor que 18, a expressão `'Menor'` seria retornada.

### Vantagens de Usar a Expressão Ternária

- **Sintaxe compacta**: A principal vantagem da expressão ternária é a sua concisão. Ela permite que estruturas condicionais simples sejam escritas em uma linha.
- **Legibilidade**: Em casos simples, o código fica mais claro e fácil de ler.
  
### Exemplo de Usos Mais Complexos

Embora a expressão ternária seja compacta, pode se tornar difícil de ler se for usada em situações complexas. Aqui está um exemplo:

```javascript
let nota = 7;
let resultado = (nota >= 5) ? ((nota >= 7) ? 'Aprovado com Distinção' : 'Aprovado') : 'Reprovado';
console.log(resultado);  // Saída: 'Aprovado'
```

Neste caso, temos uma expressão ternária dentro de outra. Embora compacta, ela pode ser difícil de entender à primeira vista, o que pode diminuir a clareza do código.

### Comparação com a Estrutura `if-else`

A estrutura condicional `if-else` pode ser mais verbosa, mas às vezes é mais fácil de entender, especialmente em condições complexas. Aqui está o exemplo anterior usando `if-else`:

```javascript
let nota = 7;
let resultado;

if (nota >= 5) {
  if (nota >= 7) {
    resultado = 'Aprovado com Distinção';
  } else {
    resultado = 'Aprovado';
  }
} else {
  resultado = 'Reprovado';
}

console.log(resultado);  // Saída: 'Aprovado'
```

A expressão ternária é mais compacta, mas, para condições mais complexas, o `if-else` pode ser mais legível.

### Conclusão

A expressão condicional ternária é uma excelente ferramenta para simplificar decisões em código, mas deve ser usada com sabedoria. Para condições simples e diretas, ela pode aumentar a legibilidade e reduzir a quantidade de código. No entanto, em casos mais complexos, é importante avaliar se a clareza do código não será comprometida.

---