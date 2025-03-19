import java.util.LinkedList;
import java.util.Queue;

public class ExemploFila {
    public static void main(String[] args) {
        // Criando uma fila
        Queue<String> fila = new LinkedList<>();

        // Adicionando elementos à fila
        fila.add("Alice");
        fila.add("Bob");
        fila.add("Carol");

        // Exibindo a fila
        System.out.println("Fila: " + fila);

        // Removendo o primeiro elemento da fila
        String primeiro = fila.poll();
        System.out.println("Removido da fila: " + primeiro);

        // Exibindo a fila após a remoção
        System.out.println("Fila após remoção: " + fila);

        // Verificando o elemento no início da fila sem removê-lo
        String proximo = fila.peek();
        System.out.println("Próximo na fila: " + proximo);

        // Exibindo o tamanho da fila
        System.out.println("Tamanho da fila: " + fila.size());
    }
}
