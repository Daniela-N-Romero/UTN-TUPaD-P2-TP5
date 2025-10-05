/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio10;

/**
 *
 * @author Daniela Nahir Romero
 */
public class CuentaBancaria {
    private String cbu;
    private double saldo;
    private ClaveSeguridad clave; //para composición
    private Titular titular; //para relacion bidireccional


    public CuentaBancaria(String cbu, double saldo, String codigoClave, String fechaClave) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.clave = new ClaveSeguridad(codigoClave, fechaClave); //composición
    }
    
    // Getters
    public String getCbu() { return cbu; }
    public double getSaldo() { return saldo; }
    public ClaveSeguridad getClave() { return clave; }
    public Titular getTitular() { return titular; }

    //Setter seguro para la Asociación Bidireccional con Titular.
    public void setTitular(Titular titular) {
        if (this.titular != titular) {
            if (this.titular != null) {
                Titular antiguoTitular = this.titular;
                this.titular = null;
                antiguoTitular.setCuentaAsignada(null);
            }
            this.titular = titular;
            if (titular != null) {
                titular.setCuentaAsignada(this);
            }
        }
    }
    
    public void mostrarDetalle() {
        System.out.println("--- DETALLE DE CUENTA BANCARIA ---");
        System.out.printf("CBU: %s | Saldo: $%.2f\n", cbu, saldo);
        System.out.println("");
        System.out.println("Clave de Seguridad: "+clave+" (COMPOSICION)");
        if (titular != null) {
            System.out.printf("Titular: %s | DNI: %s (ASOCIACION BIDIRECCIONAL)", titular.getNombre(), titular.getDni());
            System.out.println("");
        } else {
            System.out.println("Cuenta sin titular asignado.");
        }
        System.out.println("------------------------------------");
    }
}
