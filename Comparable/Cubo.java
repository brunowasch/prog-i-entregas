package Atividade02;

public class Cubo extends FormaTridimensional {
    private double lado;

    public Cubo(double lado) {
        this.lado = lado;
    }

    @Override
    public double obterVolume() {
        return Math.pow(lado, 3);
    }

    @Override
    public double obterArea() {
        return 6 * Math.pow(lado, 2);
    }
    
}
