public class Exercise{
  public static void main(String args[]) {
    // Primer Ejercicio -- condicional if
    int numeroIf = 0; 
    if (numeroIf == 0){
    System.out.println("Es cero");
    }else if(numeroIf > 0){
    System.out.println("Es positivo");
    }else {
    System.out.println("Es negativo");
    }

    // Segundo ejercicio -- bucle while
    int numeroWhile = 0;
    while(numeroWhile < 3){
      numeroWhile++;
      System.out.println("Ejecucion bucle While");
    }

    // Tercer ejercicio -- bucle Do while
    int numeroDoWhile = 0;
    do {
      numeroDoWhile++;
      System.out.println("Ejecucion bucle Do While");
    }while(numeroDoWhile < 1);

    // Cuarto ejercicio -- bucle For
    
    for(int numeroFor = 0; numeroFor<= 3; numeroFor++){
      System.out.println("Ejecucion bucle For");
    }

    // Quinto ejercicio -- switch
    String estacion = "Primavera";
    switch(estacion){
      case "Invierno":
        System.out.println("La estacion es invierno");
        break;
      case "Primavera":
        System.out.println("La estacion es primavera");
        break;
      case "Verano":
        System.out.println("La estacion es verano");
        break;
      case "Otoño":
        System.out.println("La estacion es otoño");
        break;
      default:
        System.out.println("Error: El valor no es una estacion");
    }


  }
  
}