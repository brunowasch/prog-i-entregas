package comparable;

public abstract class Forma implements Comparable<Forma> {
    public abstract double obterArea();

    @Override
    public int compareTo(Forma outraForma) {
        return Double.compare(this.obterArea(), outraForma.obterArea());
    }
}
