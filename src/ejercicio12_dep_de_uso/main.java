/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio12_dep_de_uso;

/**
 *
 * @author Daniela Nahir Romero
 */
public class main {
       public static void main(String[] args) {
        System.out.println("--- EJERCICIO DE DEPENDENCIA DE USO (Calculadora) ---");
        
        // 1. Crear el Contribuyente (Entidad independiente)
        Contribuyente contribuyente = new Contribuyente("Juan Pablo Gómez", "20-35678912-3");
        System.out.println("1. Contribuyente Creado: " + contribuyente);

        // 2. Crear el Impuesto (Asociación -> requiere el objeto Contribuyente)
        Impuesto impuesto = new Impuesto(1500.75); 
        impuesto.setContribuyente(contribuyente);
        
        System.out.println("\n2. Impuesto Creado:");
        impuesto.mostrarDetalle();
                        
        // 3. Crear la Calculadora (Implementa la Dependencia)
        Calculadora calculadora = new Calculadora();
        System.out.println("\n3. Calculadora Fiscal Creada...");

        // 4. PRUEBA DE DEPENDENCIA DE USO
        // El objeto Calculadora usa el objeto Impuesto solo en este método.
        System.out.println("\n4. Prueba de Dependencia de Uso:");
        calculadora.calcular(impuesto);
        
        System.out.println("La Calculadora no almacena el Impuesto ni el Contribuyente; solo usó el Impuesto como parámetro para obtener los datos.");
    }
}
