public class Main {
    public static void main(String[] args) {
        String mesaj="Bugün Hava Çok Güzel.";
        System.out.println(mesaj);

        System.out.println(mesaj.length());
        System.out.println(mesaj.charAt(6));
        System.out.println(mesaj.concat(" Yaşasın"));
        System.out.println(mesaj.startsWith("B"));
        System.out.println(mesaj.endsWith("n"));
        System.out.println(mesaj.indexOf("."));
        System.out.println(mesaj.lastIndexOf("B"));
        char[] kelimeler= new char[7];
        mesaj.getChars(0,7,kelimeler,0);
        System.out.println(kelimeler);
        System.out.println(mesaj.replace(" ","-"));
        System.out.println(mesaj.substring(0,5));
        for(String msj:mesaj.split(" ")){
            System.out.println(msj);

        }
        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());
    }
}