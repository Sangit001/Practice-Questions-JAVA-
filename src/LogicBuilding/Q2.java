package LogicBuilding;
import java.util.Scanner;


public class Q2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number that you need table of.");
        int input = sc.nextInt();
        int sum = 0;
        for(int i = 1; i<=10; i++){
            System.out.println( input +" x "+ i + " = " +input*i);
        }
    }
}
