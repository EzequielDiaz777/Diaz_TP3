package Diaz_TP3;
import java.time.LocalDate;

public class Jubilado extends Persona{

    public Jubilado(String nombre, int dni, LocalDate fechaDeNacimiento, String domicilio) {
        super(nombre, dni, fechaDeNacimiento, domicilio);
    }

    @Override
    void cobrar() {
        System.out.println("Cobrando mi jubilación.");
    }
}