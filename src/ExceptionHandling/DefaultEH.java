package ExceptionHandling;

public class DefaultEH {

    public static void main(String[] args){

        toDo();

    }
    public static void toDo(){
        toDoMore();
    }
    public static void toDoMore(){
        System.out.println(10/0);
    }
}
// In this case JVM checks to the toDoMore() where the exception happens, and it searches for exception handling
// but there is no any handling and so on so main method also give the responsibility to JVM, and it throws an error with
// the help default exception handler.