package interfaz;

public class Main {
    public static void main(String[] args) {
        Vehiculo carro1 = new Carro ("Mazda");
        Vehiculo moto1 = new Moto ("Adventure");

        moto1.acelerar(60);
        moto1.imprimirInformacion();
        moto1.frenar();

        carro1.acelerar(20);
        carro1.imprimirInformacion();
        carro1.frenar();
    }
}