import java.util.Scanner;

public class inicioDeSesionLargo {

    public static void main(String[] args) {
        String nombreEnBD = "joel";
        String passEnBD = "p1988";
        String nombreEntrante = "";
        String passEntrante = "";

        Scanner entradaScanner = new Scanner(System.in);

        System.out.println("Introduce tú nombre de usuario:");
        nombreEntrante = entradaScanner.nextLine();

        System.out.println("Introduce tú contraseña");
        passEntrante = entradaScanner.nextLine();

        while(!nombreEnBD.equals(nombreEntrante) && !passEnBD.equals(passEntrante)){
            System.out.println("");
            System.out.println("usuario y pass incorrectos, intenta nuevamete");
            System.out.println("");

            System.out.println("Introduce tú nombre de usuario:");
            nombreEntrante = entradaScanner.nextLine();
    
            System.out.println("Introduce tú contraseña");
            passEntrante = entradaScanner.nextLine();
        }

        while (!nombreEnBD.equals(nombreEntrante) && passEnBD.equals(passEntrante)) {
            System.out.println("");
            System.out.println("nombre de usuario incorrecto, intenta nuevamente");

            System.out.println("Introduce tú nombre de usuario:");
            nombreEntrante = entradaScanner.nextLine();
        }

        while (nombreEnBD.equals(nombreEntrante) && !passEnBD.equals(passEntrante)) {
            System.out.println("");
            System.out.println("pass incorrecta intenta nuevamente");
    
            System.out.println("Introduce tú contraseña");
            passEntrante = entradaScanner.nextLine();
        }
        System.out.println("");
        System.out.println("inicio correcto");

    }
}