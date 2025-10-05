/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio13_dep_de_creacion;

/**
 *
 * @author Daniela Nahir Romero
 */
public class CodigoQR {
    private String valor;
    private Usuario usuario;

    public CodigoQR(String valor) {
        this.valor = valor;
        this.usuario = null;
    }

    //setter para Usuario

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    
    // Getters
    public String getValor() {
        return valor;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void mostrarDetalle() {
        System.out.println("Código generado con valor: " + valor);
        System.out.println( (usuario != null)? "Asignado a: "+ usuario.getNombre() : "no asignado");
    }
}
