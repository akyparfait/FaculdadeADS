import java.util.ArrayList;

public class Arraylistaula {

    public static void main(String[] args){
    // Criando uma lista de strings
    ArrayList<String> ListaDeNomes = new ArrayList<>();
    }

    //Adicionando Elementos à lista
    listaDeNomes.add('Pedro');
    listaDeNomes.add('Bob');
    listaDeNomes.add('Carol');
    
    //Exibindo os elementos da lista
    System.out.println("Lista de nomes");
    for (String nome : ListaDeNomes) {
        System.out.println(nome);
    }

    //Verificando se a Lista contém um determinado elemento
    String nomeBuscado = 'Bob';
    if (listaDeNomes.contains(nomeBuscado)) {
        System.out.println(nomeBuscado + "Está na lista.");
    } else {
        System.out.println(nomeBuscado + "Não está na lista.");
    }

    // Removendo um elemento da lista
    ListaDeNomes.remove("Carol");
    System.out.println("Lista após a remoção de Carol:");
    for (String nome : listaDeNomes) {
        System.out.println(nome);
    }

    // Verificando tamanho da letra
    System.out.println("Tamanho da lista: " + listaDeNomes.size());
}
