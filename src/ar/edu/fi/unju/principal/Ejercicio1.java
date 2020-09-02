/**
 * 
 */
package ar.edu.fi.unju.principal;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import ar.edu.fi.unju.manager.EmpleadoManager;
import ar.edu.fi.unju.model.Empleado;
import ar.edu.unju.fi.utilerias.Utileria;

/**
 * @author Aucachi Fabian
 *
 */
public class Ejercicio1 {
	
	 public static void main(String[] args) {
		EmpleadoManager lista = new EmpleadoManager();
		Scanner leer = new Scanner(System.in);
		Utileria utils = new Utileria();
		int opc = 0;
		List<Empleado> listaEmpleadoUso = new ArrayList<Empleado>();
		List<Empleado> listaPunto5 = new ArrayList<Empleado>();
		do {
			utils.menu();
			opc = leer.nextInt();
			switch(opc)
			{
			case 1:
				System.out.println("ingrese cantidad de empleados que desea crear");
				int cantidad = leer.nextInt();
				lista.cargarEmpleados(cantidad);
				lista.mostrarEmpleados();
				break;
			case 2:
				leer.nextLine();
				System.out.println("Ingrese Nombre del empleado");
				String patronBusqueda = leer.nextLine();		
				listaEmpleadoUso = lista.empleadosBusqueda(patronBusqueda);
				lista.mostrarEmpleados(listaEmpleadoUso);
				System.out.println("El promedio de los salarios es " + lista.promedioSalarios(listaEmpleadoUso));
			    break;
			case 3:
				System.out.println("");
				System.out.println("Ingrese Antiguedad");
				int antiguedad = leer.nextInt();		
				listaEmpleadoUso = lista.empleadosBusqueda(antiguedad);
				lista.mostrarEmpleados(listaEmpleadoUso);
				System.out.println("El acumulado de la busqueda es $" + lista.totalSalarios(listaEmpleadoUso));
				break;
			case 4:
				System.out.println("");
				System.out.println("Ingrese DNI");
				String dni = leer.next();
				if(lista.buscarEmpleadoDni(dni)!=null)
				   {listaPunto5 = lista.ultimoPunto(lista.buscarEmpleadoDni(dni), listaPunto5);
				   System.out.println("segunda lista");
				   lista.mostrarEmpleados(listaPunto5);;}
				else
					System.out.println("no existe ningun empleado con ese dni");
				break;
			case 5:
				lista.mostrarEmpleados();
				break;
			case 6:
				lista.mostrarEmpleados(listaPunto5);
			case 7:
				System.out.println("SALIDA");
			default:
				System.out.println("Opcion invalida");
			}
		} while(opc!=7);
	 }     
}

