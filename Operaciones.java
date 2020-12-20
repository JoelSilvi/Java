import java.util.Scanner;

public class Operaciones {
    public static void main(String[] args) {
        System.out.println("Opciones a elegir");
        System.out.println("1 = sumar");
        System.out.println("2 = restar");
        System.out.println("3 = multiplicar");
        System.out.println("4 = dividir");
        System.out.println("5 = resto");
        System.out.println("Dígita la opción");

        int entradaOpcionPorTeclado = 0;
        int resultado = 0;
        Scanner entradaOpcionPorScanner = new Scanner(System.in);
        entradaOpcionPorTeclado = entradaOpcionPorScanner.nextInt();

        if(entradaOpcionPorTeclado !=1 && entradaOpcionPorTeclado !=2 && entradaOpcionPorTeclado !=3 && entradaOpcionPorTeclado !=4 
        && entradaOpcionPorTeclado !=5){
            System.out.println("código incorrecto");
        }else{
            System.out.println("ingrese el primer valor:");
            int ingresoNumeroUnoPorTeclado = 0;
            ingresoNumeroUnoPorTeclado = entradaOpcionPorScanner.nextInt();

            System.out.println("Ingrese el segundo valor");
            int ingresoNumeroDosPorTeclado = 0;
            ingresoNumeroDosPorTeclado =  entradaOpcionPorScanner.nextInt();
            

            if (entradaOpcionPorTeclado == 1){
                resultado = ingresoNumeroUnoPorTeclado + ingresoNumeroDosPorTeclado;
                System.out.println("el resultado de la suma es: " + resultado);
            }else if(entradaOpcionPorTeclado == 2){
                resultado = ingresoNumeroUnoPorTeclado - ingresoNumeroDosPorTeclado;
                System.out.println("el resultado de la resta es: " + resultado);
            }else if(entradaOpcionPorTeclado == 3){
                resultado = ingresoNumeroUnoPorTeclado * ingresoNumeroDosPorTeclado;
                System.out.println("el resultado de la multiplicación es: " + resultado);
            }else if(entradaOpcionPorTeclado == 4){
                resultado = (ingresoNumeroUnoPorTeclado + ingresoNumeroDosPorTeclado) /2;
                System.out.println("el resultado de la división es: " + resultado);
            }else{
                resultado = ingresoNumeroUnoPorTeclado % ingresoNumeroDosPorTeclado;
                System.out.println("el resto de la operación es: " + resultado);
            }
        }
    }
}
