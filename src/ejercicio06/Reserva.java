/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio06;

/**
 *
 * @author Daniela Nahir Romero
 */
public class Reserva {
    private String fecha;
    private String hora;
    private Cliente cliente;
    private Mesa mesa;

    public Reserva(String fecha, String hora, Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;
        this.mesa = mesa;
    }

    public Reserva(String fecha, String hora, Mesa mesa, Cliente cliente) {
        this(fecha, hora, mesa);
        if (cliente != null) {
            this.cliente = cliente; 
        }
    }
    
    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }


    @Override
    public String toString() {
        String clienteNombre = (cliente != null) ? cliente.getNombre() : "Pendiente";
        return "Reserva\nFecha: " + fecha + ", hora: " + hora + 
               ",\nCliente: " + clienteNombre + ",\nMesa: " + mesa.getNumero();
    }
    
    public void mostrarDetalles(){
        System.out.println(this.toString());
    }
}
