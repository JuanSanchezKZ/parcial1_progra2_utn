/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial1;

/**
 *
 * @author Juan
 */
public class RemuneracionValorFijo extends Remuneracion {
    private double importeFijo;
    private double valorMinimoBasico;

    public RemuneracionValorFijo(int id, String descripcion, double importeFijo, double valorMinimoBasico) {
        super(id, descripcion);
        this.importeFijo = importeFijo;
        this.valorMinimoBasico = valorMinimoBasico;
    }

    @Override
    public double obtenerImporte(double sueldoBasico) {
        return (sueldoBasico > valorMinimoBasico) ? importeFijo : 0.0;
    }
}