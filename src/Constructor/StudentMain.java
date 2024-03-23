package Constructor;

public class StudentMain {

    public static void main(String[] args) {
/*
    Bir classı şablon olarak kullanıp bu şablona göre nesneler üretiriz.Ürettiğimiz nesnelerin özelliklerini
    belirlerken aşağıdaki yöntemleri kullanırız.

    we use following methods for defining object's features
 */
        //1.method:Using object reference variables.Atamayı burda yaparız
      /* Student st=new Student();
        st.sname="Esra";
        st.sid=107;
        st.graduate='A';


        //2.method:Using methods Atamayı Student classında yaparız.
        st.setStudentData(103,"Ayse",'B');
        st.printStudentData();

        //3.method:using constructor
        /*
            Differences Method and Constructor
        Constructor sınıf ismi ile aynı olmak zorundadir.Methodun aynı olmak zorunda değil
        Constructor içerisine logical operation kullanılmaz.Loop vs.Methodda kullanılır
        Constructor önüne void vs.yazılmaz bir sey return etmez, metot return edebilir.
        Bir obje oluşturulduğunda otomatik parametresiz const. oluşur,method oluşmaz



               Ne zaman method ne zaman const oluşturmalı?
        Const. ile sadece variablellara data assign edebiliriz.Logical bir işlem
        koyamayız.(if else gibi).
        Method ile kontol yapabiliriz.Loop gibi işlemler yapabiliriz.

       */




        Student st=new Student(100, "Fatma", 'C');
        st.printStudentData();


    }
}
