import java.util.ArrayList;

public class SimpleList {
public static void main(String[] args) {
    // Criando uma lista de inteiros
    ArrayList<Integer> numbers = new ArrayList<>();

    // Adicionando elementos à lista
    numbers.add(10);
    numbers.add(20);
    numbers.add(30);

    // Exibindo os elementos da lista
System.out.println("Elementos da lista:");
   for (int number : numbers) {
System.out.println(number);
}
   // Verificando o tamanho da lista
System.out.println("Tamanho da lista: " + numbers.size());
  // Removendo um elemento da lista
numbers.remove(1);
  // Exibindo a lista após a remoção
System.out.println("Lista após a remoção:");
   for (int number : numbers) {
System.out.println(number);
}
  // Verificando o tamanho da lista após a remoção
System.out.println("Tamanho da lista: " + numbers.size());
}
}


