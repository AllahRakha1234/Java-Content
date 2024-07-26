public class Method_Overloading_VarArgs {

//    static int sum(int x, int y){
//        return x+y ;
//    }
//    static int sum(int x, int y, int z){
//        return x+y+z ;
//    }
//    static int sum(int w,int x, int y, int z){
//        return w+x+y+z ;
//    }
    // ************ Here int x is written to make one argument compulsory to function call. ******************
    static int sum(int x, int ...arr){
        int result = x ;
        for(int element:arr) {
            result += element;
        }
        return result;
    }

    public static void main(String[] args) {
        int a1 = 5 ;
        int a2 = 5 ;
        int a3 = 5 ;
        int a4 = 5 ;
//        System.out.println("The sum of nothing is: " + sum());
        System.out.println("The sum of one value is: " + sum(5));
        System.out.println("The sum of a1 and a2 is: " + sum(a1, a2));
        System.out.println("The sum of a1, a2 and a3 is: " + sum(a1, a2, a3));
        System.out.println("The sum of a1, a2, a3 and a4 is: " + sum(a1, a2, a3, a4));
    }
}
