/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio09;

/**
 *
 * @author Daniela Nahir Romero
 */
public class CitaMedica {
    private String fecha;
    private double hora;
     // ASOCIACIONES 1 a 1: CitaMedica -> Paciente y CitaMedica -> Profesional
    private Paciente paciente;
    private Profesional profesional;


    public CitaMedica(String fecha, double hora, Paciente paciente, Profesional profesional) {
        this.fecha = fecha;
        this.hora = hora;
        this.paciente = paciente;
        this.profesional = profesional;
    }
    
    // Getters
    public String getFecha() { return fecha; }
    public double getHora() { return hora; }
    public Paciente getPaciente() { return paciente; }
    public Profesional getProfesional() { return profesional; }

    /**
     * Muestra los detalles completos de la cita.
     */
    public void mostrarDetalle() {
        System.out.println("--- DETALLE DE LA CITA MÉDICA ---");
        System.out.printf("Fecha: %s | Hora: %.2f\n", fecha, hora);
        System.out.println("------------------------------------");
        System.out.println("Paciente Asociado: " + paciente.getNombre() + " (" + paciente.getObraSocial() + ")");
        System.out.println("Profesional Asociado: " + profesional.getNombre() + " | Especialidad: " + profesional.getEspecialidad());
        System.out.println("------------------------------------");
    }
}
