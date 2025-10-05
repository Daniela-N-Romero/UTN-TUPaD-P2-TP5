/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio11_dep_de_uso;

/**
 *
 * @author Daniela Nahir Romero
 */
public class main {
        public static void main(String[] args) {
        System.out.println("--- EJERCICIO DE DEPENDENCIA DE USO (Asociación Opcional) ---");
        
        //Crear el Artista
        Artista artista = new Artista("Los Cafres", "Reggae");
        System.out.println("Artista Creado: " + artista);

        //Crear la Canción sin Artista
        Cancion cancionSinArtista = new Cancion("Si  el amor se cae"); 
        System.out.println("Canción creada:");
        cancionSinArtista.mostrarDetalle();
        
        //Crear una Canción con un Artista
        Cancion cancionCompleta = new Cancion("Tus ojos"); 
        
        //Crear el Reproductor
        Reproductor reproductor = new Reproductor();
        
        //PRUEBA A: Usar la Canción sin asignarle el Artista
        System.out.println("\n--- PRUEBA A: USAR CANCIÓN SIN ARTISTA ---");
        reproductor.reproducir(cancionSinArtista);
       
        //PRUEBA B: Asignar y usar la Canción completa
        System.out.println("\n--- PRUEBA B: ASIGNAR ASOCIACIÓN Y USAR ---");
        System.out.println("Asignando Artista a 'Tus ojos' mediante setter...");
        cancionCompleta.setArtista(artista);
        
        reproductor.reproducir(cancionCompleta);
        
        //Conclusión
        System.out.println("\n--- CONCLUSIÓN ---");
        System.out.println("La Asociación (Cancion->Artista) fue implementada como opcional (0..1) usando el setter,");
        System.out.println("y la Dependencia de Uso (Reproductor.reproducir) funcionó en ambos casos.");
    }
}
