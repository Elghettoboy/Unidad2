class TablasM {
    public static void main(String[] args) { // metodo principal
        for (int i = 1; i <= 9; i++) { // ciclo for que sirve para el conteo de tablas
            for (int j = 1; j <= 10; j++) { // ciclo que sirve para el conteo de numeros multiplicados
                // impresion de los numeros multiplicados
                System.out.println(+i + " * " + j + " = " + (i * j));
            }
            // impresion para separar las tablas
            System.out.println("-------");
        }
        // sout vacio para acomodar la estructura de nuestros resultados
        System.out.println();
    }
}
