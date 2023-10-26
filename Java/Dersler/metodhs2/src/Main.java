public class Main {
    public static void main(String[] args) {
        // void fonksiyonlar sadece emir kipi ile calışır.Birşey yap dersin gider yapar sanuç döndürmez,değişkenlere atanmaz
        ekle();
        çıkar();
        int toplam=total(2,9);
        System.out.println(toplam);
        int toplam2=total2(3,5,7,5,9);
        System.out.println(toplam2);
    }
    public static void ekle(){
        System.out.println("müşteri adı eklendi");

    }
    public static void çıkar(){
        System.out.println("müşteri adı çıkarıldı");
    }
    // değer return eden fonksiyonlar ise şonuç döndüren fonksiyonlardır.
    public static int total(int number1,int number2){
        return number1+number2;

    }
    //birden fazla paramatleli fonksiyon
    public static int total2(int... numbers){
        int total=0;
        for(int number:numbers){
            total=total+number;

        }
        return total;

    }


}