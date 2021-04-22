package Diaz_TP3;
import java.time.LocalDate;

public class Trabajador extends Persona implements Activo {
    private int sueldo;

    public Trabajador(String nombre, int dni, LocalDate fechaDeNacimiento, String domicilio, int sueldo) {
        super(nombre, dni, fechaDeNacimiento, domicilio);
        this.sueldo = sueldo;
    }

    public int getSueldo() {
        return sueldo;
    }
    
    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    void cobrar() {
        System.out.println("Monto a cobrar: " + sueldo);
    }
    
    @Override
    public void hacerAportes(){
        System.out.println("Estoy haciendo mis aportes a la AFIP.");
    }
}