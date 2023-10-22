package Trabajo;

import java.util.List;
import java.util.ArrayList;

public class RegistroNota 
{
	private int id;
    private Profesor profesor;
    private List<Estudiante> estudiantesRegistrados = new ArrayList<Estudiante>();
    private final static double NOTA_MIN = 0;
    private final static double NOTA_MAX = 20;
    private final static double NOTA_MIN_APROB = 10.5;

    public RegistroNota(int id, Profesor profesor, List<Estudiante> estudiantesRegistrados)
    {
		this.id = id;
		this.profesor = profesor;
		this.estudiantesRegistrados = estudiantesRegistrados;
	}

	public int getId() 
	{
        return id;
    }

    public void setId(int id) 
    {
        this.id = id;
    }

    public Profesor getProfesor() 
    {
        return profesor;
    }

    public void setProfesor(Profesor profesor) 
    {
        this.profesor = profesor;
    }

	public List<Estudiante> getEstudiantesRegistrados() 
	{
		return estudiantesRegistrados;
	}

	public void setEstudiantesRegistrados(List<Estudiante> estudiantesRegistrados) 
	{
		this.estudiantesRegistrados = estudiantesRegistrados;
	}
	
	public void agregarEStudiante (Estudiante estudiante)
	{
		estudiantesRegistrados.add(estudiante);
	}

	@Override
	public String toString() 
	{
		return "RegistroNota [id=" + id + ", profesor=" + profesor + ", estudiantesRegistrados="
				+ estudiantesRegistrados + "]";
	}
}

