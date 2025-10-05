/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio14_dep_de_creacion;

/**
 *
 * @author Daniela Nahir Romero
 */
public class Proyecto {
    private String nombre;
    private int duracionMin; // Duración en minutos

    public Proyecto(String nombre, int duracionMin) {
        this.nombre = nombre;
        this.duracionMin = duracionMin;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public int getDuracionMin() {
        return duracionMin;
    }

    @Override
    public String toString() {
        return String.format("Proyecto: "+nombre+" minutos): "+duracionMin);
    }
}
