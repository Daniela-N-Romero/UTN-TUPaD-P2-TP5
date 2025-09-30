/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio05;

/**
 *
 * @author Daniela Nahir Romero
 */
public class Computadora {
    private String marca;
    private String numeroSerie;
    private PlacaMadre placa;
    private Propietario propietario;

    public Computadora(String marca, String numeroSerie, String modelo, String chipset) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placa = new PlacaMadre(modelo, chipset);
    }
    
    public Computadora(String marca, String numeroSerie, String modelo, String chipset, Propietario propietario) {
        this(marca, numeroSerie, modelo, chipset);
        if (propietario != null) {
            this.propietario = propietario; 
            propietario.setComputadora(this);
        }
    }
    
    
    public void setPropietario(Propietario propietario){
        this.propietario = propietario;
        if(propietario != null && propietario.getComputadora() != this){
            propietario.setComputadora(this);
        } 
    }    

    public Propietario getPropietario() {
        return propietario;
    }
    
    public String getPropietarioInfo(){
        return propietario != null ? propietario.getNombre()+ " dni: " + propietario.getDni() : "propietario no asignado";
    }

    public String getMarca() {
        return marca;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public PlacaMadre getPlaca() {
        return placa;
    }

    @Override
    public String toString() {
        return "Computadora{" + "marca:" + marca + ", numeroSerie:" + numeroSerie + ", placa:" + placa + ", propietario:" + this.getPropietarioInfo() + '}';
    }
    
    
}
