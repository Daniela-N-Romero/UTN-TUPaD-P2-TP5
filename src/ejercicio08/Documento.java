/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio08;

/**
 *
 * @author Daniela Nahir Romero
 */
public class Documento {

    private String titulo;
    private String contenido;
    private FirmaDigital firma;

    //Constructor (Implementa COMPOSICIÓN): Requiere una FirmaDigital (y, por extensión, un Usuario) para ser creada.
    public Documento(String titulo, String contenido, String codigoHash, String fecha, Usuario usuario) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.firma = new FirmaDigital(codigoHash, fecha, usuario); 
    }
    
    // Getters
    public String getTitulo() { return titulo; }
    public String getContenido() { return contenido; }
    public FirmaDigital getFirma() { return firma; }

    /**
     * Muestra el detalle del Documento y su Firma.
     */
    public void mostrarDetalle() {
        System.out.println("--- Detalle del Documento ---");
        System.out.println("Título: " + titulo);
        System.out.println("Contenido (extracto): " + contenido);        
        System.out.println("\n[Detalle de Firma]");
        System.out.println(firma.toString());
        System.out.println(firma.getUsuario().toString()); // Acceso al Usuario via Firma
        System.out.println("-----------------------------");
    }
}
