package Constructor;

public class Student {
 //Aşagıda yer alanlar class variabledır
    int sid;
    String sname;
    char graduate;

    void printStudentData(){

        System.out.println(sid + " "+sname+ " "+ graduate+ " ");
    }


    //StudentMain classından gelen değerleri buradaki variablellarda store ederiz.
    //We store the values from the StudentMain class in the variables here.
    void setStudentData(int id,String name, char grd){ //Parametrede yer alan variablellar local variable dır
          sid=id;
          sname=name;
          graduate=grd;

    }

    Student(int id,String name, char grd){
        sid=id;
        sname=name;
        graduate=grd;
    }

    Student(String name, char grd){

        sname=name;
        graduate=grd;
    }


}
