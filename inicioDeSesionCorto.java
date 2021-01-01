import java.util.Scanner;

public class inicioDeSesionCorto {
    public static void main(String[] args) {

    Scanner entradaScanner = new Scanner(System.in);

        String nombreBD = "Joel";
        String nombreEntrada = "";
        String passBD = "12";
        String passEntrada = "";

        System.out.println("Ingrese nombre de usuario:");
        nombreEntrada = entradaScanner.nextLine();

        System.out.println("");

        System.out.println("Ingrese pass");
        passEntrada = entradaScanner.nextLine();

        while (!nombreBD.equalsIgnoreCase(nombreEntrada) || !passBD.equals(passEntrada)) {
            System.out.println("");
            System.out.println("usuario o pass incorrectos, vuelva a intentarlo");
            System.out.println("");

            System.out.println("Ingrese nombre de usuario:");
            nombreEntrada = entradaScanner.nextLine();
    
            System.out.println("Ingrese pass");
            passEntrada = entradaScanner.nextLine();
        }
        System.out.println("");
        System.out.println("inicio de sesión exitoso");
        System.out.println("");




    }
}
