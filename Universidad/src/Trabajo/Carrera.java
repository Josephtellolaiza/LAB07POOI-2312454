package Trabajo;

import java.util.List;
import java.util.ArrayList;

public class Carrera 
{
	private String id;
	private String nombreCarrera;
	private List<Curso> Cursos = new ArrayList<Curso>();
	private int ciclos;
	private String modalidad;
	
	public Carrera()
	{}
	
	public Carrera(String id, String nombre, List<Curso> cursos, int ciclos, String modalidad)
	{
		this.id = id;
		this.nombreCarrera = nombre;
		Cursos = cursos;
		this.ciclos = ciclos;
		this.modalidad = modalidad;
	}

	public String getId() 
	{
		return id;
	}

	public void setId(String id) 
	{
		this.id = id;
	}

	public String getNombreCarrera() 
	{
		return nombreCarrera;
	}

	public void setNombreCarrera(String nombreCarrera) 
	{
		this.nombreCarrera = nombreCarrera;
	}

	public List<Curso> getCursos() 
	{
		return Cursos;
	}

	public void setCursos(List<Curso> cursos) 
	{
		Cursos = cursos;
	}

	public int getCiclos() 
	{
		return ciclos;
	}

	public void setCiclos(int ciclos) 
	{
		this.ciclos = ciclos;
	}

	public String getModalidad() 
	{
		return modalidad;
	}

	public void setModalidad(String modalidad) 
	{
		this.modalidad = modalidad;
	}

	@Override
	public String toString() 
	{
		return "Carrera [id=" + id + ", nombreCarrera=" + nombreCarrera + ", Cursos=" + Cursos + ", ciclos=" + ciclos
				+ ", modalidad=" + modalidad + "]";
	}
}
