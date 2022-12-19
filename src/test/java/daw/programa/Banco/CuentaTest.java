package daw.programa.Banco;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


/**
 * Unit test for simple App.
 */
public class CuentaTest 
{   
    Cuenta cuenta1;
    Cuenta cuenta2;

    @BeforeEach
    void crearClaseCuenta1(){
        String id="Cd45gt";
        String nombreCliente = "Ana Botín";
        double saldo = 123.45;
        cuenta1 = new Cuenta(id, nombreCliente);
        cuenta2 = new Cuenta(id, nombreCliente, saldo);
        
    }

    @AfterEach
    void borrarClasesCuenta(){
        cuenta1 = null;
        cuenta2 = null;
    }

    @Test
    public void elIDConElPrimerConstructorEstaOk()
    {
        String expected = "Cd45gt";
        assertEquals(expected, cuenta1.getId(), "El ID debería ser: 'Cd45gt'.");
    }

    @Test
    public void elNombreConElPrimerConstructorEstaOk()
    {
        String expected = "Ana Botín";
        assertEquals(expected, cuenta1.getNombreCliente(), "El Nombre debería ser: 'Ana botín'.");
    }

    @Test
    public void elSaldoConElPrimerConstructorEstaOk()
    {
        double expected = 0;
        assertEquals(expected, cuenta1.getSaldo(), "El Saldo por defecto debería ser: 0");
    }

    @Test
    public void elMetodoToStringConElPrimerConstructorFuncionaOk()
    {
        String expected = "Cuenta [id=" + "Cd45gt" + ", nombreCliente=" + "Ana Botín" + ", saldo=" + "0.0" + "]";
        assertEquals(expected, cuenta1.toString());
    }

    @Test
    public void elIDConElSegundoConstructorEstaOk()
    {
        String expected = "Cd45gt";
        assertEquals(expected, cuenta2.getId(), "El ID debería ser: 'Cd45gt'.");
    }

    @Test
    public void elNombreConElSegundoConstructorEstaOk()
    {
        String expected = "Ana Botín";
        assertEquals(expected, cuenta2.getNombreCliente(), "El Nombre debería ser: 'Ana botín'.");
    }

    @Test
    public void elSaldoConElSegundoConstructorEstaOk()
    {
        double expected = 123.45;
        assertEquals(expected, cuenta2.getSaldo(), "El Saldo por defecto debería ser: 0");
    }

    @Test
    public void elMetodoToStringConElSegundoConstructorFuncionaOk()
    {
        String expected = "Cuenta [id=" + "Cd45gt" + ", nombreCliente=" + "Ana Botín" + ", saldo=" + "123.45" + "]";
        assertEquals(expected, cuenta2.toString());
    }


    @Test
    public void siSacoCreditoYNoMePasoDeSaldoElSaldoSeActualizaBien(){
        double cantidad = 23.77;
        double expected = cuenta2.getSaldo() - cantidad;
        assertEquals(expected, cuenta2.credito(cantidad));
    }

    @Test
    public void siSacoCreditoYSiMePasoDeSaldoElSaldoSeActualizaBien(){
        double cantidad = 23232.77;
        double expected = cuenta2.getSaldo() - cantidad;
        assertEquals(expected, cuenta2.credito(cantidad));
    }

    @Test
    public void siSacoCeroElSaldoSeActualizaBien(){
        double cantidad = 0;
        double expected = cuenta2.getSaldo() - cantidad;
        assertEquals(expected, cuenta2.credito(cantidad));
    }

    @Test
    public void siSacoNegativoElSaldoSeActualizaBien(){
        double cantidad = -542.23;
        double expected = cuenta2.getSaldo() - cantidad;
        assertEquals(expected, cuenta2.credito(cantidad));
    }

    

} 