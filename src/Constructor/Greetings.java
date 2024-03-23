package Constructor;

public class Greetings {

    ///    TYPE OF METHODS

    //No parameters no return value
    void m1(){
        System.out.println("Hello");
    }

    //No parameters return value =String
    String m2(){
        return "Hello,how are you";
    }

    //Takes params no return value
    void m3(String name){
        System.out.println("Hello "+ name);
    }

    //Takes params, return value

    String m4(String lastname){
        return  ("Hello "+ lastname);
    }

}
