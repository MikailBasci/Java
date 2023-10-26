public class Main {
    public static void main(String[] args) {

        int Number = 1;
        boolean isprime =true;
         if(Number<2){
             System.out.println("Geçersiz sayı");
             return;
         }
        for(int i =2;i<Number;i++){

            if(Number%i==0){
                isprime=false;
            }
        }
        System.out.println("sayı asalmı "+isprime);
    }
}