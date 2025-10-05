/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio13_dep_de_creacion;

/**
 *
 * @author Daniela Nahir Romero
 */
public class main {
       public static void main(String[] args) {
        System.out.println("--- EJERCICIO DE DEPENDENCIA DE CREACIÓN (GeneradorQR) ---");
        
        // Crear el Usuario (Entidad para la Asociación)
        Usuario usuario = new Usuario("Fernando Caceres", "fcaceres@tienda.com");
        System.out.println("Usuario Creado: " + usuario);

        // Crear el GeneradorQR (Implementa la Dependencia)
        GeneradorQR generador = new GeneradorQR();

        System.out.println("Prueba de Dependencia de Creación:");
        // Generación 1: La referencia al nuevo objeto es almacenada en 'qr1'
        CodigoQR qr1 = generador.generar("PAGO-123", usuario);
        qr1.mostrarDetalle();
        
        // Generación 2: El Generador no recuerda 'qr1' y crea un objeto nuevo.
        CodigoQR qr2 = generador.generar("PAGO-978", usuario);
        qr2.mostrarDetalle();
        
        //Comprobación Final
           System.out.println("");
        System.out.println("El GeneradorQR creó objetos, pero no los guarda. El ciclo de vida de los QR es manejado por quien llama al método (Main).");
    }
}
