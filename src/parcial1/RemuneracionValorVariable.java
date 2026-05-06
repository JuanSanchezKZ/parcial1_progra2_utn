/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial1;

/**
 *
 * @author Juan
 */
public class RemuneracionValorVariable extends Remuneracion {
    private double porcentaje;

    public RemuneracionValorVariable(int id, String descripcion, double porcentaje) {
        super(id, descripcion);
        this.porcentaje = porcentaje;
    }

    @Override
    public double obtenerImporte(double sueldoBasico) {
        return sueldoBasico * (porcentaje / 100);
    }
}
