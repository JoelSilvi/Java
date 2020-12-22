import java.util.Scanner;

public class Opciones{
    public static void main(String[] args) {
        int resultado = 0;
        int parametro = 0;

        System.out.println("***************************************");
        System.out.println("***************************************");
        System.out.println("*******Operaciones Matemáticas*********");
        System.out.println("***************************************");
        System.out.println("Sumar = 1");
        System.out.println("Restar = 2");
        System.out.println("Multiplicar = 3");
        System.out.println("Dividir = 4");
        System.out.println("Resto = 5");
        System.out.println("Elija su opción");

        Scanner objetoScanner = new Scanner (System.in);
        parametro = objetoScanner.nextInt();

        if (parametro !=1 && parametro !=2 && parametro !=3 && parametro !=4 && parametro !=5){
            System.out.println("Opción Inválida");
        }else{
            System.out.println("Ingrese el primer valor:");
            int numUno = 0;
            numUno = objetoScanner.nextInt();

            System.out.println("Ingrese el segundo valor:");
            int numDos = 0;
            numDos = objetoScanner.nextInt();

            switch (parametro) {
                case 1: resultado = numUno + numDos;
                    System.out.println("El resultado de la suma es: " + resultado);
                    break;
                case 2: resultado = numUno - numDos;
                    System.out.println("El resultado de la resta es: " + resultado);
                    break;
                case 3: resultado = numUno * numDos;
                    System.out.println("El resultado de la multiplicación es: " + resultado);
                    break;
                case 4: resultado = (numUno + numDos)/2;
                    System.out.println("El resultado de la división es: " + resultado);
                    break;
                case 5: resultado = numUno % numDos;
                    System.out.println("El resto de la operación es: " + resultado);
                    break;
                default:
                System.out.println("Resultado Inesperado");
                    break;
            }
        }      
    }
}