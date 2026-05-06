/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial1;

/**
 *
 * @author Juan
 */
public class Deduccion extends Concepto {
    private double porcentajeDescuento;

    public Deduccion(int id, String descripcion, double porcentajeDescuento) {
        super(id, descripcion);
        this.porcentajeDescuento = porcentajeDescuento;
    }

    @Override
    public double obtenerImporte(double totalBruto) {
        return totalBruto * (porcentajeDescuento / 100);
    }
}