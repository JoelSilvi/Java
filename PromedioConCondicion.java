public class PromedioConCondicion {

    public static void main(String[] args) {
        int notaUno = 2;
        int notaDos = 1;
        int notaTres = 6;

        int resultadoPromedio = (notaUno + notaDos + notaTres) / 3;

        

        if (resultadoPromedio >= 4){
            System.out.println("Alumno aprobó");
        }else{
            System.out.println("Alumno reprobó");
        }

            System.out.println("el promedio del alumno es: " + resultadoPromedio);
    }
}