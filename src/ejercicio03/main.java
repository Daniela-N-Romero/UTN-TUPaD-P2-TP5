/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio03;

/**
 *
 * @author Daniela Nahir Romero
 */
public class main {
       public static void main(String[] args) {
        

        Autor autor1 = new Autor("Gabriel García Márquez", "Colombiana");
        Autor autor2 = new Autor("Jane Austen", "Británica");
        
        Editorial editorial1 = new Editorial("Penguin Random House", "Buenos Aires 5422");
        Editorial editorial2 = new Editorial("Editorial Planeta", "Avenida Mitre 10");
        
        Libro libro1 = new Libro("Cien años de soledad", "978-84-397-1721-5", editorial1);
        libro1.setAutor(autor1); 
        
        Libro libro2 = new Libro("Orgullo y Prejuicio", "978-84-08-07508-3", editorial2);
        // libro2.setAutor(autor2); // Se omite el setter para simular que es 'null'
        
     
        System.out.println("--- Información de Libros ---");
        System.out.println("\nLibro 1:");
        System.out.println("Título: " + libro1.getTitulo());
        System.out.println("ISBN: " + libro1.getIsbn());
        System.out.println("Editorial: " + libro1.getEditorial());
        System.out.println("Autor: "+libro1.getAutor());
                
        System.out.println("\nLibro 2:");
        System.out.println("Título: " + libro2.getTitulo());
        System.out.println("Editorial: " + libro2.getEditorial());
        System.out.println("ISBN: " + libro1.getIsbn());
        System.out.println("Autor: "+libro2.getAutor());
                
    }
}
