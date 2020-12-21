import java.util.Scanner;

public class ControlVacaciones {

    public static void main(String[] args) {


        System.out.println("******************************************");
        System.out.println("******************************************");
        System.out.println("Control vacaciones del personal");
        System.out.println("******************************************");
        System.out.println("******************************************");
        System.out.println("Departamentos");
        System.out.println("Atención al cliente = 1");
        System.out.println("Logística = 2");
        System.out.println("Gerencia = 3");
        System.out.println("Elija Departamento");
        
        int DepartamentoCliente = 0;
        String nombre = "";
        int antiguedadLaboral = 0;

        Scanner IngresoScanner = new Scanner(System.in);
        Scanner IngresoTextoScanner = new Scanner(System.in);

        DepartamentoCliente = IngresoScanner.nextInt();


        if (DepartamentoCliente !=1 && DepartamentoCliente !=2 && DepartamentoCliente !=3){
            System.out.println("departamento erróneo");
        }else{

            System.out.println("Ingrese su nombre");
            
            nombre = IngresoTextoScanner.nextLine();
            
            System.out.println("Ingrese Años de servicio");
            
            antiguedadLaboral = IngresoScanner.nextInt();

            if(DepartamentoCliente == 1){
                if (antiguedadLaboral >= 1 && antiguedadLaboral <2){
                    System.out.println("El colaborador " + nombre + " tiene 6 días de vacaciones");
                }else if(antiguedadLaboral >=2 && antiguedadLaboral <=6){
                    System.out.println("El colaborador " + nombre + " tiene 14 días de vacaciones");
                }else{
                    System.out.println("El colaborador " + nombre + " tiene 20 días de vacaciones");
                }
            }else if(DepartamentoCliente == 2){
                if(antiguedadLaboral >= 1 && antiguedadLaboral < 2 ){
                    System.out.println("El colaborador " + nombre + " tiene 7 días de vacaciones");
                }else if(antiguedadLaboral >= 2 && antiguedadLaboral <=6){
                    System.out.println("El colaborador " + nombre + " tiene 15 días de vacaciones");
                }else{
                    System.out.println("El colaborador " + nombre + " tiene 22 días de vacaciones");
                }
                
            }else{
                if(antiguedadLaboral >=1 && antiguedadLaboral < 2){
                    System.out.println("el colaborador " + nombre + " tiene 10 días de vacaciones");
                }else if(antiguedadLaboral >= 2 && antiguedadLaboral <=6){
                    System.out.println("el colaborador " + nombre + " tiene 20 días de vacaciones");
                }else{
                    System.out.println("el colaborador " + nombre + " tiene 30 días de vacaciones");
                }

            }
        }
    }
}