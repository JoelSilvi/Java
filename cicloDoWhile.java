import java.util.Scanner;

public class cicloDoWhile {

    public static void main(String[] args) {
        int numUno = 0;
        int numDos = 0;
        int resultado = 0;
        int opcion = 0;

        Scanner entradaScanner = new Scanner(System.in);

        System.out.println("Operaciones matemáticas");
        System.out.println("1.-Suma");
        System.out.println("2.-Resta");
        System.out.println("3.-Multiplicación");
        System.out.println("4.-División");
        System.out.println("5.-Resto");
        System.out.println("elija una de las opciones anteriores");
        System.out.println("");

        opcion = entradaScanner.nextInt();

        do{

            if(opcion == 1){
                System.out.println("Ingresa el primer valor a sumar");
                numUno = entradaScanner.nextInt();
                System.out.println("Ingresa el segundo valor a sumar");
                numDos = entradaScanner.nextInt();
                resultado = numUno + numDos;
                System.out.println("la suma de " + numUno + " + " + numDos + " es: " + resultado);
                break;

            }else if(opcion == 2){
                System.out.println("Ingresa el primer valor a restar");
                numUno = entradaScanner.nextInt();
                System.out.println("Ingresa el segundo valor a restar");
                numDos = entradaScanner.nextInt();
                resultado = numUno - numDos;
                System.out.println("la resta de " + numUno + " - " + numDos + " es: " + resultado);
                break;

            }else if(opcion == 3){
                System.out.println("Ingresa el primer valor a multiplicar");
                numUno = entradaScanner.nextInt();
                System.out.println("Ingresa el segundo valor a multiplicar");
                numDos = entradaScanner.nextInt();
                resultado = numUno * numDos;
                System.out.println("la multiplicación de " + numUno + " * " + numDos + " es: " + resultado);
                break;

            }else if(opcion == 4){
                System.out.println("Ingresa el primer valor a dividir");
                numUno = entradaScanner.nextInt();
                System.out.println("Ingresa el segundo valor a dividir");
                numDos = entradaScanner.nextInt();
                resultado = numUno / numDos;
                System.out.println("el producto de " + numUno + " divido en " + numDos + " es: " + resultado);
                break;

            }else if(opcion == 5){
                System.out.println("Ingresa el primer valor para calcular resto");
                numUno = entradaScanner.nextInt();
                System.out.println("Ingresa el segundo valor para calcular resto");
                numDos = entradaScanner.nextInt();
                resultado = numUno % numDos;
                System.out.println("el resto de la division de " + numUno + " en " + numDos + " es: " + resultado);
                break;

            }else{
                System.out.println("vuelva a intentarlo");
                System.out.println("");
                opcion = entradaScanner.nextInt();
            }

        }while(opcion != 1 || opcion != 2 || opcion != 3 || opcion != 4 || opcion != 5);
            

    }
}