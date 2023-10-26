public class forişlem {
    public  int topla(int ... number){
        int total=0;
        for (int num:number){
            total=total+num;
        }
        return total;
    }
    public int çıkar(int number1,int number2){


        return number1-number2;
    }
    public  int çarp(int number1,int number2){


        return number1*number2;
    }
    public  int böl(int number1,int number2){
        if(number2==0){
            System.out.println("hatalı sayı");
        }


        return number1/number2;
    }
    // birden fazla işlemin çarpması nasıl yapışır bak
    public  int çarp2(int... number2){
        int sonuç=1;
        for (int number:number2){
            sonuç=sonuç*number;

        }
        return sonuç ;
    }


}
