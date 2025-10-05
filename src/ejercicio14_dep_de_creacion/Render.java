/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio14_dep_de_creacion;

/**
 *
 * @author Daniela Nahir Romero
 */
public class Render {
    private String formato;
    private Proyecto proyecto;

    public Render(String formato) {
        this.formato = formato;
        this.proyecto = null;
    }

    // Getters
    public String getFormato() {
        return formato;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }

    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }

    
    public void iniciarProceso() {
        System.out.println("  Iniciando renderizado...");
        String nombreProyecto = (proyecto != null) ? proyecto.getNombre() : "Proyecto Desconocido";
        int duracion = (proyecto != null) ? proyecto.getDuracionMin() : 0;
        System.out.printf("  Exportando %s a formato %s. Duración: %d minutos.\n", 
            nombreProyecto, formato, duracion);
        System.out.println("  Render finalizado exitosamente.");
    }
}
