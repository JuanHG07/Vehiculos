package co.edu.uniquindio.poo;

public class App {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("ServiAuto");
        Cliente cliente1 = new Cliente("Pedro", "Gomez", "1190");
        Cliente cliente2 = new Cliente("Julian", "Perez", "1903");
        empresa.agregarCliente(cliente1);
        empresa.agregarCliente(cliente2);
        Vehiculo auto = new Auto("ABC123", "Toyota", "Corolla", 2020, 4);
        Vehiculo moto = new Moto("DEF456", "Yamaha", "MT-07", 2019, TipoCaja.AUTOMATICA);
        Vehiculo camioneta = new Camioneta("GHI789", "Ford", "Ranger", 2018, 2.5);
        empresa.agregarVehiculo(auto);
        empresa.agregarVehiculo(moto);
        empresa.agregarVehiculo(camioneta);
        Reserva reserva1 = new Reserva("1001", 3, cliente1, auto);
        Reserva reserva2 = new Reserva("1002", 5, cliente1, moto);
        Reserva reserva3 = new Reserva("1003", 1, cliente2, camioneta);
        System.out.println(reserva1.calcularCostoReserva());
        System.out.println(reserva2.calcularCostoReserva());
        System.out.println(reserva3.calcularCostoReserva());
    }
}
