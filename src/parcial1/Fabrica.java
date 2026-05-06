package parcial1;
import java.util.ArrayList;

public class Fabrica {
    private String nombre;
    private ArrayList<Empleado> empleados;

    public Fabrica(String nombre, ArrayList<Empleado> empleados) {
        this.nombre = nombre;
        this.empleados = empleados;
    }
    
    public void listarTodosLosSueldosAPagar() {
        System.out.println("Empleado\t\tC.U.I.L.\t\tSueldo a pagar");
        System.out.println("---------------------------------------------------------");
        for (Empleado empleado : empleados) {
            System.out.printf("%-15s\t%-15s\t%.2f\n", 
                empleado.getNombreCompleto(), 
                empleado.getCuil(), 
                empleado.getSueldoAPagar());
        }
    }

    public void mostrarConceptosDeUnEmpleado(String cuil) {
        for (Empleado empleado : empleados) {
            if (empleado.getCuil().equals(cuil)) {
                System.out.println("id\tDescripcion\t\t\tImporte");
                System.out.println("-----------------------------------------");

                // Estos valores son necesarios para los cálculos
                double sueldoBasico = empleado.getSueldoBasico();
                double totalBruto = empleado.getTotalBruto();
                
                for (Concepto concepto : empleado.getConceptos()) {
                    double importe = 0.0;
                    if (concepto instanceof Remuneracion) {
                        importe = concepto.obtenerImporte(sueldoBasico);
                    } else if (concepto instanceof Deduccion) {
                        importe = concepto.obtenerImporte(totalBruto);
                    }
                    System.out.printf("%d\t%-25s\t%.2f\n", 
                        concepto.getId(), 
                        concepto.getDescripcion(), 
                        importe);
                }
                System.out.println("-----------------------------------------");
                System.out.printf("Sueldo a pagar: %.2f\n", empleado.getSueldoAPagar());
                return;
            }
        }
        System.out.println("No se encontró un empleado con el CUIL: " + cuil);
    }
    
    public ArrayList<Empleado> obtenerEmpleadosMejorSueldoUnSector(Sector sector) {
        double sueldoMaximo = 0;
        ArrayList<Empleado> mejoresEmpleados = new ArrayList<>();

        for (Empleado empleado : empleados) {
            if (empleado.getSector() == sector) {
                double sueldoActual = empleado.getSueldoAPagar();
                if (sueldoActual > sueldoMaximo) {
                    sueldoMaximo = sueldoActual;
                }
            }
        }
        
        for (Empleado empleado : empleados) {
            if (empleado.getSector() == sector && empleado.getSueldoAPagar() == sueldoMaximo) {
                mejoresEmpleados.add(empleado);
            }
        }
        return mejoresEmpleados;
    }
}