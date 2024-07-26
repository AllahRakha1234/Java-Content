import java.util.Scanner;
public class Strings_1 {
    public static void main(String[] args) {
        int x = 4 ;
        float y = 2.2f ;
//        System.out.print("The value of x is "+x+ " and y is "+y+"\n");
//        System.out.println("The value of x is "+x+ " and y is "+y);
//        System.out.printf("The value of x is %d and y is %.3f ",x,y);
//        System.out.printf("\nThe value of x is %d and y is %9.3f ",x,y);
        String str = new String("Harry");
        System.out.println(str);
        Scanner obj1 = new Scanner(System.in);
        System.out.println("What is your name ?");
        String name = obj1.nextLine();
        System.out.println(name);
    }
}

