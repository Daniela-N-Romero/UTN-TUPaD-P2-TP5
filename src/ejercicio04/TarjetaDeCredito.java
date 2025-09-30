/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio04;

/**
 *
 * @author Daniela Nahir Romero
 */
public class TarjetaDeCredito {
    private String numero;
    private String fechaVencimiento;
    private Cliente cliente;
    private Banco banco;

    public TarjetaDeCredito(String numero, String fechaVencimiento, Banco banco) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.banco = banco;
    }
    
    public void setCliente(Cliente cliente){
        this.cliente = cliente;
        if(cliente != null && cliente.getTarjeta() != this){
            cliente.setTarjeta(this);
        }
    }
    
    public Cliente getCliente() {
        return cliente;
    }

    public Banco getBanco() {
        return banco;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }
    
                
    @Override
    public String toString() {
        return "Tarjeta:" + numero + ", vencimiento: " + fechaVencimiento;
    }
}
