package daw.programa.Banco;

public class Cuenta {
    private String id;
    private String nombreCliente;
    private double saldo = 0;

    public Cuenta(String id, String nombreCliente) {
        this.id = id;
        this.nombreCliente = nombreCliente;
    }

    public Cuenta(String id, String nombreCliente, double saldo) {
        this.id = id;
        this.nombreCliente = nombreCliente;
        this.saldo = saldo;
    }

    public String getId() {
        return id;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public double credito(double cantidad){
        this.saldo -= cantidad;
        return this.saldo;
    }

    public double debito(double cantidad){
        if(cantidad <= this.saldo){
            this.saldo -= cantidad;
        } else{
            System.out.println("El saldo es insuficiente.");
        }
        return this.saldo;
    }

    @Override
    public String toString() {
        return "Cuenta [id=" + this.id + ", nombreCliente=" + this.nombreCliente + ", saldo=" + this.saldo + "]"; 
    }
}
