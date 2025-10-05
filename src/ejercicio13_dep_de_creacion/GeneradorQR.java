/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio13_dep_de_creacion;

/**
 *
 * @author Daniela Nahir Romero
 */
public class GeneradorQR {
    private int contador = 0; // Uso interno para fines de demostración

    public CodigoQR generar(String valorBase, Usuario usuario) {
        contador++;
        String valorFinal = String.format(valorBase + contador);
        
        System.out.println("\n--- GeneradorQR creando objeto CodigoQR... ---");
        
        // LA CLAVE: El objeto CodigoQR nace aquí.
        CodigoQR nuevoQR = new CodigoQR(valorFinal);
        nuevoQR.setUsuario(usuario); 
                
        System.out.println("--- Creación Exitosa (Objeto creado y devuelto) ---");
        System.out.println("");
        
        // El método devuelve el objeto creado, pero el GeneradorQR no lo almacena.
        return nuevoQR;
    }
}
