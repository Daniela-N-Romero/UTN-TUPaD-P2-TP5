/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio09;

/**
 *
 * @author Daniela Nahir Romero
 */
public class Paciente {
    private String nombre;
    private String obraSocial;

    /**
     * Constructor para inicializar un Paciente.
     */
    public Paciente(String nombre, String obraSocial) {
        this.nombre = nombre;
        this.obraSocial = obraSocial;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getObraSocial() {
        return obraSocial;
    }
    
    @Override
    public String toString() {
        return "Paciente: "+nombre+", Obra Social: "+ obraSocial;
    }
}
