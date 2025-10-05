/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio09;

/**
 *
 * @author Daniela Nahir Romero
 */
public class main {
     public static void main(String[] args) {
      
        System.out.println("\n1. Creando Paciente y Profesional...");
        Paciente paciente1 = new Paciente("Juan Ramierez", "Swiss Medical");
        Profesional medico1 = new Profesional("Dr. Ana Torres", "Pediatría");
        
        System.out.println("-> " + paciente1);
        System.out.println("-> " + medico1);

        //creamos de la Cita Médica 
        System.out.println("Creando Cita Médica...");
        CitaMedica cita = new CitaMedica("2025-11-15", 10.30, paciente1, medico1);
        
        System.out.println("Cita Creada.");
        cita.mostrarDetalle();

        //Prueba de independencia (Asociación)
        System.out.println("\n3. Prueba de Independencia (Asociación):");
        
        // Si perdemos la referencia a la Cita, el Paciente y el Profesional siguen existiendo.
        cita = null; 
        
        System.out.println("La Cita ha sido 'borrada' (cita = null).");
        
        System.out.println("¿El Paciente sigue existiendo? SÍ.");
        System.out.println(paciente1); 
        
        System.out.println("¿El Profesional sigue existiendo? SÍ.");
        System.out.println(medico1);
    }
}
