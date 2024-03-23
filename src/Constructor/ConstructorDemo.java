package Constructor;

public class ConstructorDemo {
int x,y;
ConstructorDemo(){

}

ConstructorDemo(int a,int b){

    x=a+1;
    y=b+1;
}

  void sum(){
     System.out.println(x+y);
 }



    public static void main(String[] args) {
        ConstructorDemo cm=new ConstructorDemo();
        cm.x=10;
        cm.y=20;
        cm.sum();

        ConstructorDemo cm1=new ConstructorDemo(10,20);
        cm1.sum();

    }
}
