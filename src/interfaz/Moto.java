package interfaz;

public class Moto implements Vehiculo {
    private String tipo;

    public Moto (String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void acelerar(int velocidad) {
        System.out.println("La moto esta ganando velocidad " + velocidad + " km/h");
    }

    @Override
    public void frenar() {
        System.out.println("La moto ha frenado");
    }

    @Override
    public void imprimirInformacion() {
        System.out.println("Moto tipo: " + tipo);
    }
}