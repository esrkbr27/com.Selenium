public class Main {

    /*

    **Static metotlar classa aittir.Class ismi ile çağrılabilir.selamVer() metodu statictir.
    **Nonstatic metotlar nesneye aittir.Class ismi ile çağrılamaz.Ancak o classa ait oluşturuLan nesne üzerinden
    çağrılabilir.mesajVer() metodu nonstatictir.
    **Static metotlar veya değişkenler memoryde sadece bir kere kaydedilir ve yer ayrılır.Statik her değer çağrıldığında
    bu alandan veriyi çağırır.
    **Nonstatic metot veya değişkenler obje oluşturulduğu anda objeye ait memoryde bir yer ayrılır.ve bu obje üzerinden
    çağrıldığına o objeye ait alandan veriler çağrılır.Yeni obje oluşturulduğda tekrar ona ait bir yer oluşturulur ve
    bilgiler bu objeye ait alandan çağrılır.
    **dikkat(); metodunu bu şekilde oluşturmak da mümkündür.Default access modifier

     */

    public static void selamver(){

        System.out.println("selamver çalıştı");
    }

    public void mesajver(){

        System.out.println("mesajver çalıştı");
    }
    void dikkat(){
        System.out.println("DİKKAT! NO MODİFİER");
    }
    public static void main(String[] args) {
/*
        Main.selamver();
        Main object = new Main();
        object.mesajver();

        Personel personel1 =new Personel();
        personel1.info();
        Personel.bilgi();


 */

        /*

        */

        Personel pers3=new Personel();
        pers3.isim="Esra";
        pers3.maas=40000;
        pers3.sicilNo=123456;
        pers3.info();
        System.out.println("*****************");
        Personel pers4=new Personel();
        pers4.isim="Ömer";
        pers4.maas=420000;
        pers4.sicilNo=2345;
        pers4.info();
        System.out.println("****************");
        pers4.isim="Ali";
        pers4.maas=450000;
        pers4.info();

    }
}