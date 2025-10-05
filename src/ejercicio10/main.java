/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio10;

/**
 *
 * @author Daniela Nahir Romero
 */
public class main {
     public static void main(String[] args) {
        //Creamos 2 titulares
        Titular titularPrincipal = new Titular("Martín López", "30.123.456");
        Titular titularSecundario = new Titular("Ana Gómez", "25.987.654");
        System.out.println("Titular Creado: " + titularPrincipal);
        System.out.println("Titular Creado: " + titularSecundario);

        //Creamos la Cuenta Bancaria
        System.out.println("Creando Cuenta Bancaria (COMPOSICIÓN:ClaveSeguridad)...");
        CuentaBancaria cuenta1 = new CuentaBancaria(
            "00000000001234567890", 
            15000.75, 
            "XYZ-999-HASH", 
            "2024-05-01"
        );
        
        cuenta1.mostrarDetalle();

        //ASOCIACIÓN BIDIRECCIONAL: Vinculación del Titular
        System.out.println("Vinculando Titular a la Cuenta (Asociación Bidireccional)...");
        // Al llamar a setTitular, el vínculo se establece en ambas direcciones automáticamente.
        cuenta1.setTitular(titularPrincipal); 

        cuenta1.mostrarDetalle();

        //Comprobamos de la Bidireccionalidad
        System.out.println("Comprobamos de Bidireccionalidad:");
        System.out.println("Cuenta: ¿Quién es el Titular? -> " + cuenta1.getTitular().getNombre());
        CuentaBancaria cuentaTitular = titularPrincipal.getCuentaAsignada();
        String cbuAsignado = (cuentaTitular != null) ? cuentaTitular.getCbu() : "Ninguna";
        System.out.println("Titular: ¿Cuál es la Cuenta? -> " + cbuAsignado);
         System.out.println("");
         
        // Cambiamos el titular a Ana Gómez
        System.out.println("Prueba de CAMBIO de Titular...");  
        cuenta1.setTitular(titularSecundario);
        System.out.println("Nuevo Titular: " + cuenta1.getTitular().getNombre());
        
        // Comprobamos que el titular anterior (Martín López) se desvinculó correctamente
        String estadoCuentaMartín = (titularPrincipal.getCuentaAsignada() == null) ? "Ninguna (Desvinculado)" : "Asignada";
        System.out.println("Estado de cuenta en Titular Martín López: " + estadoCuentaMartín);


        // PRUEBA DE CICLO DE VIDA (Composición vs. Asociación)
         System.out.println("");
        System.out.println("Prueba de Ciclo de Vida (Borrado de Cuenta)...");
        
        // Almacenamos referencias para la prueba
        ClaveSeguridad claveAnterior = cuenta1.getClave();
        Titular titularAnt = cuenta1.getTitular();

        cuenta1 = null; // Borramos la referencia a la Cuenta (Dueño de la Composición)

        // Composición: La clave no tiene sentido sin la cuenta.
        System.out.println("COMPOSICIÓN: La Clave "+claveAnterior+ " (parte de la Cuenta) queda sin dueño.");
        
        // Asociación Bidireccional: El Titular sigue existiendo.
        System.out.println("ASOCIACIÓN: El Titular (" + titularAnt.getNombre() + ") sigue existiendo.");
    }
}
