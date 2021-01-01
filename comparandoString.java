import java.util.Scanner;

public class comparandoString {

    public static void main(String[] args) {
        Scanner entradaScanner = new Scanner(System.in);

        String nombreIntroducido0 = "";
        String nombreIntroducido1 = "";


        System.out.println("Ingresa el primer nombre");
        nombreIntroducido0 = entradaScanner.nextLine();
        System.out.println("");

        System.out.println("Ingresa el segundo nombre");
        nombreIntroducido1 = entradaScanner.nextLine();
        System.out.println("");

        if (nombreIntroducido0.equals(nombreIntroducido1)) {
            System.out.println(nombreIntroducido0 + " es igual a " + nombreIntroducido1);
        }else{
            System.out.println(nombreIntroducido0 + " es diferente de " + nombreIntroducido1);
        }

    }
}