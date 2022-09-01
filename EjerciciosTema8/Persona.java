package EjerciciosTema8;

public class Persona{
  
  private int edad;
  private String nombre;
  private String nroTelefono;

  public Persona(int edad, String nombre, String telefono){
    this.edad = edad;
    this.nombre = nombre;
    this.nroTelefono = telefono;
  }

  public void setEdad(int edad){
    this.edad = edad;
  }

  public int getEdad(){
    return this.edad;
  }

  public void setNombre(String nombre){
    this.nombre = nombre;
  }

  public String getNombre(){
    return this.nombre;
  }

  public void setTelefono(String telefono){
    this.nroTelefono = telefono;
  }

  public String getNumeroTelefono(){
    return this.nroTelefono;
  }
}