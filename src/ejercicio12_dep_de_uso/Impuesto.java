/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio12_dep_de_uso;

/**
 *
 * @author Daniela Nahir Romero
 */
public class Impuesto {
    private double monto;
    private Contribuyente contribuyente;

    public Impuesto(double monto) {
        this.monto = monto;
        this.contribuyente = null;
    }
    //Setter Contribuyente

    public void setContribuyente(Contribuyente contribuyente) {
        this.contribuyente = contribuyente;
    }
    
    
    // Getters
    public double getMonto() {
        return monto;
    }

    public Contribuyente getContribuyente() {
        return contribuyente;
    }
    
    public void mostrarDetalle() {
        System.out.printf("  Monto Base: $%.2f\n", monto);
        System.out.printf("  Asignado a: %s\n", contribuyente.getNombre());
    }
}
