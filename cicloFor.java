import java.util.Scanner;
public class cicloFor {

    public static void main(String[] args) {
        Scanner entradaScanner = new Scanner (System.in);
        int valor = 0;
        
        System.out.println("");
        System.out.println("1 = Incrementar de 0 a 10");
        System.out.println("2 = Decrementar de 10 a 0");
        System.out.println("*******************************");
        System.out.println("***** Escoja Opción 1 o 2 *****");
        System.out.println("*******************************");
        System.out.println("");
        valor = entradaScanner.nextInt();
        

        if(valor == 1){
            System.out.println("");
            for (int i=0; i<=10; i++){
                System.out.println("el valor incrementado es: " + i);
            }

        }else if(valor == 2){
            System.out.println("");
            for(int d=10; d>=0; d--){
                System.out.println("el valor del decremento es: " + d);
            }
            
        }else{
            System.out.println("");
            System.out.println("Opción no válida");
        }

    }
}