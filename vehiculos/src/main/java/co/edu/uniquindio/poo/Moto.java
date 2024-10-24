package co.edu.uniquindio.poo;

public class Moto extends Vehiculo {
    private TipoCaja tipoCaja;

    public Moto(String matricula, String marca, String modelo, int anioFabricacion, TipoCaja tipoCaja) {
        super(matricula, marca, modelo, anioFabricacion);
        this.tipoCaja = tipoCaja;
    }

    @Override
    public double calcularCostoVehiculo(int dias) {
        double costo = 2000;
        costo *= dias;
        if (tipoCaja.equals(TipoCaja.AUTOMATICA)) {
            costo += 500;
        }
        return costo;
    }

    public TipoCaja getTipoCaja() {
        return tipoCaja;
    }

    public void setTipoCaja(TipoCaja tipoCaja) {
        this.tipoCaja = tipoCaja;
    }

    @Override
    public String toString() {
        return super.toString() + "Moto [tipoCaja=" + tipoCaja + "]";
    }
}
