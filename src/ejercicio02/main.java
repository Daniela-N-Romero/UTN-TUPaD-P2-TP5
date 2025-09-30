/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio02;

/**
 *
 * @author Daniela Nahir Romero
 */
public class main {


    public static void main(String[] args) {

        // 1. Creamos las "partes"
        Bateria bateriaSamsung = new Bateria("ABAB-5000", "4000mAh");
        Bateria bateriaExtra = new Bateria("PBPB1000", "2200mAh"); 
        
        // También creamos un usuario
        Usuario usuario = new Usuario("38.765.432", "Carlos Gomez");
        
        // 2. Creamos el "todo" (Celular) y le PASAMOS el objeto Bateria que ya existía.
        Celular celular = new Celular("123456789012345", "Samsung", "Galaxy S21", bateriaSamsung);

        // 3. Vinculamos el celular con su usuario (Asociación Bidireccional)
        celular.setUsuario(usuario);
  
        // 4. Imprimimos los objetos para ver su estado final
        System.out.println(celular);
        System.out.println();
        System.out.println(usuario);
        System.out.println();
        
        // Demostramos que la otra batería sigue existiendo de forma independiente
        System.out.println("Componente sobrante: " + bateriaExtra.toString());
    }
    
}
