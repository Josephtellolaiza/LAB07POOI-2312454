package Trabajo;

import java.util.ArrayList;
import java.util.List;

public class Estudiante {
	
	private int codigo;
    private List<Nota> notas;
    private List<Curso> cursos;
    
    public Estudiante() {
        notas = new ArrayList<>();
        cursos = new ArrayList<>();
    }

    public Estudiante(int codigo) {
        this();
        this.codigo = codigo;
    }

    public int getCarnet() {
        return codigo;
    }

    public void setCarnet(int codigo) {
        this.codigo = codigo;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    public void agregarCurso(Curso curso) {
        cursos.add(curso);
    }

    public void asistencia(String asistencia) {
        System.out.println("Asistencia registrada: " + asistencia);
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "codigo=" + codigo +
                ", cursos=" + cursos +
                '}';
    }
}

