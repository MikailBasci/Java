public class Main {
    public static void main(String[] args) {
        // classlar referans tiptir
        // gerekli olmadıkça new yapmayın
        customerManeger customerManeger=new customerManeger();
        customerManeger.updete();
        customerManeger.remove();
        customerManeger.add();


// değer tipler value
        //referans tipler gibi değillerdir değerleri oluştşrdakları zaman yanyanadır
        int number1=10;
        int number2=20;
        number2=number1;
        number1=30;
        System.out.println(number2); //cevap 10



    }
}