public class Principal {
  public static void main(String args[]){

    
    Cliente cliente = new Cliente(25, "Agustin", "3895741526", 7500.00f);
    System.out.println(cliente.getNombre());
    System.out.println(cliente.getEdad());
    System.out.println(cliente.getTelefono());
    System.out.println(cliente.getCredito());


    Trabajador trabajador = new Trabajador(35, "Emanuel", "897412536", 99800.99f);
    System.out.println(trabajador.getNombre());
    System.out.println(trabajador.getEdad());
    System.out.println(trabajador.getTelefono());
    System.out.println(trabajador.getSalario());
  }
}
