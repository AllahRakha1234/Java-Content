/*
----> In this we way can inherit/extend different interfaces in one interface and then implement all those
interfaces in one class or more...
----> We can extend multiple interfaces in one interface as well
 */
interface SampleInterface{
    void meth1();
    void meth2();
}
interface MidInterface{
    void midMeth();
}
interface ChildInterface extends SampleInterface,MidInterface{
    void meth3();
    void meth4();
}
class Methods implements ChildInterface{
    public void meth1(){
        System.out.println("meth1");
    }
    public void meth2(){
        System.out.println("meth2");
    }
    public void midMeth(){
        System.out.println("Mid meth");
    }
    public void meth3(){
        System.out.println("meth3");
    }
    public void meth4(){
        System.out.println("meth4");
    }
}
public class Inheritance_In_Interfaces {
    public static void main(String[] args) {
        Methods m = new Methods();
        m.meth1();
        m.meth2();
        m.midMeth();
        m.meth3();
        m.meth4();
    }
}
