package Trabajo;

import java.util.Arrays;

public class Profesor {
	private int numHoras;
    private int aniosExperiencia;
    private Curso[] cursos;

    public Profesor() {
        cursos = new Curso[0];
    }

    public Profesor(int numHoras, int aniosExperiencia) {
        this();
        this.numHoras = numHoras;
        this.aniosExperiencia = aniosExperiencia;
    }

    public int getNumHoras() {
        return numHoras;
    }

    public void setNumHoras(int numHoras) {
        this.numHoras = numHoras;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public Curso[] getCursos() {
        return cursos;
    }

    public void setCursos(Curso[] cursos) {
        this.cursos = cursos;
    }

    // Método para calcular el salario diario del profesor
    public double calcSalarioDiario(double numHoras) {
        // Implementa la lógica para calcular el salario diario del profesor
        // usando el número de horas trabajadas y cualquier otra consideración
        // necesaria en tu aplicación.
        return numHoras * salarioPorHora; // Debes definir la variable salarioPorHora
    }

    // Método para asignar un curso al profesor
    public void asignarCurso(Curso curso) {
        // Implementa la lógica para asignar un curso al profesor
        // Puedes necesitar modificar la estructura de datos para almacenar los cursos asignados
        // Por ejemplo, podrías usar una lista en lugar de un arreglo.
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "numHoras=" + numHoras +
                ", aniosExperiencia=" + aniosExperiencia +
                ", cursos=" + Arrays.toString(cursos) +
                '}';
    }
}


