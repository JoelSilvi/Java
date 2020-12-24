import java.util.Scanner;

public class cicloWhile {

    public static void main(String[] args) {
        int opcion = 0;
        int numUno = 0;
        int numDos = 0;
        int resultado = 0;
        Scanner entradaScanner = new Scanner(System.in);

        System.out.println("Operaciones Matemáticas");
        System.out.println("1 - Suma");
        System.out.println("2 - Resta");
        System.out.println("3 - Multiplicación");
        System.out.println("4 - División");
        System.out.println("5 - Resto");
        System.out.println("Elige tú opción");

        opcion = entradaScanner.nextInt();

        while(opcion!=1 && opcion!=2 && opcion!=3 && opcion!=4 && opcion!=5){
            System.out.println("");
            System.out.println("Opción inválida, vuelve a intentarlo");
            System.out.println("Operaciones Matemáticas");
            System.out.println("1 - Suma");
            System.out.println("2 - Resta");
            System.out.println("3 - Multiplicación");
            System.out.println("4 - División");
            System.out.println("5 - Resto");
            System.out.println("Elige tú opción");

            opcion = entradaScanner.nextInt();
            System.out.println("");
        }
        
        if (opcion==1) {
            System.out.println("Ingrese el primer valor para la suma:");
            numUno = entradaScanner.nextInt();
            System.out.println("Ingrese el segundo valor para la suma:");
            numDos = entradaScanner.nextInt();
            resultado = numUno + numDos;
            System.out.println("El resultado de la suma es: " + resultado);

        }else if (opcion == 2){
            System.out.println("Ingrese el primer valor para la resta:");
            numUno = entradaScanner.nextInt();
            System.out.println("Ingrese el segundo valor para la resta:");
            numDos = entradaScanner.nextInt();
            resultado = numUno - numDos;
            System.out.println("El resultado de la resta es: " + resultado);

        }else if (opcion == 3){
            System.out.println("Ingrese el primer valor para multiplicar:");
            numUno = entradaScanner.nextInt();
            System.out.println("Ingrese el segundo valor para multiplicar:");
            numDos = entradaScanner.nextInt();
            resultado = numUno * numDos;
            System.out.println("El resultado de la multiplicación es: " + resultado);

        }else if (opcion == 4) {
            System.out.println("Ingrese el primer valor para la división:");
            numUno = entradaScanner.nextInt();
            System.out.println("Ingrese el segundo valor para la división:");
            numDos = entradaScanner.nextInt();
            resultado = (numUno + numDos) / 2;
            System.out.println("El resultado de la división es: " + resultado);

        }else{
            System.out.println("Ingrese el primer valor para la operación resto:");
            numUno = entradaScanner.nextInt();
            System.out.println("Ingrese el segundo valor para la operación resto:");
            numDos = entradaScanner.nextInt();
            resultado = numUno % numDos;
            System.out.println("El resto de la operación es: " + resultado);
        }
    }
}