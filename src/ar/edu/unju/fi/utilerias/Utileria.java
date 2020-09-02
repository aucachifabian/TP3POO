/**
 * 
 */
package ar.edu.unju.fi.utilerias;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Class Utileria que permite usar herramientas de formato, numero anonimo, nombre anonimo y calculo antiguedad.
 * @author Fabian
 */
public class Utileria {
    
	
	/**
	 * Constructor por defecto
	 */
	public Utileria() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Metodo que formatea un Date de forma "dd/MM/yyyy"
	 * @param fecha(Date)
	 * @return string "dd/MM/yyyy"
	 */
	public static String formatearFecha(Date fecha)
	{   SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		return formatter.format(fecha);
	}
	
	/**
	 * Metodo que da formato a un numero para que se muestre en formato de 11 digitos 
	 * @param numeroLegajo
	 * @return 142 convert to 00000000142
	 */
	public static String formatearLegajo(int numeroLegajo)
	{
		if(numeroLegajo<10)
			return "0000000000" + numeroLegajo;
		else
		{	if(numeroLegajo<100)
				return "000000000" + numeroLegajo;
			else
			{	if(numeroLegajo<1000)
				   return "00000000" + numeroLegajo;
			    else
			    	return "0000000" + numeroLegajo;
		}}
	}
	
	/**
	 * metodo que saca un random entre dos numeros
	 * @param desde
	 * @param hasta
	 * @return numero aleatorio entre los dos numeros pasados por parametros
	 */
	public static int randomEntre(long desde, long hasta)
	{
		return (int) (Math.random()*(hasta-desde+1) + desde); 
	}
	
	/**
	 * Metodo que calcula años transcurridos desde una fecha hasta el dia de hoy.
	 * @param fecha
	 * @return años transcurridos desde la fecha
	 */
	public static int calcularAntiguedad(Date fecha)
	{   Date fecha2 = new Date();
	    if(fecha2.getMonth() < fecha.getMonth())
	         return fecha2.getYear()-fecha.getYear()-1;
	    else	 
	         return fecha2.getYear()-fecha.getYear();
	}
	
	/**
	 * Metodo que saca un random multiplo de 5000 y se encuentra en el rango 30000 hasta 55000
	 * @return [30000, 55000]
	 */
	public static Float randomSueldo()
	{
		int numero = (int) (Math.random()*(11-6+1) + 6);
		return (float)numero*5000;
	}
	
	/**
	 * metodo obtiene aleatorio entre el 1 y un numero pasado por parametro
	 * @param hasta
	 * @return [1,hasta]
	 */
	public static int randomHasta(int hasta)
	{
		return (int) (Math.random()*hasta + 1);
	}
	
	/**
	 * metodo que obtiene un nombre mediante un numero pasado como parametro
	 * @param numero
	 * @return nombre
	 */
	public static String obtenerNombre(int numero)
	{   switch(numero) {
		case 1:	return "Ignacio ";  
		case 2: return "Pablo ";       
		case 3: return "Juan "; 
		case 4: return "Orlando ";
		case 5: return "Federico ";
		case 6: return "Jose ";
		case 7: return "Francisco ";
		default:return "Rodrigo ";
	}}
	
	/**
	 * Metodo que obtiene un apellido dependiendo un numero pasado por parametro
	 * @param numero
	 * @return apellido
	 */
	public static String obtenerApellido(int numero)
	{   switch(numero) {
		case 1:	return "Tolaba";  
		case 2: return "Farfan";       
		case 3: return "Ortega"; 
		case 4: return "Gallardo";
		case 5: return "Espinosa";
		case 6: return "Mamani";
		case 7: return "Lopez";
		default:return "Gaspar";
	}}
	
	/**
	 * Metodo que formatea un float en #.##
	 * @param salario
	 * @return string ("#.##");
	 */
    public static String formatearSalario(Float salario)
    {
	float valor = salario;
    DecimalFormat df = new DecimalFormat("#.##");
    return df.format(valor);
    }
    
    public static void menu()
    {
    	System.out.println("1: Generar lista con N empleados (PUNTO 1)");
    	System.out.println("2: Buscar por patron en NOMBRE   (PUNTO 3) ");
    	System.out.println("3: Mostrar Empleados por Antiguedad (PUNTO4)");
    	System.out.println("4: Generar segunda Lista y eliminar primera Lista (PUNTO 5)");
    	System.out.println("5: Mostrar Lista");
    	System.out.println("6: Mostrar segunda Lista");
    	System.out.println("7: SALIDA");
    }
}
