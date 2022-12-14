package practicaDeJava.practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Main {
    public static String reverse(String texto) {
        String invertida = "";

        for(int i = texto.length(); 0 < i; i--){
            invertida += texto.charAt(i - 1);
        }

        return invertida;
    }

    public static void main(String[] args) {
        System.out.println(reverse("hola mundo"));

        // Array unidimensional
        int numeros[] = {1, 4, 7, 10, 22};
        System.out.print("Array unidimensional: ");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println(" ");

        // Array Bidimensional
        int arrayBidimensional[][] = {
                { 1,2,3,4,5,6,7 },
                { 8,9,10,11,12,13,14 }
        };
        System.out.println("Array bidimensional");
        for (int i = 0; i < arrayBidimensional.length; i ++){
            for(int j = 0; j < arrayBidimensional[i].length; j++){
                System.out.println("fila " + i + ", columna " + j + ": " + arrayBidimensional[i][j]);
            }
        }

        // Vector
        Vector<String> nombres = new Vector<>();
        nombres.add("Luciano");
        nombres.add("David");
        nombres.add("David");
        nombres.add("Rodrigo");
        nombres.add("Joel");
        System.out.println("vector con 5 elementos: " + nombres);
        nombres.remove(1);
        nombres.remove(1);
        System.out.println("vector con 3 elementos: " + nombres);

        // ==> DESVENTAJA DE USAR VECTORES <==
        // Los vectores por debajo son arrays,
        // al agregar elementos y superar la capacidad por defecto del vector,
        // por detras del lenguaje, se crea un nuevo array en el cual se agrega mas capacidad
        // y ademas se copian todos los elementos que habia en el anterior vector a este nuevo array
        // lo que produce un gran consumo de memoria.

        System.out.println("DESVENTAJA DE USAR VECTORES: Los vectores por debajo son arrays,\n" +
                "   al agregar elementos y superar la capacidad por defecto del vector,\n" +
                "   por detras del lenguaje, se crea un nuevo array en el cual se agrega mas capacidad\n" +
                "   y ademas se copian todos los elementos que habia en el anterior vector a este nuevo array\n" +
                "   lo que produce un gran consumo de memoria.");

        ArrayList<String> apellidos = new ArrayList<>();
        apellidos.add("Dorregaray");
        apellidos.add("Juncos");
        apellidos.add("Cooper");
        apellidos.add("Garcia");
        for (int i = 0; i < apellidos.size(); i++){
            System.out.println("ArrayList posicion " + i + ": " + apellidos.get(i));
        }

        LinkedList<String> apellidosEnLinked = new LinkedList<>(apellidos);
        for (int i = 0; i < apellidosEnLinked.size(); i++){
            System.out.println("LinkedList posicion " + i + ": " + apellidosEnLinked.get(i));
        }

        System.out.println("Bucle for en version corta || for each");
        for (String apellido : apellidosEnLinked) {
            System.out.print(apellido + " ");
        }

        ArrayList<Integer> numbers = new ArrayList<>();

        for(int k = 0; k <= 10; k++) {
            if( k == 0 ) continue;

            numbers.add(k);

            if( k == 10){
                System.out.println("ArrayList con 10 numeros: " + numbers);

                for (int l = 0; l <= numeros.length; l++){
                    if(numbers.get(l) % 2 == 0){
                        numbers.remove(l);
                    }
                }

                System.out.println("ArrayList sin numeros pares: " + numbers);
            }
        }

        try{
            dividePorCero(22, 0);
        }
        catch(ArithmeticException e){
            System.out.println("Mensaje de exception: " + e.getMessage());
        }
        finally{
            System.out.println("Demo de codigo");
        }
    }

    public static int dividePorCero(int a, int b) throws ArithmeticException {
        int resultado = 0;
        try{
            return a / b;
        }
        catch(ArithmeticException e){
            throw new ArithmeticException("Esto no puede hacerse");
        }
    }
}

//Utilizando InputStream y PrintStream, crea una funci??n que reciba dos par??metros: "fileIn" y "fileOut". La tarea de la funci??n ser?? realizar la copia del fichero dado en el par??metro "fileIn" al fichero dado en "fileOut".
//Sorpr??ndenos creando un programa de tu elecci??n que utilice InputStream, PrintStream, excepciones, un HashMap y un ArrayList, LinkedList o array.
