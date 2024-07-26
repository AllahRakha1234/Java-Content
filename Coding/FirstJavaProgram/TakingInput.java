import java.util.Scanner;
public class TakingInput {
    public static void main(String[] args) {
        System.out.println("Taking input from the user:-");
        Scanner objSc = new Scanner(System.in);
//        System.out.print("Enter the first number: ");
//        int num1 = objSc.nextInt();
//        float num3 = objSc.nextFloat();
//        System.out.print("Enter the second number: ");
//        int num2 = objSc.nextInt();
//        float num4 = objSc.nextFloat();
//        System.out.print("The sum of numbers is: ");
//        System.out.print(num1 + num2);
//        System.out.print(num3 + num4);
        // For validity of input
//        boolean state = objSc.hasNextInt();
//        System.out.println(state);
//        Taking string input from the user
//        String str = objSc.next();
//        System.out.println(str);
        String str1 = objSc.nextLine();
        System.out.println(str1);
    }
}
