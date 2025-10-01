/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio06;

/**
 *
 * @author Daniela Nahir Romero
 */
public class Mesa {
    private String numero; // Usamos String ya que 'numero' puede ser "M-1", "A10", etc.
    private int capacidad;


    public Mesa(String numero, int capacidad) {
        this.numero = numero;
        this.capacidad = capacidad;
    }

    public String getNumero() {
        return numero;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

      @Override
    public String toString() {
        return "Mesa n° " + numero + ", capacidad: " + capacidad + "]";
    }
}
