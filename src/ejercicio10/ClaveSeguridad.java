/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio10;

/**
 *
 * @author Daniela Nahir Romero
 */
public class ClaveSeguridad {
    private String codigo;
    private String ultimaModificacion;

    /**
     * Constructor para inicializar la clave.
     */
    public ClaveSeguridad(String codigo, String ultimaModificacion) {
        this.codigo = codigo;
        this.ultimaModificacion = ultimaModificacion;
    }

    // Getters (para demostración)
    public String getCodigo() {
        return codigo;
    }

    public String getUltimaModificacion() {
        return ultimaModificacion;
    }
    
    @Override
    public String toString() {
        return String.format("ClaveSeguridad [Código (hash): %s, Última Modificación: %s]", codigo, ultimaModificacion);
    }
}
