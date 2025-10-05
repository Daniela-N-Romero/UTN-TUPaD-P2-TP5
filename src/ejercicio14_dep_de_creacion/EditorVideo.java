/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio14_dep_de_creacion;

/**
 *
 * @author Daniela Nahir Romero
 */
public class EditorVideo {

    public Render exportar(String formato, Proyecto proyecto) {
        System.out.println("Iniciando Exportación");
        
        //DEPENDENCIA DE CREACIÓN: El objeto Render se crea.
        Render nuevoRender = new Render(formato);
        
        // ASOCIACIÓN (SETTER): Asignamos el Proyecto al Render que acabamos de crear.
        nuevoRender.setProyecto(proyecto);
        
        nuevoRender.iniciarProceso(); 
        
        System.out.println("--------------------------------");
        return nuevoRender;
    }
}
