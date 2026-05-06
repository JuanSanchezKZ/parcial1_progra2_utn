package parcial1;
import java.util.ArrayList;
/**
 *
 * @author Marcelo
 */
public class Empleado {
    
    private String cuil,nombre,apellido;
    private double baseParaBasico;
    private Sector sectorDetrabajo;

    private ArrayList<Concepto> conceptos;
    
    public Empleado(String cuil, String nombre, String apellido, Sector suSector, double base, ArrayList<Concepto> conceptos){
 
    /*  setear los atributos. COMPLETAR...*/

    this.cuil = cuil;
    this.nombre = nombre;
    this.apellido = apellido;
    this.sectorDetrabajo = suSector;
    /*  carga los conceptos recibidos como param.*/
    this.conceptos = conceptos;
    this.baseParaBasico = base;
    }

    /*  RESTO A COMPLETAR POR EL ALUMNO...*/
    
  
    public double getSueldoBasico() {
        return baseParaBasico * sectorDetrabajo.getCoeficienteBasico();
    }

  
    public double getTotalBruto() {
        double totalBruto = getSueldoBasico();
        for (Concepto concepto : conceptos) {
            if (concepto instanceof Remuneracion) {
                totalBruto += concepto.obtenerImporte(getSueldoBasico());
            }
        }
        return totalBruto;
    }

   
    public double getSueldoAPagar() {
        double totalBruto = getTotalBruto();
        double totalDeducciones = 0;
        for (Concepto concepto : conceptos) {
            if (concepto instanceof Deduccion) {
                totalDeducciones += concepto.obtenerImporte(totalBruto);
            }
        }
        return totalBruto - totalDeducciones;
    }
    
   
    public String getCuil() {
        return cuil;
    }
    
    public String getNombreCompleto() {
        return nombre + " " + apellido;
    }

    public Sector getSector() {
        return sectorDetrabajo;
    }

    public ArrayList<Concepto> getConceptos() {
        return conceptos;
    }
    
}   
