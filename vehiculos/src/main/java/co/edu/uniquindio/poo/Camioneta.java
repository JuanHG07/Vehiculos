package co.edu.uniquindio.poo;

public class Camioneta extends Vehiculo {
    private double capacidadCarga;

    public Camioneta(String matricula, String marca, String modelo, int anioFabricacion, double capacidadCarga) {
        super(matricula, marca, modelo, anioFabricacion);
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public double calcularCostoVehiculo(int dias) {
        double costo = 10000;
        costo *= dias;
        costo += costo * 0.1 * capacidadCarga;
        return costo;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public String toString() {
        return super.toString() + "Camioneta [capacidadCarga=" + capacidadCarga + "]";
    }
}
