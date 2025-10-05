/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio08;

/**
 *
 * @author Daniela Nahir Romero
 */
public class Usuario {
    
    private String nombre;
    private String email;

    /**
     * Constructor para inicializar un Usuario.
     */
    public Usuario(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }
    
    @Override
    public String toString() {
        return "Usuario [Nombre: " + nombre + ", Email: " + email + "]";
    }
    
}
