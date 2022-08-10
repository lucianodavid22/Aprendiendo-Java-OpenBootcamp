public class Main {
    public static void main(String[] args) {

        // CONTROL CON IF

        int numeroIf = 0;

        if(numeroIf > 0){
            System.out.println("el numero es mayor a 0");
        }
        else if(numeroIf < 0){
            System.out.println("el numero es menor a 0");
        }else{
            System.out.println("el numero es 0");
        }

        // BUCLE WHILE

        int numeroWhile = 0;

        while(numeroWhile < 3){
            System.out.println("while " + numeroWhile);
            numeroWhile++;
        }

        // BUCLE DO WHILE

        do{
            System.out.println("do while " + numeroWhile);
        }while (numeroWhile < 3);

        // BUCLE FOR

        int numeroFor = 0;

        for(int i = 0; i <= 3; i++){
            System.out.println("For " + numeroFor);
            numeroFor++;
        }

        // SWITCH

        String estacion = "primavera";

        switch(estacion){
            case "verano":
                System.out.println("es verano");
                break;
            case "otoño":
                System.out.println("es otoño");
                break;
            case "invierno":
                System.out.println("es invierno");
                break;
            case "primavera":
                System.out.println("es primavera");
                break;
            default:
                System.out.println("no es una estacion");
        }
    }
}

