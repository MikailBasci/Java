public class Main {
    public static void main(String[] args) {

        int[] number={1,2,3,4,5,6,8,9,14,13};
        int aranacak=6;
        boolean varmı =false;
        for(int number1:number){
            if(number1==aranacak){

                varmı=true;
                break;
            }
        }
        System.out.println("aranan sayı varmı: "+varmı);
    }
}