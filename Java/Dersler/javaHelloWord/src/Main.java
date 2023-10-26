public class Main {
    public static void main(String[] args) {
        int Number = 25;
        boolean asalmı =true;

        for(int i =2;i<Number;i++){

            if(Number%i==0){
                asalmı=false;
            }
        }
        System.out.println(asalmı);
    }
}