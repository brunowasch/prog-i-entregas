package colecoes;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class ExemploQueue {
    public static void main(String[] args) {
        // Atendimento por chegada: FIFO (primeiro que entra, primeiro que sai).
        Queue<String> atendimento = new LinkedList<>();
        atendimento.offer("Ana");
        atendimento.offer("Bruno");
        atendimento.offer("Caio");
        System.out.println("Próximo da fila: " + atendimento.peek());
        System.out.println("Atendido: " + atendimento.poll());
        System.out.println("Fila restante: " + atendimento);

        // PriorityQueue atende pelo menor número primeiro, não pela chegada.
        Queue<Integer> prioridades = new PriorityQueue<>();
        prioridades.offer(3); // prioridade mais baixa neste exemplo
        prioridades.offer(1); // prioridade mais alta: menor número
        prioridades.offer(2);
        System.out.println("Próximo número prioritário: " + prioridades.peek());
        System.out.print("Ordem de atendimento: ");
        while (!prioridades.isEmpty()) {
            System.out.print(prioridades.poll() + " ");
        }
        System.out.println();
    }
}
