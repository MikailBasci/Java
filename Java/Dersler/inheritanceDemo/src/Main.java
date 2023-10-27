public class Main {
    public static void main(String[] args) {
        TarımKrediHesaplama tarımKrediHesaplama= new TarımKrediHesaplama();
        oğretmenKrediHesaplama oğretmenKrediHesaplama=new oğretmenKrediHesaplama();
        AskerKrediManager askerKrediManager=new AskerKrediManager();
        oğretmenKrediHesaplama.hesaplama();
        tarımKrediHesaplama.hesaplama();
        // classlarda ortak özellikleri içinde barındıran class ile birlikte kalıtım classlarına bağlanılabilir
        KrediUI KrediUI=new KrediUI();
        KrediUI.krediHesapla(oğretmenKrediHesaplama);
        KrediUI.krediHesapla(tarımKrediHesaplama);
        KrediUI.krediHesapla(askerKrediManager);


    }
}