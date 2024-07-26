import java.security.SecureRandom;
import java.util.Scanner;
public class Switch_Expression {
    public static void main(String[] args) {
//        System.out.print("Enter your age: ");
        Scanner obj = new Scanner(System.in);
//        int age = obj.nextInt();
//        switch (age) {
//            case 18:
//                System.out.println("You r not able to drive.");
//                break;
//            case 25:
//                System.out.println("You can drive.");
//                break;
//            case 50:
//                System.out.println("You should be more carefull.");
//                break;
//            default:
//                System.out.println("Invalid Input");
//                break;
//        }
        System.out.print("Enter your favourite color: ");
        String color = obj.next();
        // Enhanced Switch
        switch (color) {
            case "red" -> {
                System.out.println("You like red color.");
                System.out.println("You like red color.");
                System.out.println("You like red color.");
                System.out.println("You like red color.");
                System.out.println("You like red color.");
            }
            case "green" -> System.out.println("You like green color.");
            case "blue" -> System.out.println("You like blue color.");
            case "purple" -> System.out.println("You like purple color.");
            default -> System.out.println("You like other other.");
        }
        // Old version
//        switch (color) {
//            case "red":
//                System.out.println("You like red color.");
//                break;
//            case "green":
//                System.out.println("You like green color.");
//                break;
//            case "blue":
//                System.out.println("You like blue color.");
//                break;
//            case "purple":
//                System.out.println("You like purple color.");
//                break;
//            default:
//                System.out.println("You like other other.");
//                break;
//        }
    }

}
