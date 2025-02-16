// Nombre de la clase
class FizzBuzz {
    public static void main(String[] args) { // metodo principal
        // ciclo for, que itera numeros de 1 en 1
        for (int i = 1; i <= 20; i ++) {
            // condicion para los multiplos de 3
            if (i %3 == 0) {
                // texto que se imprime para los multiplos de 3
                System.out.println("Fizz");
                // condicon para los multiplos de 5
            }else if(i%5==0) {
                // texto que se imprime para los multiplos de 5
                System.out.println("Buzz");
                // condicon para multiplos de 3 y de 5 
            }else if(i%3==0 && i%5==0){
                // texto que se imprime si se cumplen ambas condicones
                System.out.println("FizzBuzz");
            }else{
                // impresion de los numeros restantes
                System.out.println(i);
            }
            }
        }
    }