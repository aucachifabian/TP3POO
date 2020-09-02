/**
 * 
 */
package ar.edu.fi.unju.manager;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import ar.edu.fi.unju.model.Empleado;
import ar.edu.unju.fi.utilerias.Utileria;

/**
 * permite gestionar una lista de empleados.
 * @author Fabian
 *
 */
public class EmpleadoManager {
	/**
	 * variable del metood que crea la lista de objeto Empleado
	 */
	private static List<Empleado> listaEmpleado = new ArrayList<Empleado>();
	
	/*
	 * Variable para Utilizar metodos auxiliares en todos los metodos de la clase 
	 */
	private static Utileria utils = new Utileria();
	
	
	/**
	 * constructor por defecto
	 */
	public EmpleadoManager() {
	}

	
	/**
	 * Metodo que carga una cierta cantidad de empleados con un parametro recibido.
	 * La carga es automatica y anonima.
	 * @param cantidadEmpleados
	 */
	public static void cargarEmpleados(int cantidadEmpleados) {
	
		for(int indice=0; indice<cantidadEmpleados ; indice++)	
		{ Date fecha = new Date(utils.randomEntre(100, 120),utils.randomHasta(12),utils.randomHasta(31));  
		Empleado empleado = new Empleado(indice, utils.randomEntre(3500000, 4200000) +"" , utils.obtenerNombre(utils.randomHasta(8)) +
				            utils.obtenerApellido(utils.randomHasta(8)), fecha , utils.randomSueldo() ,
				            utils.calcularAntiguedad(fecha));
		  listaEmpleado.add(empleado);
		}
	}
	
	/**
	 * Muestra todos los empleados con el formato sobreescrito ToString
	 */
	public static void mostrarEmpleados()
	{
		for(int indice=0;indice < listaEmpleado.size() ; indice++ )
		{
			System.out.println(listaEmpleado.get(indice));
		}
	}
	
	public static void mostrarEmpleados(List<Empleado> lista)
	{
		for(int indice=0;indice < lista.size() ; indice++ )
		{
			System.out.println(lista.get(indice));
		}
	}
	
	/**
	 * Busca los empleados que coindiden con un patron de nombre pasado por parametro, retorna otra lista.
     * @param cadenaBusqueda
	 */
	public static List<Empleado> empleadosBusqueda(String cadenaBusqueda)
	{   cadenaBusqueda.toLowerCase(); //convertimos la cadena a minuscula. 
	    List<Empleado> listaEmpleado2 = new ArrayList<Empleado>();
	    for(int indice=0;indice < listaEmpleado.size() ; indice++ )
		{   if(listaEmpleado.get(indice).getNombre().toLowerCase().contains(cadenaBusqueda))
			  listaEmpleado2.add(listaEmpleado.get(indice));
		}
	  return listaEmpleado2;  
	}
	
	/**
	 * Busca los empleados que superan o igualan a una antiguedad representada en años pasada por parametro
	 * Retorna una lista.
	 * @param antiguedad
	 */
	public static List<Empleado> empleadosBusqueda(int antiguedad)
	{   List<Empleado> listaEmpleado2 = new ArrayList<Empleado>();
	    for(int indice=0;indice < listaEmpleado.size() ; indice++ )
		{   if(listaEmpleado.get(indice).getAntiguedad()>=antiguedad)
			  listaEmpleado2.add(listaEmpleado.get(indice));
		}
	  return listaEmpleado2;  
	}
	
	/**
	 * Saca el promedio de los salarios, de la lista enviada por parametro.
	 * @param lista
	 * @return promedioSalario
	 */
	public static float promedioSalarios(List<Empleado> lista)
	{   long cantidadEmpleados = 0; double acumuladorSalario = 0;
	    for (Empleado empleado : lista)
	    {   cantidadEmpleados++;
			acumuladorSalario = acumuladorSalario + empleado.getSalario();
	    }
	    return (float) (acumuladorSalario/cantidadEmpleados);
	}
	
	
	
	/**
	 * Metodo de consulta mediante el dni, si encuentra el empleado entonces retorna el objetoEmplado, si no Retorna null
	 * @param DNI
	 * @return 
	 */
	public static Empleado buscarEmpleadoDni(String dni)
	{
		for(int indice=0; indice<listaEmpleado.size();indice++)
		{if(listaEmpleado.get(indice).getDni().equals(dni))
		  {
			return listaEmpleado.get(indice);
		  }
		}
		return null;
	}		
	
	/**
	 * Suma los salarios de la lista.
	 * @param lista
	 */
	public static double totalSalarios(List<Empleado> lista)
	{   long acumuladorSalario = 0; 
		for(int indice=0;indice < listaEmpleado.size() ; indice++ )
		{   
			 acumuladorSalario = (long) (acumuladorSalario + listaEmpleado.get(indice).getSalario());
		}
	    return acumuladorSalario;
	}
	
	
	/**
	 * Si encuentra un empleado mediante el dni lo elimina y lo agrega a la lista a retornar.
	 * @param indice
	 * @return
	 */
	public static List<Empleado> ultimoPunto(Empleado empleado, List<Empleado> listaEmpleado2)
	{
		listaEmpleado2.add(empleado);
		listaEmpleado.remove(empleado);
		return listaEmpleado2;
	}
	
	
}
