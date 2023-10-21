package Trabajo;

public class Administrador {
	private String rango;
    private int oficina;
    private int adminID;
    
    public Administrador() {
    }

    public Administrador(String rango, int oficina) {
        this.rango = rango;
        this.oficina = oficina;
        this.adminID = generarIDUnico();
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    // Métodos getter y setter para oficina
    public int getOficina() {
        return oficina;
    }

    public void setOficina(int oficina) {
        this.oficina = oficina;
    }
    public void programarReunion(String decision) {
        // Implementa la lógica para programar una reunión con la decisión dada
        System.out.println("Reunión programada con decisión: " + decision);
    }

    // Método toString para representar el objeto como una cadena
    @Override
    public String toString() {
        return "Administrador{" +
                "rango='" + rango + '\'' +
                ", oficina=" + oficina +
                ", adminID=" + adminID +
                '}';
    }

    // Método para generar un ID único para el administrador (solo como ejemplo, implementa tu lógica según tus necesidades)
    private int generarIDUnico() {
        // Implementa la lógica para generar un ID único
        // Puedes usar UUID u otro método para generar IDs únicos
        // Este es solo un ejemplo y no es seguro para aplicaciones reales.
        return (int) (Math.random() * 1000);
    }
}

