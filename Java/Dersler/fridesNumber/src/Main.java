public class Main {
    public static void main(String[] args) {

         int number=220;
         int number1=284;
         int total1=0;
         int total2=0;
         for(int i =1;i<number;i++){
            int kalan=number%i;
            if(kalan==0){
                total1=total1+i;
            }
         }
        for(int j =1;j<number1;j++){
            int kalan1=number1%j;
            if(kalan1==0){
                total2=total2+j;
            }
        }
        if(total2==number && total1==number1){
            System.out.println("arkadaş sayılardır");
        }else{
            System.out.println("arkadaş sayılar değildir");
        }


    }
}