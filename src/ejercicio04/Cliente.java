/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio04;

/**
 *
 * @author Daniela Nahir Romero
 */
public class Cliente {
    private String nombre;
    private String dni;
    private TarjetaDeCredito tarjeta;

    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    
    public void setTarjeta(TarjetaDeCredito tarjeta){
        this.tarjeta = tarjeta;
        if(tarjeta != null && tarjeta.getCliente() != this){
            tarjeta.setCliente(this);
        }
    }

    @Override
    public String toString() {
        return "Cliente:" + nombre + ", dni: " + dni;
    }

    public TarjetaDeCredito getTarjeta() {
        return tarjeta;
    }
    
    public String getInfoTarjeta() {
        if (this.tarjeta != null) {
            return tarjeta.toString(); 
        } else {
            return "Tarjeta no asignada";
        }
    }
    public String getNombre() {
        return nombre;
    }
    
    
    
    
}
