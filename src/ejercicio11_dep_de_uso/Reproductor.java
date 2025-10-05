/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio11_dep_de_uso;

/**
 *
 * @author Daniela Nahir Romero
 */
public class Reproductor {
     private String nombre = "Mi Reproductor MP3";

    public void reproducir(Cancion cancion) {
        System.out.println("--- Ejecutando Reproducción ---");
        System.out.println(nombre +" está reproduciendo: "+ cancion.getTitulo());
        
        Artista artista = cancion.getArtista();
        String nombreArtista = (artista != null) ? artista.getNombre() : "Artista Desconocido";
        System.out.println("Del artista: "+ nombreArtista);
        System.out.println("---------------------------------");
    }
}
