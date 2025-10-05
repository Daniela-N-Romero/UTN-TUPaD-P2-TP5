/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio10;

/**
 *
 * @author Daniela Nahir Romero
 */
public class Titular {
    private String nombre;
    private String dni;
    private CuentaBancaria cuentaAsignada;  //para relacion bidireccional

    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public CuentaBancaria getCuentaAsignada() {
        return cuentaAsignada;
    }
    
    //Setter seguro para la Asociación Bidireccional con CuentaBancaria
    public void setCuentaAsignada(CuentaBancaria cuenta) {
        if (this.cuentaAsignada != cuenta) {
            this.cuentaAsignada = cuenta;
            
            if (cuenta != null) {
                cuenta.setTitular(this);
            }
        }
    }
    
    @Override
    public String toString() {
        return String.format("Titular [Nombre: %s, DNI: %s]", nombre, dni);
    }
}
