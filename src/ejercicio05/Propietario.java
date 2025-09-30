/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio05;

/**
 *
 * @author Daniela Nahir Romero
 */
public class Propietario {

    private String nombre;
    private String dni;
    private Computadora computadora;

    public Propietario(String nombre, String dni){
            this.nombre = nombre;
            this.dni = dni;
    }

    public Propietario(String nombre, String dni, Computadora computadora) {
        this(nombre, dni);
        if (computadora != null) {
            this.computadora = computadora; 
            computadora.setPropietario(this);
        }
    }
    
    public void setComputadora(Computadora computadora){
        this.computadora = computadora;
        if(computadora != null && computadora.getPropietario() != this){
            computadora.setPropietario(this);
        } 
    }    

    public Computadora getComputadora() {
        return computadora;
    }
    
    public String getComputadoraInfo(){
        return computadora != null ? computadora.getMarca()+ " n° de serie: " + computadora.getNumeroSerie(): "sin computadora asignada" ;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    @Override
    public String toString() {
        return "Propietario{" + "nombre:" + nombre + ", dni:" + dni + ", computadora:" + this.getComputadoraInfo() + '}';
    }
    
    
 
    
}
