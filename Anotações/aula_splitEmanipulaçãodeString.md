# Operação `split` e Manipulação de Strings em Java

## Operação `split`

A operação `split` em Java é usada para dividir uma string com base em um delimitador especificado. Ela retorna um array de substrings.

### Exemplo de uso:

```java
public class SplitExample {
    public static void main(String[] args) {
        String frase = "Java,Python,JavaScript";
        String[] palavras = frase.split(",");
        
        for (String palavra : palavras) {
            System.out.println(palavra);
        }
    }
}
```

### Saída esperada:
```
Java
Python
JavaScript
```

---

## Manipulação de Strings em Java

### Código exemplo:
```java
public class testedestring {
    public static void main(String[] args) {
        
        String original = "abcde FGHIJ ABC abc DEFG   ";

        String s01 = original.toLowerCase(); // Converte para letras minúsculas
        String s02 = original.toUpperCase(); // Converte para letras maiúsculas
        String s03 = original.trim(); // Remove espaços em branco das extremidades
        String s04 = original.substring(2); // Cria uma substring a partir do índice 2
        String s05 = original.substring(2, 9); // Cria uma substring do índice 2 ao 9
        String s06 = original.replace('a', 'x'); // Substitui 'a' por 'x'
        String s07 = original.replace("abc", "xy"); // Substitui "abc" por "xy"
        int i = original.indexOf("bc"); // Retorna o índice da primeira ocorrência de "bc"
        int j = original.lastIndexOf("bc"); // Retorna o índice da última ocorrência de "bc"

        System.out.println("Original: -" + s01 + "-");
        System.out.println("ToLowerCase: -" + s02 + "-");
        System.out.println("trim: -" + s03 + "-");
        System.out.println("substring(2): -" + s04 + "-");
        System.out.println("substring(2, 9): -" + s05 + "-");
        System.out.println("replace('a', 'x'): -" + s06 + "-");
        System.out.println("replace('abc', 'xy'): -" + s07 + "-");
        System.out.println("Index of 'bc': " + i);
        System.out.println("Last index of 'bc': " + j);
    }
}
```

### Explicação:

- `toLowerCase()` → Converte toda a string para letras minúsculas.
- `toUpperCase()` → Converte toda a string para letras maiúsculas.
- `trim()` → Remove espaços em branco no início e no fim da string.
- `substring(int beginIndex)` → Retorna a parte da string a partir do índice especificado.
- `substring(int beginIndex, int endIndex)` → Retorna a substring do intervalo especificado.
- `replace(char oldChar, char newChar)` → Substitui todos os caracteres `oldChar` por `newChar`.
- `replace(CharSequence target, CharSequence replacement)` → Substitui todas as ocorrências de uma sequência de caracteres por outra.
- `indexOf(String str)` → Retorna o índice da primeira ocorrência da string especificada.
- `lastIndexOf(String str)` → Retorna o índice da última ocorrência da string especificada.

### Saída esperada:
```
Original: -abcde fghij abc abc defg   -
ToLowerCase: -ABCDE FGHIJ ABC ABC DEFG   -
trim: -abcde FGHIJ ABC abc DEFG-
substring(2): -cde FGHIJ ABC abc DEFG   -
substring(2, 9): -cde FGH-
replace('a', 'x'): -xbcde FGHIJ ABC xbc DEFG   -
replace('abc', 'xy'): -xyde FGHIJ ABC xy DEFG   -
Index of 'bc': 1
Last index of 'bc': 17
```

Esse conteúdo cobre as principais operações com strings em Java, incluindo `split` e manipulações comuns.

