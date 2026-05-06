package parcial1;

import java.util.ArrayList;
import java.util.List;

public class PruebaFabrica {

    public static void main(String[] args) {

       
        ArrayList<Empleado> empleados = new ArrayList<>();

       
        Concepto concepto1 = new RemuneracionValorFijo(1, "Presentismo", 30000, 149999);
        Concepto concepto2 = new RemuneracionValorVariable(2, "Premio por desempeño", 3);
        Concepto concepto3 = new Deduccion(3, "Jubilacion", 11);
        Concepto concepto4 = new Deduccion(4, "Obra Social", 3);
        Concepto concepto5 = new Deduccion(5, "Cuota sindical", 2);

        
        ArrayList<Concepto> conceptosEmpleado1 = new ArrayList<>();
        conceptosEmpleado1.add(concepto1);
        conceptosEmpleado1.add(concepto2);
        conceptosEmpleado1.add(concepto3);
        conceptosEmpleado1.add(concepto4);
        Empleado empleado1 = new Empleado("20-12345678-1", "juan", "perez",Sector.ADMINISTRACION, 1000000, conceptosEmpleado1);
        empleados.add(empleado1);

        
        ArrayList<Concepto> conceptosEmpleado2 = new ArrayList<>();
        conceptosEmpleado2.add(concepto1);
        conceptosEmpleado2.add(concepto3);
        conceptosEmpleado2.add(concepto4);
        Empleado empleado2 = new Empleado("20-12345678-2", "arturo", "lopez", Sector.ADMINISTRACION, 1100000, conceptosEmpleado2);
        empleados.add(empleado2);

      
        ArrayList<Concepto> conceptosEmpleado3 = new ArrayList<>();
        conceptosEmpleado3.add(concepto1);
        conceptosEmpleado3.add(concepto2);
        conceptosEmpleado3.add(concepto3);
        conceptosEmpleado3.add(concepto4);
        Empleado empleado3 = new Empleado("20-12345678-3", "lola", "mentovich", Sector.PRODUCCION,  1300000,conceptosEmpleado3);
        empleados.add(empleado3);

        
        ArrayList<Concepto> conceptosEmpleado4 = new ArrayList<>();
        conceptosEmpleado4.add(concepto1);
        conceptosEmpleado4.add(concepto2);
        conceptosEmpleado4.add(concepto3);
        conceptosEmpleado4.add(concepto5); // Cuota sindical
        Empleado empleado4 = new Empleado("20-12345678-4", "estela", "drillazo",  Sector.VENTAS,1100000,conceptosEmpleado4);
        empleados.add(empleado4);

  
        Fabrica miFabrica = new Fabrica("la piadosa", empleados);

        
        System.out.println("--- Listado de todos los sueldos a pagar ---");
        miFabrica.listarTodosLosSueldosAPagar();
        System.out.println();

        
        System.out.println("--- Conceptos del empleado Juan Perez ---");
        miFabrica.mostrarConceptosDeUnEmpleado("20-12345678-1");
        System.out.println();

        
        System.out.println("--- Empleados con el mejor sueldo del sector ADMINISTRACION ---");
        List<Empleado> mejoresEmpleadosAdmin = miFabrica.obtenerEmpleadosMejorSueldoUnSector(Sector.ADMINISTRACION);
        for (Empleado emp : mejoresEmpleadosAdmin) {
            System.out.println("Nombre: " + emp.getNombreCompleto() + ", CUIL: " + emp.getCuil() + ", Sueldo: " + emp.getSueldoAPagar());
        }
        System.out.println();

        System.out.println("Gracias por usar nuestro programa!!");
    }
}