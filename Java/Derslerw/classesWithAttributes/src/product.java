public class product {
    // her class ta bir constructors vardır (yapıcı blok demek)
    // cunstructors normalde classlarda gizlidir
    // constructors classla aynı isme sahip olmalı
    // classslarda birden fazla aynı fonksiyon için
    //    // parametlereleri farklı olduğu sürece istenildiği zaman çağrılmak kaydıyla tutlabilir
    public product(int _stockAmount,int _id,double _priece,String _descriiption,String _name){
        this._id=_id;
        this.kod=kod;

        this._name=_name;
        this._descriiption=_descriiption;
        this._priece=_priece;
        this._stockAmount=_stockAmount;


    }

    public product(){
    }






    // classlar özellik barındırabilir
    //attributes | files
    private int _stockAmount; // public anlamı her yerden ulaşılabilirlik

    private String _descriiption;
   private String _name; // privite anlamı sadece bağlı olduğu blokta çalışır
    // bu if,döngü,fonksiyon,class gibi bağlı olduğu blokta  çalşır
    private double _priece;
    private int _id;
    //private uygulaması müşteri yazmaz sadece okuması için kullanılabilir
    private String kod;
public void metot(){

    System.out.println(geName());
}
// pravite bir özellikle işlem yapam için get ve set kulanılır.
    //geter
    public int getId(){

    return _id;
    }
    //seter
    public void setId(int id){
    this.setİd(id);

    }





    public double get_priece() {

    return _priece;
    }

    public void set_priece(double priece) {

    this._priece=priece;
    }


    public int getStockAmount() {
        return _stockAmount;
    }

    public void setStockAmount(int _stockAmount) {
        this._stockAmount = _stockAmount;
    }

    public String getDescriiption() {
        return _descriiption;
    }

    public void setDescriiption(String _descriiption) {
        this._descriiption = _descriiption;
    }

    public String geName() {
        return _name;
    }

    public void setName(String _name) {
        this._name = _name;
    }

    public double getPriece() {
        return _priece;
    }

    public void setPriece(double _priece) {
        this._priece = _priece;
    }

    public int getİd() {
        return _id;
    }

    public void setİd(int _id) {
        this._id = _id;
    }

    public String getKod(){

    return _name.substring(0,1)+_id;
                                 }

}

