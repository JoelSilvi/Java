public class ejerciciosBucles {

    public static void main(String[] args) {
        int i = 0;
        int d = 99;
        int fibonacciA = 0;
        int fibonacciB = 1;
        int fibonacciC = 0;
        // for (i = 1; i <=10; i++){
        //     if (i < 10){
        //         System.out.print(i + ",");
        //     }else{
        //         System.out.print(i);
        //     }
        // }

        // i = 1;
        // while(i<=10){
        //     if(i<10){
        //         System.out.print(i + ",");
        //     }else{
        //         System.out.print(i);
        //     }
        //     i++;
        // }

        // i = 1;
        // do{
        //     if (i<10){
        //         System.out.print(i + ",");
        //     }else{
        //         System.out.print(i);
        //     }
        //     i++;
        // }while(i<=10);


        // i = 1;
        // d = 99;
        // for(i=1; i<=5; i++){
        //     if(i<5){
        //         System.out.print(i + ",");
        //         System.out.print(d + ",");
        //     }else{
        //         System.out.print(i + ",");
        //         System.out.print(d);
        //     }
        // d--;
        // }


        // i = 1;
        // d = 99;
        // while(i<=5){
        //     if(i<5){
        //         System.out.print(i + ",");
        //         System.out.print(d + ",");
        //     }else{
        //         System.out.print(i + ",");
        //         System.out.print(d);
        //     }
        //     i++;
        //     d--;
        // }

        // i = 1;
        // d = 99;
        // do{
        //     if(i<5){
        //         System.out.print(i + ",");
        //         System.out.print(d + ",");
        //     }else{
        //         System.out.print(i + ",");
        //         System.out.print(d);
        //     }
        //     i++;
        //     d--;

        // }while(i<=5);



        for(i = 0; i <10; i++){
            if (i<9) {
                System.out.print(fibonacciA + ",");
                fibonacciC = fibonacciA + fibonacciB;
                fibonacciA = fibonacciB;
                fibonacciB = fibonacciC;    
            }else{
                System.out.print(fibonacciA);
            }
            
        }
    }
}