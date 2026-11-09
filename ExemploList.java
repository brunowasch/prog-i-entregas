import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ExemploList {
    public static void main(String[] args) {
        // Lista de chamada: mantém ordem de inserção e permite nomes repetidos.
        List<String> chamada = new ArrayList<>();
        chamada.add("Ana");
        chamada.add("Bruno");
        chamada.add("Ana"); // List aceita duplicados.
        System.out.println("ArrayList: " + chamada);
        System.out.println("Elemento no índice 1: " + chamada.get(1));

        // LinkedList também é List e ainda permite trabalhar nas pontas.
        LinkedList<String> tarefas = new LinkedList<>();
        tarefas.add("Resolver exercício");
        tarefas.addFirst("Abrir o material");
        tarefas.addLast("Revisar respostas");
        System.out.println("LinkedList: " + tarefas);

        // Vector é uma implementação antiga sincronizada de List.
        Vector<String> salas = new Vector<>();
        salas.add("Lab 1");
        salas.add("Lab 2");
        System.out.println("Vector: " + salas);

        // Stack representa pilha LIFO: o último item empilhado sai primeiro.
        Stack<String> pilhaDeLivros = new Stack<>();
        pilhaDeLivros.push("Java básico");
        pilhaDeLivros.push("Coleções");
        System.out.println("Topo da Stack: " + pilhaDeLivros.peek());
        System.out.println("Retirado: " + pilhaDeLivros.pop());
        System.out.println("Stack restante: " + pilhaDeLivros);
    }
}
