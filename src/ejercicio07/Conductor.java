/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio07;

/**
 *
 * @author Daniela Nahir Romero
 */
public class Conductor {
    private String nombre;
    private String licencia;
    private Vehiculo vehiculo; // Referencia a la otra punta de la relación (bidireccional)

    /**
     * Constructor para inicializar un Conductor.
     * @param nombre El nombre del conductor.
     * @param licencia El número de licencia del conductor.
     */
    public Conductor(String nombre, String licencia) {
        this.nombre = nombre;
        this.licencia = licencia;
        this.vehiculo = null; // Se asigna después
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }
    
    public String getVehiculoAsignado() {
        return (vehiculo != null) ? vehiculo.getPatente() : "sin vehiculo";
    }


    public void setVehiculoAsignado(Vehiculo vehiculoAsignado) {
        if (this.vehiculo != vehiculoAsignado) {
            this.vehiculo = vehiculoAsignado;
            if (vehiculoAsignado != null) {
                vehiculoAsignado.setConductor(this);
            }
        }
    }

    @Override
    public String toString() {
        String patente = (vehiculo != null) ? vehiculo.getPatente() : "Ninguno";
        return "Conductor [Nombre: " + nombre + ", Licencia: " + licencia + ", Vehículo Asignado: " + patente + "]";
    }
}
