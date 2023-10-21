package Trabajo;

import java.util.List;
import java.util.ArrayList;

public class Facultad 
{
	private String id;
	private String nombreFacultad;
	private char pabellon;
	private List<Carrera> carreras = new ArrayList<Carrera>();
	private String decana;
	
	public Facultad()
	{}
	
	public Facultad(String id, String nombreFacultad, char pabellon, List<Carrera> carreras, String decana) 
	{
		this.id = id;
		this.nombreFacultad = nombreFacultad;
		this.pabellon = pabellon;
		this.carreras = carreras;
		this.decana = decana;
	}

	public String getId() 
	{
		return id;
	}

	public void setId(String id) 
	{
		this.id = id;
	}

	public String getNombreFacultad() 
	{
		return nombreFacultad;
	}

	public void setNombreFacultad(String nombreFacultad) 
	{
		this.nombreFacultad = nombreFacultad;
	}

	public char getPabellon() 
	{
		return pabellon;
	}

	public void setPabellon(char pabellon) 
	{
		this.pabellon = pabellon;
	}

	public List<Carrera> getCarreras() 
	{
		return carreras;
	}

	public void setCarreras(List<Carrera> carreras) 
	{
		this.carreras = carreras;
	}

	public String getDecana() 
	{
		return decana;
	}

	public void setDecana(String decana) 
	{
		this.decana = decana;
	}

	@Override
	public String toString() 
	{
		return "Facultad [id=" + id + ", nombreFacultad=" + nombreFacultad + ", pabellon=" + pabellon + ", carreras="
				+ carreras + ", decana=" + decana + "]";
	}
}