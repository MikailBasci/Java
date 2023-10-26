public class Main {
    public static void main(String[] args) {

        double[] myList={1.2,1.3,5.6,3.2,4.2 };
        double total=0;
        double enBüyük=myList[2];
        for(double number:myList){
            if(enBüyük<number){
                enBüyük=number;
            }
            total=total+number;
            System.out.println(number);

        }
        System.out.println(total);
        System.out.println(enBüyük);

    }
}