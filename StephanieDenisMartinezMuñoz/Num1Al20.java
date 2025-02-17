class Num1Al20 { //FizzBuzz
    public static void main(String[] args) { //metodo principal
        int a = 20; //numero de iteraciones
        for (int i = 0; i <= a; i++){   //bucle for
            if (i % 3 == 0 && i % 5 == 0){ //condicion
                System.out.println(i + "FizzBuzz"); //impresion
            } else if (i % 5 == 0){     //condicion
                System.out.println(i + "Buzz");     //impresion
            } else if (i % 3 == 0){     //condicion
                System.out.println(i + "Fizz");     //impresion
            } else {                     //condicion
                System.out.println(i);     //impresion
            }                            //fin condicion
        }                                //fin bucle for
    }                                    //fin metodo principal
}                                        //fin clase    
