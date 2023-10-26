public class Main {
    public static void main(String[] args) {

        int number=20;
        if(number<20){
            System.out.println("sayı 20'den küçüktür");
        }//birden fazla if kullanılabilir
        if(number<15){
            System.out.println("sayı 15'den küçüktür");
        }else if(number==20){
            System.out.println("sayı 20'ye eşittir");
        }else{
            System.out.println("sayı 20'den küçük değildir");

        }
        //else eğer if bloğu şartını karsılamassa çalışır
        //Eğer kodda bir hata yok ise if veya else şartı karşılayan blok çalışır


    }
}