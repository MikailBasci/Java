public class Main {
    public static void main(String[] args) {

        char[] harf ={'a','ı','o','u','e','i','ö','ü'};
         for (char Harf:harf){
             switch (Harf){
                 case 'a':
                 case 'ı':
                 case 'o':
                 case 'u':
                     System.out.println("kalındır");
                     break;
                 case 'e':
                 case 'i':
                 case 'ö':
                 case 'ü':
                     System.out.println("ince");
                     break;


             }

         }


    }
}