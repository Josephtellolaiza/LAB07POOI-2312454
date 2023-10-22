package Trabajo;

public class Persona {
    protected int ID;
    protected int dni;
    protected String nombre;
    protected String apellido;
    protected int edad;
    protected String correo;
    protected int telefono;
    protected int codigo;

    public Persona()
    {}
    
    public Persona(int dni, String nombre, String apellido, int edad, String correo, int telefono) 
    {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.correo = correo;
        this.telefono = telefono;
    }

    public int getDni() 
    {
        return dni;
    }

    public void setDni(int dni) 
    {
        this.dni = dni;
    }

    public String getNombre() 
    {
        return nombre;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    public String getApellido() 
    {
        return apellido;
    }

    public void setApellido(String apellido) 
    {
        this.apellido = apellido;
    }

    public int getEdad() 
    {
        return edad;
    }

    public void setEdad(int edad) 
    {
        this.edad = edad;
    }

    public String getCorreo() 
    {
        return correo;
    }

    public void setCorreo(String correo) 
    {
        this.correo = correo;
    }

    public int getTelefono() 
    {
        return telefono;
    }

    public void setTelefono(int telefono) 
    {
        this.telefono = telefono;
    }

    public void mandarCorreos(String correo, String mensaje) 
    {
        System.out.println("Enviando correo a " + correo + ": " + mensaje);
    }

	@Override
	public String toString() 
	{
		return "Persona [ID=" + ID + ", dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad
				+ ", correo=" + correo + ", telefono=" + telefono + ", codigo=" + codigo + "]";
	}
}

