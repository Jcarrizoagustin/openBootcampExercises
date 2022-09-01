package EjerciciosTema8;

public class Principal {
  public static void main(String args[]){


    Persona persona = new Persona(18, "Agustin", "857459651");
    System.out.println(persona.getNombre());
    System.out.println(persona.getEdad());
    System.out.println(persona.getNumeroTelefono());

    persona.setNombre("Juan");
    persona.setEdad(25);
    persona.setTelefono("38348097852");

    System.out.println(persona.getNombre());
    System.out.println(persona.getEdad());
    System.out.println(persona.getNumeroTelefono());
    
  }
}
