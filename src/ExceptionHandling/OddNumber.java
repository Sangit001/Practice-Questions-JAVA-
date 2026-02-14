package ExceptionHandling;

import java.util.Scanner;
//Write a Java program to create a method that takes an integer as a parameter and throws an exception if the number is odd.

class OddEven{
    Scanner sc = new Scanner(System.in);
    void ask(){
        System.out.println("Enter any number");
        int ask = sc.nextInt();
    }

}

public class OddNumber{
    public static void main(String[] args) {

        int input = sc.nextInt();

        try{
            if(input % 2 == 0){
                System.out.println("This is the Even Value.");
            }
        }catch(ArithmeticException o){
            System.out.println("This is odd value.");
        }
    }

}
