/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio14_dep_de_creacion;

/**
 *
 * @author Daniela Nahir Romero
 */
public class main {
       public static void main(String[] args) {
        System.out.println("--- DEPENDENCIA DE CREACIÓN & ASOCIACIÓN  ---");
        
        //Crear el Proyecto
        Proyecto proyecto = new Proyecto("Documental Histórico", 45);
        System.out.println("Proyecto Creado: " + proyecto);

        //Crear el EditorVideo
        EditorVideo editor = new EditorVideo();
        System.out.println("EditorVideo Creado...");

        //PRUEBA DE DEPENDENCIA DE CREACIÓN
        //El Editor crea un objeto Render, le asigna el Proyecto y lo devuelve.
        System.out.println("Prueba de Exportación:");
        Render render1 = editor.exportar("MP4 (Alta Calidad)", proyecto);
        
        //Prueba de Exportación sin Proyecto (Solo Dependencia de Creación)
        System.out.println("Prueba de Exportación (Sin Proyecto asignado):");
        Render render2 = editor.exportar("MOV (Baja Res.)", null); 
        
    }
}
