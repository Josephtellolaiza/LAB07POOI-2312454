package Trabajo;

import java.util.List;
import java.util.ArrayList;

public class Universidad 
{
	private String nombre;
	List<Sede> sedes = new ArrayList<Sede>();
	List<Facultad> facultades = new ArrayList<Facultad>();
	private String rector;
	
	public Universidad()
	{}
	
	public Universidad(String nombre, List<Sede> sedes, List<Facultad> facultades, String rector) 
	{
		this.nombre = nombre;
		this.sedes = sedes;
		this.facultades = facultades;
		this.rector = rector;
	}

	public String getNombre() 
	{
		return nombre;
	}

	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}

	public List<Sede> getSedes() 
	{
		return sedes;
	}

	public void setSedes(List<Sede> sedes) 
	{
		this.sedes = sedes;
	}

	public List<Facultad> getFacultades() 
	{
		return facultades;
	}

	public void setFacultades(List<Facultad> facultades) 
	{
		this.facultades = facultades;
	}

	public String getRector() 
	{
		return rector;
	}

	public void setRector(String rector) 
	{
		this.rector = rector;
	}

	@Override
	public String toString() 
	{
		return "Universidad [nombre=" + nombre + ", sedes=" + sedes + ", facultades=" + facultades + ", rector="
				+ rector + "]";
	}
}
