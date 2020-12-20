public class variables {
    public static void main(String[] args) {
        
        String nombreUno = "Joel";
        String nombreDos = "Pedro";
        String nombreTres = "Diego";
        String nombres = nombreUno + " " + nombreDos + " " + nombreTres;
        
        int numeroUno = 5;
        int numeroDos = 3;
        int numeroTres = 10;
        int resultado= numeroUno + numeroDos + numeroTres;

        boolean subioUno = true;
        boolean subioDos = false;
        boolean subioTres = true;


        
        System.out.println("el valor de tu suma es: " + resultado);
        System.out.println("los participantes: " + nombres);

        System.out.println(nombreUno + " obtuvo: " + numeroUno + " y el resultado fue: " + subioUno);
        System.out.println(nombreDos + " obtuvo: " + numeroDos + " y el resultado fue: " + subioDos);
        System.out.println(nombreTres + " obtuvo: " + numeroTres + " y el resultado fue: " + subioTres);
    }
}