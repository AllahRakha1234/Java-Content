
abstract class Base1 {
    int x;

    public void greet() {
        System.out.println("Salam");
    }

    public abstract void getY();
}
class Derived1 extends Base1{
    int y ;
    public void greet(){
        System.out.println("Salam");
    }
    public void setY(int i){
        y = i;
    }
    public void getY(){
        System.out.println("The value of y is: " + y);
    }
}
public class Abstract_Class {
    public static void main(String[] args) {
//        Base1 b = new Base1();  ==> Give error
        Derived1 d = new Derived1();
        d.setY(5);
        d.getY();
        d.greet();
    }
}
