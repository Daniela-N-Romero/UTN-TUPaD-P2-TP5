/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio05;

/**
 *
 * @author Daniela Nahir Romero
 */
public class main {
    
    public static void main(String[] args) {
        
        System.out.println("### INICIO DE PRUEBAS DE ASOCIACIÓN ###");

        //================================================================================
        System.out.println("\n--- CASO 1: Objetos creados por separado y enlazados con el método set() ---");
        //================================================================================
        
        // 1. Creamos un propietario y una computadora de forma independiente
        Propietario prop1 = new Propietario("Ana", "30.111.222");
        Computadora comp1 = new Computadora("HP", "HP-SN-001", "Z490", "Intel");
        
        System.out.println("Estado inicial:");
        System.out.println(prop1);
        System.out.println(comp1);
        
        // 2. Los enlazamos usando el método set. Esto establecerá la relación en ambos objetos.
        System.out.println("\n... Enlazando comp1 con prop1...");
        comp1.setPropietario(prop1);
        
        System.out.println("\nEstado final (después de enlazar):");
        System.out.println(prop1);
        System.out.println(comp1);
        System.out.println("Verificación cruzada: El nombre del propietario de la comp1 es: " + comp1.getPropietario().getNombre());


        //================================================================================
        System.out.println("\n--- CASO 2: Se crea la Computadora pasándole un Propietario en el constructor ---");
        //================================================================================
        
        // 1. Creamos un propietario
        Propietario prop2 = new Propietario("Luis", "35.333.444");
        
        // 2. Creamos la computadora usando el constructor sobrecargado. La relación se crea al instante.
        Computadora comp2 = new Computadora("Dell", "DELL-SN-002", "B550", "AMD", prop2);
        
        System.out.println("\nEstado final (creados y enlazados al mismo tiempo):");
        System.out.println(prop2);
        System.out.println(comp2);
        System.out.println("Verificación cruzada: El S/N de la computadora de Luis es: " + prop2.getComputadora().getNumeroSerie());
        
        
        //================================================================================
        System.out.println("\n--- CASO 3: Se crea el Propietario pasándole una Computadora en el constructor ---");
        //================================================================================
        
        // 1. Creamos una computadora
        Computadora comp3 = new Computadora("Lenovo", "LEN-SN-003", "X570", "AMD");
        
        // 2. Creamos el propietario usando el constructor sobrecargado.
        Propietario prop3 = new Propietario("Carla", "40.555.666", comp3);
        
        System.out.println("\nEstado final (creados y enlazados al mismo tiempo):");
        System.out.println(prop3);
        System.out.println(comp3);
        System.out.println("Verificación cruzada: El propietario de la Lenovo es: " + comp3.getPropietario().getNombre());
    }
}
