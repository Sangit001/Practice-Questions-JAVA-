package LogicBuilding;

public class Q5 {
    public static void main(String[] args) {
        int n = 5;
        int m = 5;

        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=m; j++){

                if(i == 2 && j == 2 || i == 2 && j == 3 || i == 2 && j == 4|| i == 2 && j == 5||
                        i == 4 && j == 1 ||i == 4 && j == 2 || i == 4 && j == 3 || i == 4 && j == 4
                ){
                    System.out.print(" ");
                    continue;
                }else{
                    System.out.print("*");
                }

            }
            System.out.println();
        }

    }
}
