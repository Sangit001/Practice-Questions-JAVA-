package ExceptionHandling;
import java.util.Scanner;
public class NumNotFound {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number from array");
        int ask = sc.nextInt();
        int[] arr = {1,2,3,4,6,7,8,9,10};
        try{
            for (int i : arr){
                if(i == ask){
                    System.out.println("Yes there is number: "+ ask);
                }

            }

        }catch(Exception e){
            System.out.println("Given number not found.");
        }
    }
}
