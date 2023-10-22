package Trabajo;

import java.util.ArrayList;
import java.util.List;

public class Estudiante extends Persona
{
	private int codigo;
    private List<Nota> notas = new ArrayList<Nota>();
    private List<Curso> cursos = new ArrayList<Curso>();
    
    public Estudiante()
    {}
    
    public Estudiante(int dni, String nombre, String apellido, int edad, String correo, int telefono, int codigo) 
    {
		super(dni, nombre, apellido, edad, correo, telefono);
		this.codigo = codigo;
	}

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    
    public List<Nota> getNotas() 
    {
		return notas;
	}

	public void setNotas(List<Nota> notas) 
	{
		this.notas = notas;
	}

	public List<Curso> getCursos() 
	{
		return cursos;
	}

	public void setCursos(List<Curso> cursos) 
	{
		this.cursos = cursos;
	}

	public void agregarCurso(Curso curso) 
	{
        cursos.add(curso);
    }

    public void asistencia(String asistencia) {
        System.out.println("Asistencia registrada: " + asistencia);
    }

	@Override
	public String toString() 
	{
		return "Estudiante [codigo=" + codigo + ", notas=" + notas + ", cursos=" + cursos + "]";
	}
}

