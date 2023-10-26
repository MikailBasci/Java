public class Main {
    public static void main(String[] args) {
        int number1=10;
        int number2=20;
        int number3=30;
        int enBüyükSayı=number2;
        if(number1>enBüyükSayı){
            enBüyükSayı=number1;
        }else  if(number3>enBüyükSayı){
            enBüyükSayı=number3;
        }
        System.out.println(enBüyükSayı);

    }
}