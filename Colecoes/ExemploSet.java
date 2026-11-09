package colecoes;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploSet {
    public static void main(String[] args) {
        // Cadastro de etiquetas únicas; a ordem de HashSet não é garantida.
        Set<String> etiquetas = new HashSet<>();
        etiquetas.add("Java");
        etiquetas.add("Algoritmos");
        etiquetas.add("Java"); // retorna false: o valor já existe.
        System.out.println("HashSet: " + etiquetas);
        System.out.println("Java foi incluída? " + etiquetas.contains("Java"));

        // Mantém a ordem na qual os elementos foram adicionados.
        Set<String> ordemDeInscricao = new LinkedHashSet<>();
        ordemDeInscricao.add("Carla");
        ordemDeInscricao.add("Diego");
        ordemDeInscricao.add("Bia");
        System.out.println("LinkedHashSet: " + ordemDeInscricao);

        // Mantém os itens em ordem natural (String: ordem alfabética).
        Set<String> nomes = new TreeSet<>();
        nomes.add("Carla");
        nomes.add("Diego");
        nomes.add("Bia");
        System.out.println("TreeSet: " + nomes);
    }
}
