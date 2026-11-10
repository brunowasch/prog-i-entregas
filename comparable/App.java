package comparable;

import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) {
        ArrayList<Forma> formas = new ArrayList<>();
        formas.add(new Circulo(10.0));
        formas.add(new Quadrado(10.0));
        formas.add(new Triangulo(10.0, 8.0));
        formas.add(new Esfera(5.0));
        formas.add(new Cubo(6.0));
        formas.add(new Tetraedro(8.0));

        Collections.sort(formas);
        System.out.println("Formas em ordem crescente de área:");
        imprimirFormas(formas);

        formas.sort(Collections.reverseOrder());
        System.out.println("\nFormas em ordem decrescente de área:");
        imprimirFormas(formas);
    }

    private static void imprimirFormas(ArrayList<Forma> formas) {
        for (Forma forma : formas) {
            System.out.printf("%s: área = %.2f%n",
                    forma.getClass().getSimpleName(), forma.obterArea());
        }
    }
}
