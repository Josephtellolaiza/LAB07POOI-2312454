package Trabajo;

import java.util.List;
import java.util.ArrayList;

public class Profesor extends Persona
{
	private int numHoras;
    private int aniosExperiencia;
    private List<Curso> cursos = new ArrayList<Curso>();
    private List<RegistroNota> registros = new ArrayList<RegistroNota>();
    
    public Profesor()
    {}
    
    public Profesor(int dni, String nombre, String apellido, int edad, String correo, int telefono, int numHoras,
			int aniosExperiencia)
    {
		super(dni, nombre, apellido, edad, correo, telefono);
		this.numHoras = numHoras;
		this.aniosExperiencia = aniosExperiencia;
	}

	public int getNumHoras() 
	{
        return numHoras;
    }

    public void setNumHoras(int numHoras) 
    {
        this.numHoras = numHoras;
    }

    public int getAniosExperiencia() 
    {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) 
    {
        this.aniosExperiencia = aniosExperiencia;
    }

    public List<Curso> getCursos() 
    {
		return cursos;
	}

	public void setCursos(List<Curso> cursos) 
	{
		this.cursos = cursos;
	}

    public List<RegistroNota> getRegistros() 
    {
		return registros;
	}

	public void setRegistros(List<RegistroNota> registros) 
	{
		this.registros = registros;
	}

	public double calcSalarioDiario(double salarioHora) 
    {
        double numHoras = getNumHoras();
        double salarioDiario;
    	salarioDiario = numHoras * salarioHora;
    	
    	return salarioDiario;
    }

    public void asignarCurso(Curso curso) 
    {
    	cursos.add(curso);
    }

    public void agregarRegistro(RegistroNota registro)
    {
    	registros.add(registro);
    }
    
	@Override
	public String toString() 
	{
		return "Profesor [numHoras=" + numHoras + ", aniosExperiencia=" + aniosExperiencia + ", cursos=" + cursos + "]";
	}
}


