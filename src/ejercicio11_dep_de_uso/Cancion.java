/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio11_dep_de_uso;

/**
 *
 * @author Daniela Nahir Romero
 */
public class Cancion {
    private String titulo;
    private Artista artista;

    public Cancion(String titulo) {
        this.titulo = titulo;
        this.artista = null;
    }

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public Artista getArtista() {
        return artista;
    }
    //setter para Artista
    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public void mostrarDetalle() {
        System.out.println("Título: "+ titulo);
        if (artista != null) {
            System.out.println("Artista:"+ artista.toString());
        } else {
            System.out.println("Artista: Sin asignar (Asociación Opcional)");
        }
    }
}
