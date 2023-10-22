package Trabajo;

import java.util.List;
import java.util.ArrayList;

public class Curso 
{
	private String bloque;
	private String formatoDictado;
	private List<Persona> personas = new ArrayList<Persona>();
	private String aula;
	private Horario horario = new Horario();
	private Carrera carrera = new Carrera();
	
	public Curso(String bloque, String formatoDictado, List<Persona> personas, String aula, Horario horario) 
	{
		this.bloque = bloque;
		this.formatoDictado = formatoDictado;
		this.personas = personas;
		this.aula = aula;
		this.horario = horario;
	}

	public String getBloque() 
	{
		return bloque;
	}

	public void setBloque(String bloque) 
	{
		this.bloque = bloque;
	}

	public String getFormatoDictado() 
	{
		return formatoDictado;
	}

	public void setFormatoDictado(String formatoDictado) 
	{
		this.formatoDictado = formatoDictado;
	}

	public List<Persona> getPersonas() 
	{
		return personas;
	}

	public void setPersonas(List<Persona> personas) 
	{
		this.personas = personas;
	}

	public String getAula() 
	{
		return aula;
	}

	public void setAula(String aula) 
	{
		this.aula = aula;
	}

	public Horario getHorario() 
	{
		return horario;
	}

	public void setHorario(Horario horario) 
	{
		this.horario = horario;
	}

	@Override
	public String toString() 
	{
		return "Curso [bloque=" + bloque + ", formatoDictado=" + formatoDictado + ", aula=" + aula + "]";
	}
}
