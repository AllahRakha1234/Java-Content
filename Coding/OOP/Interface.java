/*
Many interfaces can be used to make a new class but many abstract classes cannot be used to make a new class
This is the biggest difference between interface and abstract class and in interface every function has to be
implemented.
Public keyword is required in implementation before functions
Interfaces are important to use because abstract classes cannot be inherited more than once or multiple inheritance is
not allowed in java that's why interfaces are used.
In interfaces methods have to implement/override but in case of fields(attributes) it its own will
*/

interface BiCycle {
//     *********** You can create and access variables in interface but cannot modify them because they are final ******
//    int speed = 120 ; ---> **** The variable declare here is final and cannot be changed further its value ****
    final int accessible = 34 ;
    public void speedDown(int dec) ;
    public void speedUp(int inc) ;
}
interface FeaturesOFBicycle{
    int tyres = 2 ;
    void Clutch();
    void breakUp();
}
class AvonBicycle implements BiCycle, FeaturesOFBicycle{
    int speed = 120;
//    int tyres = 4 ;
    void blowHorn(){
        System.out.println("Pi Pi Pi Pi...");
    }
    public void speedDown(int dec){
        speed -= dec ;
        System.out.println("Speed Decreasing....");
        System.out.println(speed);
    }
    public void speedUp(int inc){
        speed += inc ;
        System.out.println("Speed Increasing....");
        System.out.println(speed);
    }
    public void Clutch(){
        System.out.println("Clutch is pressed....");
    }
    public void breakUp(){
        System.out.println("Break is pressed....");
    }
}

public class Interface {
    public static void main(String[] args) {
        BiCycle bb = new AvonBicycle();    // ------> Allowed
        System.out.println(bb.accessible);
//        BiCycle b = new Bicycle();    ------> Not Allowed

        AvonBicycle b = new AvonBicycle();
        b.speedDown(2);
        b.speedUp(6);
        b.blowHorn();
        b.Clutch();
        b.breakUp();
        System.out.println(b.tyres);
    }
}
