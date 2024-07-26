public class Methods {

    // **************** Without Object ***************
    static int sum(int x, int y){
        return x+y ;
    }
    // ***************** For Object ******************
    int Sum(int x, int y) {
        return x+y ;
}
    public static void main(String[] args) {
        // Point:
        Methods M1 = new Methods();
        // If we do not want to create the object then use static keyword before function name
         System.out.print("The sum of these numbers is: "+sum(4,5));
        System.out.print("\nThe sum of these numbers is: " + M1.Sum(4,5));
    }
}
