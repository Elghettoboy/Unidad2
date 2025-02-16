class Ejercicio3{
  public static void main(String[] args) { // Método principal
      for (int i = 1; i <= 20; i++) { // Itera del 1 al 20
          if (i % 3 == 0 && i % 5 == 0) { //Comprueba si es divisible por 3 y 5, y se usala condicion AND para tomar en cuenta las dos condiciones.
              System.out.println("FizzBuzz"); //Imprime FizzBuzz si se puede dividir entre 3 y 5.
          } else if (i % 3 == 0) { // Se usa elif para hacer otra comparacion si es divisible solo por 3
              System.out.println("Fizz");// imprime Fizz al solo ser divisible entre 3
          } else if (i % 5 == 0) { // Se usa elif para hacer otra comparacion si es divisible solo por 5
              System.out.println("Buzz"); //imprime Buzz si solo es divisble entre 5
          } else { // en caso de no cumple nunguna condicion solo imprime el numero
              System.out.println(i);
          }
      }
  }
}
