/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio12_dep_de_uso;

/**
 *
 * @author Daniela Nahir Romero
 */
public class Calculadora {
     private String nombre = "Calculadora Fiscal";

    public void calcular(Impuesto impuesto) {
        double montoBase = impuesto.getMonto();
        double IVA = montoBase * 0.21; // Penalidad del 15%
        double total = montoBase + IVA;

        System.out.println("\n--- Ejecutando Cálculo Fiscal ---");
        System.out.printf("[%s] Calculando Impuesto para %s...\n", nombre, impuesto.getContribuyente().getNombre());
        System.out.printf("  Monto Base: $%.2f\n", montoBase);
        System.out.printf("  IVA (21%%): $%.2f\n", IVA);
        System.out.printf("  MONTO TOTAL: $%.2f\n", total);
        System.out.println("---------------------------------");
    }
}
