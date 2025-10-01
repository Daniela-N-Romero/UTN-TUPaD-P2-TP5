/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio07;

/**
 *
 * @author Daniela Nahir Romero
 * En este caso probe la posibilidad de usar cosas nuevas como el String.format()
 * Y también me pareció interesante descubrir que si no eliminaba la referencia del conductor antiguo
 * este segui apuntando al vehiculo
 */
public class main {
    public static void main(String[] args) {
    
        // creamos el motor y los conductores
        Motor motor = new Motor("Gasolina V6", "MG-4590-B");
       
        Conductor conductorAntiguo = new Conductor("María Solís", "MS-3210");
        Conductor conductorNuevo = new Conductor("Juan Pérez", "JP-6789");

        // creamos el vehiculo: necesitamos usar elmotor en el constructor
        Vehiculo cocheFamiliar = new Vehiculo("XYZ-888", "Honda CRV", motor);
        System.out.println("---- Mostramos Vehiculo 1: ----");
        cocheFamiliar.mostrarDetalle(); 
        
        // usamos el setter en la clase Vehiculo (y la bidireccionalidad se crea automaticamente).
        System.out.println("Vinculando Chofer Principal (María Solís) al Vehículo...");
        cocheFamiliar.setConductor(conductorAntiguo); 
       
        cocheFamiliar.mostrarDetalle(); 
        
        // verificamos la bidireccionalidad automática:
        System.out.println("\nComprobando bidireccionalidad:");
        System.out.println("Vehículo '" + cocheFamiliar.getPatente() + "' asignado a: " + 
                           cocheFamiliar.getConductor().getNombre());
        System.out.println("Conductor '" + conductorAntiguo.getNombre() + "' tiene asignado el vehículo: " + 
                           conductorAntiguo.getVehiculoAsignado()+"\n");
        

        System.out.println("Cambiamos el chofer...");
        
        //coprobamos que se pueda cambiar el conductor y el setter funcione
        System.out.println("Vinculando Chofer Suplente (Juan Pérez)...");
        cocheFamiliar.setConductor(conductorNuevo); 
        
        System.out.println("\nComprobamos el cambio correcto:");
        cocheFamiliar.mostrarDetalle();
        
        // verificamos la bidireccionalidad automática otra vez
        System.out.println("\nComprobando bidireccionalidad:");
        System.out.println("Vehículo '" + cocheFamiliar.getPatente() + "' asignado a: " + 
                           cocheFamiliar.getConductor().getNombre());
        System.out.println("Conductor '" + conductorNuevo.getNombre() + "' tiene asignado el vehículo: " + 
                           conductorNuevo.getVehiculoAsignado()+"\n");
        
        
        System.out.println("Estado del conductor antigüo (María Solís):");
        // Verifica que María Solís ya no tiene un vehículo asignado
        String vehiculoAnterior = (conductorAntiguo.getVehiculoAsignado() == null) ? "Ninguno (Desvinculada)" : conductorAntiguo.getVehiculoAsignado();
        System.out.println("   Vehículo Asignado: " + vehiculoAnterior);
        
    }
    
}
