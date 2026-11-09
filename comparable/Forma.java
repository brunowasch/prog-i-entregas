package comparable;

public abstract class Forma implements Comparable<Forma> {
    public abstract double obterArea();

    @Override
    public int compareTo(Forma outraForma) {
        double area1 = this.obterArea();
        double area2 = outraForma.obterArea();

        if (area1 < area2) 
            return -1;
        else if (area1 > area2) 
            return 1;
        else 
            return 0;
    }
}
