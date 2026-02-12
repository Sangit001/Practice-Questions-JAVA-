package ExceptionHandling;

public class Basic {
    public static void main(String[] args) {
        try{
            int a = 10/0;
        }catch(ArithmeticException e){
            System.out.println("Can't divisible by 0");
        }
    }
}
