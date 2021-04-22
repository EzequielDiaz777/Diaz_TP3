package Diaz_TP3;
import java.time.temporal.ChronoUnit;
import java.time.LocalDate;

public abstract class Persona {
    protected String nombre;
    protected int dni;
    protected LocalDate fechaDeNacimiento;
    protected String domicilio;
    
    Persona(String nombre, int dni, LocalDate fechaDeNacimiento, String domicilio){
        this.nombre = nombre;
        this.dni = dni;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.domicilio = domicilio;
    }
    
    public String getNombre(){
        return nombre;
    }    
    
    public int getDni(){
        return dni;
    }
    
    public LocalDate getFechaDeNacimiento(){
        return fechaDeNacimiento;
    }
    
    public String getDomicilio(){
        return domicilio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }
    
    public long calcularEdad(){
        long edad = ChronoUnit.YEARS.between(fechaDeNacimiento, LocalDate.now());
        System.out.println("Usted ha vivido " + edad + " años.");
        return edad;
    }
    
    
    public long calcularDiasVividos(){
        long dias = ChronoUnit.DAYS.between(fechaDeNacimiento, LocalDate.now());
        System.out.println("Usted ha vivido " + dias + " dias.");
        return dias;
    }
    
    abstract void cobrar();
}