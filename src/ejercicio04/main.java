/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio04;

/**
 *
 * @author Daniela Nahir Romero
 */
public class main {
    public static void main(String[] args) {
        

        Banco bancoNacion = new Banco("Banco Nación", "30-50000000-0");
   
        Cliente clienteA = new Cliente("Juan Perez", "12.345.678");
        Cliente clienteB = new Cliente("María Gómez", "25.876.543");
        
        TarjetaDeCredito tarjetaJuan = new TarjetaDeCredito("4560-1234-5678-9012", "12/28", bancoNacion);
        
        // Asociacion Bidireccional (Tarjeta ↔ Cliente)
        // Asignamos la tarjeta a Juan. Automáticamente se enlaza el cliente a la tarjeta tamnién.
        clienteA.setTarjeta(tarjetaJuan); 
               
        // --- Agregación (Tarjeta -> Banco) ---
        System.out.println("\nVERIFICACIÓN DE AGREGACIÓN (Tarjeta -> Banco):");
        System.out.println(tarjetaJuan.getCliente() + " tiene la tarjeta con vencimiento: " + tarjetaJuan.getFechaVencimiento());
        System.out.println("Esta tarjeta pertenece a " + tarjetaJuan.getBanco()); // Usa el toString() de Banco
        
        // --- Asociación Bidireccional (Cliente -> Tarjeta) ---
        System.out.println("\nVERIFICACIÓN DE ASOCIACIÓN (Cliente -> Tarjeta):");
        System.out.println(clienteA); // Uso el toString() de Cliente
        System.out.println("Su tarjeta es: " + clienteA.getInfoTarjeta()); // Uso el toString() de Tarjeta
        
        // --- Asociación Bidireccional (Tarjeta -> Cliente) ---
        System.out.println("\nVERIFICACIÓN DE BIDIRECCIONALIDAD (Tarjeta -> Cliente):");
        System.out.println(tarjetaJuan);
        System.out.println("Asignada al cliente: " + tarjetaJuan.getCliente());

        // --- Caso 2: Cliente sin Tarjeta ---
        System.out.println("\nVERIFICACIÓN DE CLIENTE SIN TARJETA (Opción null):");
        System.out.println(clienteB);
        System.out.println("Su tarjeta es: "+ clienteB.getInfoTarjeta());
    }
}
