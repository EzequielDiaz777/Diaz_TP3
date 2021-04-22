package Diaz_TP3;
import java.time.LocalDate;
import java.time.Month;

public class Test {
    
    public static void main(String[] args) {
        LocalDate fechaDeNacimientoNeko = LocalDate.of(2000, Month.NOVEMBER, 9);
        
        LocalDate fechaDeNacimientoAngel = LocalDate.of(1956, Month.NOVEMBER, 3);
        
        Trabajador Neko = new Trabajador("Neko Pantera Cruceño Orsomarso ", 456789, fechaDeNacimientoNeko, "Caja N° 4", 5000);
        
        Jubilado Angel = new Jubilado("Angel Amy Cruceño Orsomarso", 456791, fechaDeNacimientoAngel, "Caja N° 6");
        
        Registro registro = new Registro();
        
        registro.procesarDatos(Neko);
        
        registro.procesarDatos(Angel);
    }
}