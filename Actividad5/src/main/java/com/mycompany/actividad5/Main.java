package com.mycompany.actividad5;

public class Main {
    
    static Alumno [] alumnos = new Alumno [5];
    
    public static void main (String [] args) {
        java.awt.EventQueue.invokeLater(() -> new FormularioAlumnos().setVisible(true));
           
    }
}
