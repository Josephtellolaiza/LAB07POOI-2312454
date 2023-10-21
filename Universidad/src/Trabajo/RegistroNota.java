package Trabajo;

public class RegistroNota {
	private int id;
    private Profesor profesor;
    private Alumno[] alumnos;
    private double NOTA_MIN = 0;
    private double NOTA_MAX = 20;
    private double NOTA_MIN_APROB = 10.5;

    public RegistroNota(int id, Profesor profesor, Alumno[] alumnos) {
        this.id = id;
        this.profesor = profesor;
        this.alumnos = alumnos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public Alumno[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(Alumno[] alumnos) {
        this.alumnos = alumnos;
    }

    public void mandarCorreos(String mensaje) {
        // Implementa la lógica para enviar correos electrónicos a los alumnos
        // usando el mensaje proporcionado como parámetro
    }

    @Override
    public String toString() {
        return "RegistroNota{" +
                "id=" + id +
                ", profesor=" + profesor +
                ", alumnos=" + Arrays.toString(alumnos) +
                ", NOTA_MIN=" + NOTA_MIN +
                ", NOTA_MAX=" + NOTA_MAX +
                ", NOTA_MIN_APROB=" + NOTA_MIN_APROB +
                '}';
    }
}

