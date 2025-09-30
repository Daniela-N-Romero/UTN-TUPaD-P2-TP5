/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio02;

import ejercicio01.Pasaporte;

/**
 *
 * @author Daniela Nahir Romero
 */
public class Usuario {
    
    private String dni;
    private String nombre;
    private Celular celular;

    public Usuario(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }
    
    public void setCelular(Celular celular){
        this.celular = celular;
        if (celular != null && celular.getUsuario() != this){
            celular.setUsuario(this);
        }
    }

    public Celular getCelular() {
        return celular;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        String infoCelular = (this.celular != null) ? this.celular.getMarca() + " " + this.celular.getModelo() : "Sin asignar";
        return "Usuario {DNI=" + dni + ", Nombre=" + nombre + ", Celular=" + infoCelular + "}";
    }

}
