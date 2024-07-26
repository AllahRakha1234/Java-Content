// package AllahRakha;
import AllahRakha.Gym.ARGym;
class SubClass extends ARGym{
    void getter(){
            System.out.print(w);
            // System.out.println(x);
            System.out.print(y);
            // System.out.println(z);
    }
}
public class UsingPackage{
    public static void main(String[] args) {
        System.out.println("I am using package.");
        // ARGym d = new ARGym();
        //     System.out.println(d.w);
        //     System.out.println(d.x);
        //     System.out.println(d.y);
        //     System.out.println(d.z);

        SubClass sc = new SubClass();
        sc.getter();
    }
}
// This is the method to use packagez