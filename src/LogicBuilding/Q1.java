package LogicBuilding;

public class Q1 {
    static void main(String[] args) {

        /*
        for (int i=0; i<5; i++){

            for (int j = 0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();

        }

         */

//        Print
//        1
//        12
//        123
//        1234
//        12345
/*
        for(int i = 0; i<=5; i++){
            for(int j = 0; j<i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

 */
//        Print
//        12345
//        1234
//        123
//        12
//        1
        int n = 5;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n-i+1; j++){
                System.out.print(j+" ");

            }
            System.out.println();
        }


    }
}
