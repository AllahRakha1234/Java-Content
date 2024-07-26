
class Demo{
    public int w = 1 ;
    int x = 2 ;
    protected int y = 3 ;
    private int z = 4 ;
    void display(){
        System.out.println(w);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}

public class AccessModifier {
    public static void main(String[] args) {
            Demo d = new Demo();
            d.display();
            System.out.println(d.w);
            System.out.println(d.x);
            System.out.println(d.y);
//            System.out.println(d.z);

    }
}
