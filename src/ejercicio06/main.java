/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio06;

/**
 *
 * @author Daniela Nahir Romero
 */
public class main {
        public static void main(String[] args) {
        
        // Objetos Cliente (Existen independientemente de la Reserva)
        Cliente clienteRegular = new Cliente("Roberto Gómez", "11-4444-5555");
        Cliente clienteNuevo = new Cliente("Sofía Pérez", "11-3333-2222");

        // Objetos Mesa (Existen independientemente de la Reserva)
        Mesa mesaTerraza = new Mesa("03", 4);
        Mesa mesaBarra = new Mesa("11", 2);

        System.out.println("\n--- OBJETOS BASE CREADOS ---");
        System.out.println(clienteRegular.toString());
        System.out.println(mesaTerraza.toString());


        // usamos constructor de 3 parámetros.
        System.out.println("\n--- CASO 1:  AGREGACIÓN EN CONSTRUCTOR, ASOCIACIÓN CON SETTER ---");
        
        // la Mesa se pasa en el constructor obligatoriamente.
        Reserva reserva1 = new Reserva("2024-12-05", "21:00", mesaTerraza);
        reserva1.mostrarDetalles();
        System.out.println("---- Asociamos al cliente ----");
        reserva1.setCliente(clienteRegular); // usamos el setter para vincular el cliente
        reserva1.mostrarDetalles();


        //usamos el constructor de 4 parámetros.
        System.out.println("\n--- CASO 2: AGREGACIÓN Y ASOCIACIÓN INMEDIATA (SOBRECARGA) ---");
        
        Reserva reserva2 = new Reserva("2024-12-06", "19:00", mesaBarra, clienteNuevo);
        reserva2.mostrarDetalles();

        //como Mesa es obligatoria en ambos constructores estamos ante una agregación
    }
}
