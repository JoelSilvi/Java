public class operadoresAritmeticos {
    public static void main(String[] args) {

        int numeroUno = 5;
        int numeroDos = 6;
        int numeroTres = 4;
        int numeroCuatro = 4;

        int resultadoSuma = numeroTres + numeroCuatro;
        int resultadoResta = numeroDos - numeroUno;
        int resultadoMultiplicacion = numeroUno * numeroDos;
        int resultadoDivision = (numeroTres + numeroCuatro) / 2;
        int resultadoResto = numeroDos % numeroUno;
        int variableMasEntero = resultadoSuma + 3;

        System.out.println("el resultado de la suma es: " + resultadoSuma);
        System.out.println("el resultado de la resta es: " + resultadoResta);
        System.out.println("el resultado de la multiplicación es: " + resultadoMultiplicacion);
        System.out.println("el resultado de la división es: " + resultadoDivision);
        System.out.println("el resultado del resto es: " + resultadoResto);
        System.out.println("el resultado de la variable resultadoSuma + 3 es : " + variableMasEntero);
    }
    
}