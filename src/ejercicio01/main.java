/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio01;

/**
 *
 * @author Daniela Nahir Romero
 */
public class main {
     public static void main(String[] args) {
        
        Titular titular = new Titular("40.123.456", "Daniela Romero");
        Pasaporte pasaporte = new Pasaporte("ARG12345XYZ", "26-09-2025", "/img/foto_pasaporte_dani.jpg", "JPG");
        
        pasaporte.setTitular(titular);
        
        System.out.println("------------------------------------");
        System.out.println("IMPRIMIENDO OBJETOS:");
        System.out.println("------------------------------------");

        
        System.out.println(pasaporte);
        
        System.out.println();
        
        System.out.println(titular);
    }
}
