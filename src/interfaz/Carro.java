package interfaz;

public class Carro implements Vehiculo {
    private String marca;
    private int velocidad;

    public Carro (String marca) {
        this.marca = marca;
        this.velocidad = 0;
    }

    @Override
    public void acelerar(int velocidad) {
        this.velocidad += velocidad;
        System.out.println("El carro esta acelerando a " + this.velocidad + " km/h");
    }

    @Override
    public void frenar() {
        this.velocidad = 0;
        System.out.println("El carro ha frenado");
    }

    @Override
    public void imprimirInformacion() {
        System.out.println("Carro marca: " + marca + ", velocidad: " + velocidad + " km/h");
    }
}