public class cicloDoWhile {

    public static void main(String[] args) {
        int i = 0;

        do{
            i++;
            if (i<=10){
                System.out.println(i + ", ");
            }else{
                System.out.println(i);
            }

        }while(i <= 10);
    }
}