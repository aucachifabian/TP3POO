/**
 * 
 */
package ar.edu.fi.unju.model;

import java.time.LocalDate;
import java.util.Date;

import ar.edu.unju.fi.utilerias.Utileria;

/**
 * Clase que representa al objeto Empleado.
 * @author Fabian
 *
 */
public class Empleado {
	private static Integer nextId = 99;
	private int id;
	private int legajo; 
	private String dni;
	private String nombre;
	private Date fechaDeIngreso;
	private Float salario;
	private int Antiguedad;
	
	
	
	/**
	 * Constructor por defecto
	 */
	public Empleado() {
		// TODO Auto-generated constructor stub
	}


	/**
	 * constructor sobrecargado
	 * @param id
	 * @param legajo
	 * @param dni
	 * @param nombre
	 * @param fechaDeIngreso
	 * @param salario
	 * @param antiguedad
	 */
	public Empleado(int id, int legajo, String dni, String nombre, Date fechaDeIngreso, Float salario,
			int antiguedad) {
		this.id = id;
		this.legajo = legajo;
		this.dni = dni;
		this.nombre = nombre;
		this.fechaDeIngreso = fechaDeIngreso;
		this.salario = salario;
		Antiguedad = antiguedad;
	}
	
	/**
	 * constructor sobrecargado para el SERIAL ID
	 * @param legajo
	 * @param dni
	 * @param nombre
	 * @param fechaDeIngreso
	 * @param salario
	 * @param antiguedad
	 */
	public Empleado(int legajo, String dni, String nombre, Date fechaDeIngreso, Float salario,
			int antiguedad) {
		this.id = nextId;
		this.legajo = legajo;
		this.dni = dni;
		this.nombre = nombre;
		this.fechaDeIngreso = fechaDeIngreso;
		this.salario = salario;
		Antiguedad = antiguedad;
	}
	
	/* -------------------------METODOS ACCESORES------------------------------- */
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the legajo
	 */
	public int getLegajo() {
		return legajo;
	}
	/**
	 * @param legajo the legajo to set
	 */
	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}
	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}
	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the fechaDeIngreso
	 */
	public Date getFechaDeIngreso() {
		return fechaDeIngreso;
	}
	/**
	 * @param fechaDeIngreso the fechaDeIngreso to set
	 */
	public void setFechaDeIngreso(Date fechaDeIngreso) {
		this.fechaDeIngreso = fechaDeIngreso;
	}
	/**
	 * @return the salario
	 */
	public Float getSalario() {
		return salario;
	}
	/**
	 * @param salario the salario to set
	 */
	public void setSalario(Float salario) {
		this.salario = salario;
	}
	/**
	 * @return the antiguedad
	 */
	public int getAntiguedad() {
		return Antiguedad;
	}
	/**
	 * @param antiguedad the antiguedad to set
	 */
	public void setAntiguedad(int antiguedad) {
		Antiguedad = antiguedad;
	}

	/* ---------- METODO TOSTRING -------------- */
	/**
	 * metodo toString sobreescrito.
	 */
	@Override
	public String toString() {
		Utileria herramienta = new Utileria();
		return " Legajo=" + herramienta.formatearLegajo(legajo) + "- Dni=" + dni + "- Nombre=" + nombre + "- Fecha De Ingreso="
				+ herramienta.formatearFecha(fechaDeIngreso) + "- Salario=" + herramienta.formatearSalario(salario) + "- Antiguedad=" + Antiguedad;
	}
	
	
}
