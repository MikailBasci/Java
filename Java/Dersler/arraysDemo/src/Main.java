public class Main {
    public static void main(String[] args) {
// diziler içinde  birden fazla aynı tip elemanı bulunduran yapılardır.

        String [] ogrenciler= new String[3];
         ogrenciler[0]="mikail";
         ogrenciler[1]="Semihat";
        ogrenciler[2]="Çecani";

        for(int i=0;i<ogrenciler.length;i++){
            System.out.println(ogrenciler[i]);
        }
        for(String ogrenci:ogrenciler){
            System.out.println("Hi "+ogrenci);
        }
    }
}