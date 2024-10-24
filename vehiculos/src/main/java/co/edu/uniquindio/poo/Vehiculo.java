package co.edu.uniquindio.poo;

public abstract class Vehiculo {
    private String matricula;
    private String marca;
    private String modelo;
    private int añoFabricacion;

    public Vehiculo(String matricula, String marca, String modelo, int añoFabricacion) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.añoFabricacion = añoFabricacion;
    }

    public abstract double calcularCostoVehiculo(int dias);

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAñoFabricacion() {
        return añoFabricacion;
    }

    public void setAñoFabricacion(int añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }

    @Override
    public String toString() {
        return "Vehiculo [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", añoFabricacion="
                + añoFabricacion + "]";
    }
}
