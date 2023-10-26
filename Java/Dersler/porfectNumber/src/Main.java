public class Main {
    public static void main(String[] args) {

        int number =28 ;
        int total=0;
        boolean isPrime=false;
        for(int i=1;i<number;i++) {
            int kalan = number % i;
            if (kalan == 0) {
                System.out.println(i);
                total=total+i;
                 }

             }
            if(total==number){
                isPrime=true;
            }
            System.out.println(isPrime);
            }
        }
