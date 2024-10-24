package co.edu.uniquindio.poo;

public class Auto extends Vehiculo {
    private int numPuertas;
    private int dias;

    public Auto(String matricula, String marca, String modelo, int añoFabricacion, int numPuertas) {
        super(matricula, marca, modelo, añoFabricacion);
        this.numPuertas = numPuertas;
    }

    @Override
    public double calcularCostoVehiculo(int dias) {
        double costo = 4000;
        costo *= dias;
        return costo;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    @Override
    public String toString() {
        return super.toString() + "Auto [numPuertas=" + numPuertas + ", dias=" + dias + "]";
    }
}
