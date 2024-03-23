package Constructor;

public class GreetingsMain {

    public static void main(String[] args) {

        Greetings gr1=new Greetings();
        gr1.m1();

        String s=gr1.m2();
        System.out.println(s);

        gr1.m3("Esra");

        gr1.m4("Demirci");

    }
}
