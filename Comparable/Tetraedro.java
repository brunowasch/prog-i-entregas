package comparable;

public class Tetraedro extends FormaTridimensional {
    private double lado;

    public Tetraedro(double lado) {
        this.lado = lado;
    }

    @Override
    public double obterVolume() {
        return (Math.pow(lado, 3) / (6 * Math.sqrt(2)));
    }

    @Override
    public double obterArea() {
        return Math.sqrt(3) * Math.pow(lado, 2);
    }
    
}
