import java.util.Scanner;

public class Operaciones {

    public static void main(String[] args) {

        int resultado = 0;
        
        System.out.println("Operaciones disponibles");
        System.out.println("Suma = 1");
        System.out.println("Resta = 2");
        System.out.println("Multiplicación = 3");
        System.out.println("División = 4");
        System.out.println("Introduce el número que corresponde a tu operación");

        int opcionEntradaTeclado = 0;
        Scanner opcionEntradaScanner = new Scanner (System.in);
        opcionEntradaTeclado = opcionEntradaScanner.nextInt();


        if(opcionEntradaTeclado !=1 && opcionEntradaTeclado !=2 && opcionEntradaTeclado !=3 && opcionEntradaTeclado !=4){
            System.out.println("opción no existe");
            
        }else{

            System.out.println("Introduzca el primer valor");
            int numUnoEntradaTeclado = 0;
            numUnoEntradaTeclado = opcionEntradaScanner.nextInt();
    
            System.out.println("Introduzca el segundo valor");
            int numDosEntradaTeclado = 0;
            numDosEntradaTeclado = opcionEntradaScanner.nextInt();
    
            
            if (opcionEntradaTeclado == 1){
                resultado = numUnoEntradaTeclado + numDosEntradaTeclado;
                System.out.println("el resultado de la suma es: " + resultado);
            }else if(opcionEntradaTeclado == 2){
                resultado = numUnoEntradaTeclado - numDosEntradaTeclado;
                System.out.println("el resultado de la resta es: " + resultado);
            }else if(opcionEntradaTeclado == 3){
                resultado = numUnoEntradaTeclado * numDosEntradaTeclado;
                System.out.println("el resultado de la multiplicación es: " + resultado);
            }else if (opcionEntradaTeclado == 4){
                resultado = (numUnoEntradaTeclado + numDosEntradaTeclado) /2;
                System.out.println("el resultado de la división es: " + resultado);
            }else{
                System.out.println("código no existe");
            }
        }
    }
}



// public class Operaciones {
//     public static void main(String[] args) {
//         Scanner entradaDeDatos = new Scanner (System.in);
//         String nombre = "";
//         int numUno = 0, numDos = 0, resultado = 0;

//         System.out.println("¿Cuál es tú nombre");
//         nombre = entradaDeDatos.nextLine();

//         System.out.println("dame el primer valor para la suma: ");
//         numUno = entradaDeDatos.nextInt();

//         System.out.println("dame el segundo valor para la suma");
//         numDos = entradaDeDatos.nextInt();

//         resultado = numUno + numDos;

//         System.out.println("Hola " + nombre + " el resultado de la suma es: " + resultado);


//     }
// }