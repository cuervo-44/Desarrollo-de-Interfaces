
package com.mycompany.actividad5;

public class Alumno {
    private String nombre;
    private String Apellidos;
    private String email;
    private int edad;
    private String numero;
    
    public Alumno() {
        this.nombre = "";
        this.Apellidos = "";
        this.email = "";
        this.edad = 0;
        this.numero = "";
    }

    public Alumno(String nombre, String Apellidos, int edad) {
        this.nombre = nombre;
        this.Apellidos = Apellidos;
        this.edad = edad;
        this.email = "";
        this.numero = "";
    }
    
    public Alumno(String nombre, String Apellidos, String email, int edad, String numero) {
        this.nombre = nombre;
        this.Apellidos = Apellidos;
        this.email = email;
        this.edad = edad;
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    public boolean mayorEdad () {
        boolean mayorEdad;
        
        return mayorEdad = edad >= 18;  
               
    }
    
}
