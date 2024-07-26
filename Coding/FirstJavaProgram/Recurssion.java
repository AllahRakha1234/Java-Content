public class Recurssion {
//    static int factorial(int num) {

//        int sum = 0;
//        if (num == 0 || num == 1)
//        {
//            return 1 ;
//        }
//        else {
//            int temp = num * factorial(num-1);
//            return temp ;
//        }}
        // Point: The same logic can be use to calculate anything of n terms
        // ***************** Fibonacci Series ****************
//        static int fib(int n){
//            if(n == 1 || n == 2){
//                return n-1;
//            }
//            else{
//                return fib(n-1) + fib (n-2);
//            }
//        }
        // ****************** Print pattern by recursion *******************

        static void pattern ( int n){
            if (n > 0) {
                pattern(n - 3);
                for (int i = 0; i < n; i++) {
                    System.out.print("*");
                }

                System.out.println();
            }
        }
        public static void main (String[]args){

//        System.out.println("The factorial of 5 is: " + factorial(5));
//        System.out.println("The factorial of 4 is: " + factorial(4));
//        Fib series is: 0,1,1,2,3,5,8,13,21,34
//        System.out.println("The sum of series is: " + fib(7));
            System.out.println("The pattern is:\n");
            pattern(5);
        }
}
