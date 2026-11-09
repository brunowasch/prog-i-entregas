import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class ExemploMap {
    public static void main(String[] args) {
        // Matrícula -> estudante. Ao repetir uma chave, o valor anterior é substituído.
        Map<Integer, String> estudantes = new HashMap<>();
        estudantes.put(1042, "Ana");
        estudantes.put(1031, "Bruno");
        estudantes.put(1042, "Ana Souza");
        System.out.println("HashMap: " + estudantes);
        System.out.println("Matrícula 1042: " + estudantes.get(1042));

        // Preserva a ordem em que as chaves foram inseridas.
        Map<String, Integer> pontuacao = new LinkedHashMap<>();
        pontuacao.put("Ana", 8);
        pontuacao.put("Bruno", 10);
        pontuacao.put("Caio", 7);
        System.out.println("LinkedHashMap: " + pontuacao);

        // Ordena pelas chaves (String: ordem alfabética).
        Map<String, String> salas = new TreeMap<>();
        salas.put("quarta", "Lab 2");
        salas.put("segunda", "Sala 10");
        salas.put("sexta", "Lab 1");
        System.out.println("TreeMap: " + salas);

        // Hashtable é legado, sincronizado e não aceita null em chave ou valor.
        Map<String, Integer> estoque = new Hashtable<>();
        estoque.put("cadernos", 12);
        estoque.put("canetas", 30);
        System.out.println("Hashtable: " + estoque);
        System.out.println("Quantidade de canetas: " + estoque.get("canetas"));
    }
}
