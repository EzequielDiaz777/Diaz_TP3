package Diaz_TP3;

public class Registro {

    void procesarDatos(Trabajador t) {
            System.out.println("Su nombre es: " + t.getNombre());
            t.calcularEdad();
            t.cobrar();
    }
    
    void procesarDatos(Jubilado j){
        System.out.println("Su nombre es: " + j.getNombre());
        j.calcularDiasVividos();
        j.cobrar();
    }
}