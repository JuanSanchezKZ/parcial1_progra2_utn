Para el siguiente ejercicio, se debe realizar el diagrama UML y escribir el código Java. Se deben desarrollar los métodos indicados por las funcionalidades y también cualquier otro que fuera necesario para cumplir con las mismas,  en las clases en que corresponda.

Se debe entregar el diagrama de clases UML en formato .uxf y el proyecto Java exportado de Netbeans en formato .zip

No se aceptarán archivos .pdf. Los archivos deben ser subidos al campus en el link de la actividad “primer parcial”. No se recibirán archivos que se envíen por correo electrónico. La resolución no debe incluir técnicas aún no enseñadas durante el curso.

Una fábrica nos pide un programa para administrar el cálculo de los sueldos de sus empleados. De la fábrica conocemos su nombre y la lista de sus empleados. 

De cada empleado conocemos su cuil (que es el dato que los identifica), su nombre, su apellido, un valor base que se usa para calcular su sueldo básico y el sector en el que trabaja. Estos sectores pueden ser ADMINISTRACION, VENTAS y PRODUCCION.  Cada uno de estos sectores tiene asociado un coeficiente fijo que se usa para el cálculo del básico de los empleados.

Además de cada empleado tenemos la colección de conceptos que componen su sueldo. La suma y resta de ellos compone el sueldo que se le pagará, como se ve en este ejemplo:

id

Descripción

Remuneración

Deducción

1

Básico

1000000

2

Presentismo

10000

3

Jubilación

12100

4

Obra Social

30300

Sueldo a pagar  967.600

Todos los conceptos tendrán un id (int) y una descripción (String). Las remuneraciones se suman al sueldo y las deducciones son descuentos sobre el mismo. La suma de remuneraciones menos las deducciones dan el sueldo a pagar. 

Cada concepto tiene la funcionalidad obtenerImporte(), que recibe por parámetro el valor que usará para hacer el cálculo. En el caso de las remuneraciones, se envía el sueldo básico y en el caso de las deducciones, se envía el  valor del total bruto.

El valor del sueldo básico se obtiene multiplicando el valor base (base para básico) de cada empleado por el coeficiente asociado al sector en el que trabaja.

El total bruto es la suma de todas las remuneraciones.

El sueldo a pagar a un empleado se calcula así: básico + total de remuneraciones - total de deducciones.

Los conceptos pueden ser de distintos tipos y cada uno tiene un modo de cálculo para obtener su importe:

Remuneración por valor fijo: tienen un importe fijo y un valor mínimo de básico a partir del cual se pagan. Si el básico no supera el valor mínimo, el valor que se obtiene será cero, de lo contrario se obtendrá el importe fijo del concepto. Un ejemplo puede ser un premio por presentismo.

Remuneración por valor variable: tienen un porcentaje que se aplicará sobre un valor recibido como parámetro. El valor que  se obtiene será el resultado de aplicar el porcentaje sobre el valor recibido. Un ejemplo puede ser un premio por buen desempeño.

Deducción: tienen un porcentaje de descuento. El valor que se obtiene resulta de aplicar ese porcentaje  sobre un valor recibido como parámetro . Ejemplos de deducciones son el aporte para jubilación, para obra social, etc. Son conceptos que restan en el sueldo a percibir.

El programa debe resolver las siguientes funcionalidades:

listarTodosLosSueldosAPagar: para cada empleado mostrará por pantalla su nombre y su sueldo.

mostrarConceptosDeUnEmpleado: si existe el empleado cuyo cuil se recibe como parámetro, se mostrará por pantalla su nombre y el detalle de sus conceptos con sus importes y el total a pagar.

obtenerEmpleadosMejorSueldoUnSector: devuelve los empleados con mayores sueldos del sector recibido como parámetro.

Se provee la clase PruebaFabrica, con la creación del objeto Fabrica y la creación de empleados y conceptos ya codificada. El método constructor de Fabrica recibe la lista de empleados ya creada. El método constructor de Empleado recibe la lista de sus conceptos ya creada.

Al crearse la Fábrica ya recibe sus Empleados y sus Conceptos. Por lo tanto ustedes NO deben contemplar funcionalidades para agregar empleados ni agregar conceptos.

Pueden modificar la clase PruebaFabrica para que funcione de acuerdo a los nombres que ustedes asignen a cada clase. 

Ejemplo de salida del Listado de todos los sueldos a pagar:

Empleado

C.U.I.L.

Sueldo a pagar

JUAN PEREZ

20-12345678-1

200000

JOSE LOPEZ

20-12345678-2

300000

Ejemplo de salida de mostrar los conceptos de un empleado :

id

Descripción

Remuneración

Deducción

1

Básico

1000000

2

Presentismo

10000

3

Jubilación

12100

4

Obra Social

30300

Sueldo a pagar  967.600
