package practicaDeJava.practice;

public class BitCounting {
    public static void main(String[] args) {
        System.out.println("La cantidad de 1 en el binario es de: " + contadorDeUnos(22));
    }

    // La función "contadorDeUnos" llama a la función conversionBinario, la cual se encarga de convertir
    // el numero que se le pasa por argumento a numero binario, lo devuelve como un string
    // luego con un bucle for se recorre el string del numero binario y en un contador se va
    // contando la cantidad de numeros 1 que hay que en el numero binario.

    public static int contadorDeUnos (int n){
        String numeroBinario = conversionBinario(n);

        System.out.println("El numero ingresado convertido a binario es: " + numeroBinario);

        int contadorDe1 = 0;

        for (int i = 0; i < numeroBinario.length(); i++){
            if(String.valueOf(numeroBinario.charAt(i)).equals("1")){
                contadorDe1++;
            }
        }

        binario = "";
        seRepiteEl1 = false;

        return contadorDe1;
    }

    // En la variable de tipo String binario se va guardando la conversion del numero
    private static String binario = "";
    // la varibale seRepiteEl1 ayuda en el caso de corte de ejecución de la funcion recursiva "conversionBinario"
    private static boolean seRepiteEl1 = false;

    // La funcion recursiva "conversionBinario", convierte el numero que se le pasa como argumento a binario
    // para esto se va dividiendo el numero en 2, si el resto es par se le suma un 0 a la String del binario
    // si el resto es impar se le suma un 1 a la String del binario
    // Esta division se produce hasta llegar a 1, cuando se llega a este numero, se le asigna el valor True
    // a la variable booleana
    // El caso de corte de ejecucion es que se repita el 1 o que numero sea igual a 0
    // lo que produce que se invierta el string binario, ya que se necesita invertir
    // y se guarde en una nueva variable la cual contiene el resultado final a retornar de pasar un numero decimal a numero binario

    private static String conversionBinario(int numero){
        if(seRepiteEl1 || numero == 0){
            String ordenamientoDeBinario = "";
            StringBuilder strb = new StringBuilder(binario);
            ordenamientoDeBinario = strb.reverse().toString();

            return ordenamientoDeBinario;
        }

        if(numero == 1){
            seRepiteEl1 = true;
        }

        if(numero % 2 == 0){
            binario += "0";
            int nuevoNumero = (int) numero / 2;

            return conversionBinario(nuevoNumero);
        }
        else{
            binario += "1";
            int nuevoNumero = (int) numero / 2;

            return conversionBinario(nuevoNumero);
        }
    }
}
