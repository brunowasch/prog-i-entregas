import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class ExemploDeque {
    public static void main(String[] args) {
        // Histórico simples: adiciona novas páginas no início e percorre pelas pontas.
        Deque<String> historico = new ArrayDeque<>();
        historico.addFirst("portal da disciplina");
        historico.addFirst("material de Java");
        historico.addLast("exercícios");
        System.out.println("ArrayDeque: " + historico);
        System.out.println("Mais recente: " + historico.peekFirst());
        System.out.println("Mais antiga: " + historico.peekLast());
        System.out.println("Removida do início: " + historico.removeFirst());

        // LinkedList também implementa Deque.
        Deque<String> tarefas = new LinkedList<>();
        tarefas.offerLast("Corrigir atividade");
        tarefas.offerLast("Publicar nota");
        tarefas.offerFirst("Preparar aula");
        System.out.println("LinkedList como Deque: " + tarefas);
        System.out.println("Retirada do fim: " + tarefas.pollLast());
        System.out.println("Deque restante: " + tarefas);
    }
}
