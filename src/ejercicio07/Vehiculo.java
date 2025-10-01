/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio07;

/**
 *
 * @author Daniela Nahir Romero
 */
public class Vehiculo {
    private String patente;
    private String modelo;
    private Motor motor;     
    private Conductor conductor;


    public Vehiculo(String patente, String modelo, Motor motor) {
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor; 
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Motor getMotor() { 
        return motor; 
    }
    
    public Conductor getConductor() {
        return conductor; 
    }

    public void setMotor(Motor motor) { 
        this.motor = motor; 
    }

    // para que se desasigne el vehiculo al conductor antigüo agregue una verifivación
     public void setConductor(Conductor nuevoConductor) {
       if (this.conductor != nuevoConductor) {

           //desvinculo el conductor anterir
           if (this.conductor != null) {
                Conductor antiguoConductor = this.conductor;
                this.conductor = null; 
                antiguoConductor.setVehiculoAsignado(null); 
            }

           //vinculo el conductor nuevo con el vehiculo y viceversa
            this.conductor = nuevoConductor;
               if (nuevoConductor != null) {
                nuevoConductor.setVehiculoAsignado(this);
            }
        }
    }

    //probando método nuevo String.format()
    @Override
    public String toString() {
    String nombreConductor = (this.conductor != null) ? this.conductor.getNombre() : "conductor no asignado";
    
    // El texto final no necesita los saltos de línea ni \t, 
    // sino que usa especificadores de formato (%-15s)
    String formato = """
        %-15s %s,
        %-15s %s,
        %-15s %s,
        %-15s %s
        """; // Importante: Observa el salto de línea al final del bloque.

    // Rellenamos los especificadores de formato.
    return formato.formatted(
        "patente:", this.patente,
        "modelo:", this.modelo,
        "motor:", this.motor,
        "conductor:", nombreConductor
    );
}

     
     
    public void mostrarDetalle() {
        System.out.println("Detalles del vehiculo...");
        System.out.println(this.toString());
    }
      
}

