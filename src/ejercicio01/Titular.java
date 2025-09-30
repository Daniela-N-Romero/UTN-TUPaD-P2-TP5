/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio01;

/**
 *
 * @author Daniela Nahir Romero
 */
public class Titular {

    private String dni;
    private String nombre;
    private Pasaporte pasaporte;

    public Titular(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }
    
    public void setPasaporte(Pasaporte pasaporte){
        this.pasaporte = pasaporte;
        if (pasaporte != null && pasaporte.getTitular() != this){
            pasaporte.setTitular(this);
        }
    }

    public Pasaporte getPasaporte() {
        return pasaporte;
    }

    public String getNombre() {
        return nombre;
    }

        
    @Override
    public String toString() {
        String infoPasaporte = (this.pasaporte != null) ? this.pasaporte.getNumero() : "Sin asignar";
        return "Titular{" + "dni=" + dni + ", nombre=" + nombre + ", pasaporte=" + infoPasaporte + '}';
    }


    
}
