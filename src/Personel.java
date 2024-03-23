public class Personel {

    String isim;
    int maas;
    int sicilNo;

    public static void bilgi(){
        System.out.println("Personele ait bilgiler");
    }

    public void info(){

        System.out.println("Personel ismi:  " + this.isim);
        System.out.println("Personel maas:  " + this.maas);
        System.out.println("Personel sicil:  "+this.sicilNo);

    }

}
