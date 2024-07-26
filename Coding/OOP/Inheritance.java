
class Base{
    int var1 ;
    Base(){
        System.out.println("I am base class constructor.");
        System.out.println("The value of var1 is: " + var1);

    }
    Base(int i){
        this.var1 = i ;
        System.out.println("I am base class constructor.");
        System.out.println("The value of var1 is: " + var1);

    }
    public void getNumber(){
        System.out.println("The value of var1 is: " + var1);
    }
}
class Derived extends Base{
    int var2 ;
    Derived(){
        System.out.println("I am derived class constructor.");
        System.out.println("The value of var1 is: " + var2);

    }
    Derived(int i, int j){
        super(j);                      // Passing arguments to base class constructor
        this.var2 = i ;
        System.out.println("I am derived class constructor.");
        System.out.println("The value of var2 is: " + var2);

    }
    public void getNumber(){
        System.out.println("The value of var2 is: " + var2);
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Derived d = new Derived(7,8);
    }
}
