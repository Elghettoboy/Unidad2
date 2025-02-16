class Ejercicio4{
  public static void main(String[] args) {  //metodo principal
    for (int i = 1; i <= 10; i++) {  // hacemos la iteracion de empezando desde 1, hasta 10, en un incremento de 1 en 1
      int resultado = 7 * i; //declaramos una varible que se multiplique por 7, entonces cada vuelta el valor 'i', aumenta en +1
      System.out.println("7 x " + i + " = " + resultado); //entonces cuando se imprime, imprime el valor de 'i' mas el resultado
    }
  }
}
