/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio02;

/**
 *
 * @author Daniela Nahir Romero
 */
public class Celular {
    private String imei;
    private String marca;
    private String modelo;
    private Bateria bateria;
    private Usuario usuario;
    

    public Celular(String imei, String marca, String modelo, Bateria bateria) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
    }

   
    public void setUsuario(Usuario usuario){
        this.usuario = usuario;
        if (usuario != null && usuario.getCelular() != this){
            usuario.setCelular(this);
        }
    }

    public Usuario getUsuario() {
        return usuario;
    }
    
    public void mostrarBateria(){
        if (bateria != null){
            System.out.println("La bateria es "+bateria);
        }else{
            System.out.println("El celular no tiene bateria asignada.");
        }
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
    
    @Override
    public String toString() {
        String infoUsuario = (this.usuario != null) ? this.usuario.getNombre() : "Sin asignar";
        String infoBateria = (this.bateria != null) ? this.bateria.toString() : "Sin Bateria";
        return "Celular{" + "imei=" + imei + ", marca=" + marca + ", modelo=" + modelo + ", bateria=" + infoBateria + ", usuario=" + infoUsuario + '}';
    }


}
