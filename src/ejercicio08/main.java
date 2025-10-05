/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio08;

/**
 *
 * @author Daniela Nahir Romero
 */
public class main {
    
    public static void main(String[] args) {
        System.out.println("--- PRUEBA DE DOCUMENTO - FIRMA DIGITAL - USUARIO ---");
        System.out.println("--- Composición PURA (D->F) y Agregación (F->U) ---");

        // 1. Crear el objeto Usuario (PARA LA AGREGACIÓN)
        // El Usuario debe existir antes que la Firma (Agregación)
        System.out.println("\n1. Creando Usuario (Entidad independiente)...");
        Usuario usuarioFirmante = new Usuario("Daniela Romero", "daniela.r@tupad.com");
        System.out.println("Usuario Creado: " + usuarioFirmante);

        // 2. Crear el Documento (PARA COMPOSICIÓN)
        // El Documento recibe todos los datos (incluyendo el objeto Usuario) y crea la Firma internamente.
        System.out.println("\n2. Creando Documento (Implementa COMPOSICIÓN PURA)...");
        String contenidoDoc = "Este documento es un analisis de datos con SQL...";
        Documento contrato = new Documento(
            "TP SQL", 
            contenidoDoc, 
            "HASH12345",      // Datos para la FirmaDigital
            "2025-10-05",     // Datos para la FirmaDigital 
            usuarioFirmante   // Objeto Usuario (Agregación en FirmaDigital)
        );
        
        System.out.println("Documento Creado: " + contrato.getTitulo());
        contrato.mostrarDetalle();

        // 3. PRUEBA DE CICLO DE VIDA (Composición vs. Agregación)
        
        System.out.println("\n--- 3. PRUEBA DE RELACIONES ---");
        
        // Almacenamos la referencia de la Firma ANTES de borrar el Documento
        FirmaDigital firmaAnterior = contrato.getFirma();
        
        // 'Borramos' el Documento. En Composición, esto implica que la Firma también muere.
        contrato = null; 
        
        System.out.println("\nDocumento ha sido 'borrado' (contrato = null).");
        
        // Comprobación de Agregación: El Usuario sigue existiendo.
        System.out.println("¿El Usuario '" + usuarioFirmante.getNombre() + "' sigue existiendo? SÍ.");
        System.out.println(usuarioFirmante);
        
        // Comprobación de Composición: La Firma fue eliminada conceptualmente junto a su dueño (Documento).
        System.out.println("\nLa Firma que fue parte del Documento (guardada en una variable antes de la eliminación):");
        System.out.println(firmaAnterior);

        System.out.println("Esto demuestra que el Usuario es independiente (Agregación), mientras que la Firma nació con el Documento (Composición).");

    }
}
