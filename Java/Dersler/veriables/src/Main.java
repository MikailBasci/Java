public class Main {
    public static void main(String[] args) {
    // bir datayı birden fazla kez yazmayı ortadan kaldırır
        int ogrenciSayısı=12;
        String mesaj="ogrenci Sayısı:";
        // javada bir değişkenin veri türü değişken atandığı zaman belli olur.
        ogrenciSayısı=13;
        // bir değişkenin değeri daha sonra değiştirilebilir.

        System.out.println(mesaj+ogrenciSayısı);
        System.out.println(mesaj+ogrenciSayısı);
        System.out.println(mesaj+ogrenciSayısı);
        System.out.println(mesaj+ogrenciSayısı);
        System.out.println("Hi Student number:"+ ogrenciSayısı);

    }
}