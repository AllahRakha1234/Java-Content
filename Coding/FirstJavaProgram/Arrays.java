public class Arrays {
    public static void main(String[] args) {

//        Three ways to make the array:

//        int[] marks = new int[3];
//        marks[0] = 60 ;
//        marks[1] = 65 ;
//        marks[2] = 70 ;

//        int[] marks;
//        marks = new int[3];
//        marks[0] = 60 ;
//        marks[1] = 65 ;
//        marks[2] = 70 ;

//        int [] marks = {60, 65, 70};
//        float [] marks = {60.5f, 65.5f, 70.5f};
//        String [] students = {"Ali", "Ahmad", "Aslam"};
//
//        for (int i = 0; i < marks.length; i++) {
//            System.out.print(students[i]+" = ");
//            System.out.println(marks[i]);
//        }
//        System.out.println(marks.length);

        // ****************** For each loop *********************

//        int [] marks = {60, 65, 70};
//        for(int mark:marks){
//            System.out.println(mark);
//        }
        // ****************** Multi Dimensional Arrays *************************

//        int[][] flats;
//        flats = new int[3][3];
//        flats[0][0] = 100 ;
//        flats[0][1] = 101 ;
//        flats[0][2] = 102 ;
//        flats[1][0] = 200 ;
//        flats[1][1] = 201 ;
//        flats[1][2] = 202 ;
//        flats[2][0] = 300 ;
//        flats[2][1] = 301 ;
//        flats[2][2] = 302 ;

//        for (int i = 0; i < flats.length; i++) {
//            for (int j = 0; j < flats[i].length; j++) {
//                System.out.print(flats[i][j]);
//                System.out.print(" ");
//            }
//            System.out.println();
//        }
//        // ******** Enhanced For or foreach loop *********

//        System.out.println(flats.length);
//        for (int[] flat : flats) {
//            for (int j = 0; j < flat.length; j++) {
//                System.out.print(flat[j]);
//                System.out.print(" ");
//            }
//            System.out.println();
//        }

        // ******** 3-D Array ************

        int[][][] flats = {{{1,2,3},
                            {4,5,6}},
                           {{1,2,3},
                           {4,5,6}},
                           {{1,2,3},
                           {4,5,6}}};
        // For each loop displaying 3-D Array
        for(int[][] flat:flats){
            for (int[] flatt:flat) {
                for(int flattt:flatt) {
                    System.out.print(flattt);
                    System.out.print(" ");
                }
                System.out.println();
            }
        }
    }
}