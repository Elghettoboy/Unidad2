class Ejercicio5{
  public static void main(String[] args) { //metodo principal
    for(int i=1; i<=10; i++){ //primer bucle for para el multiplicando
      for(int j=1; j<=10; j++){ // el segundo for para el multiplicador 
        System.out.println(i + "x" + j + "=" + (i*j)); //imprimimos el producto, usando las variables 'i' y 'j' y en la misma linea hacemos el prodcuto
      }
      System.out.println("----------"); //Para separar entre tablas
    }
    System.out.println();// para un salto de linea
  }
}




  
