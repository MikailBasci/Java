public class Main {
    public static void main(String[] args) {
    numberBulmaca();
    numberBulmaca();
    //burdaki mantık programın farklı yerlerinde kodları tekrar tekrar yazmak yerine, değişkene değer atamak gibi foksiyonlarda kodu yazıp
        // programın farklı yeerlerinde çağırmak
        //yani b
    total(2,4);
           }
    public static void numberBulmaca(){

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
        message(aranacak);
        message(7); //burdaki 7 değeri fonksiyondaki parametreye karsılık gelir
    }

    public static void message(int aranacak){
        System.out.println("aranacak sayı:"+aranacak);
    } // fonksiyonlarda istendiği kadar parametre atanabilir.
    public static void total(int number1,int number2){
        System.out.println(number1+number2);
    }
}