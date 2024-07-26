class Base2 {
    int y;
    public void greet() {
        System.out.println("Salam");
    }
    public void sety(int i){
        y = i;
    }
    public void getY(){
        System.out.println("The value of y is: " + y );
    }
}
class Base3{

}
class Derived2 extends Base2{
    int y ;
    public void greet(){
        System.out.println("Salam, I am in Derived Class.   ");
    }
    public void setY(int i){
        y = i;
    }
    public void getY(){
        System.out.println("The value of y is: " + y);
    }
}
public class Dynamic_Dispatch_Method {
    public static void main(String[] args) {
        Base2 b = new Derived2();
//        Derived2 d = new Base2();  ------> Gives an error
//        Everything will be called of subClass or Derived class not of Base or Super class
//        Sub or Derive class object can be made by using reference of Base or Super class but not vice versa.
        b.sety(8);
        b.getY();
        b.greet();
    }
}
