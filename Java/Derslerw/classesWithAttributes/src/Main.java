public class Main {
    public static void main(String[] args) {
        // clasın özellikleri kullanıcıdan alınabileir
        product product= new product(3,1,5000,"","leptop");// cunstructor metoduna bağlanıyor

//        product.setId(1);
//        product.setName("Asus");
//        product.setDescriiption("Asus intel i7");
//        product.setStockAmount(3);
//        product.set_priece(5200);
//        productManager productManager=new productManager();
//        productManager.add(product);






        // her class yalnızca bir işlemi yapar. mesela ozellik tutuyorsa özellik tutar veya işlem yapar
   System.out.println(product.getKod());
   System.out.println(product.getİd());


    }

}