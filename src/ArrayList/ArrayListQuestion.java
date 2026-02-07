package ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

class Student{
    private int age;

    Student( int age){
        this.age = age;
    }

    public void display(){
        System.out.println("Age: "+age);
    }
}

class StudentServices{

   private ArrayList<Student> list = new ArrayList<>();

   public void add(Student s){
       list.add(s);
       System.out.println(list);
   }
   public void delete(){

   }
   public void display(){
       System.out.println(list);
   }
}



public class ArrayListQuestion {
    public static void main(String[] args){

//        Creating StudentService object
        StudentServices Ss = new StudentServices();

//        Menu

        System.out.println("1. Add");
        System.out.println("2. Delete");
        System.out.println("3. Change");
        System.out.println("4. Display");
        System.out.println("5. Exit");
        System.out.println("Enter number");

        // Asking from user
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        switch(number){

            case 1:
                System.out.println("Enter age.");
                int age = sc.nextInt();
                Student s = new Student(age);
                System.out.println("Thank You.");
                System.out.println("you want to check what you've enter?\n 1. Display.\n 2. Exit.");
                int ask = sc.nextInt();
                if(ask == 1){
                    Ss.display();
                }
                Ss.add(s);
                break;

            case 2:
                System.out.println("Enter the number you want to delete");
                byte b = sc.nextByte();
                break;

            case 4:
                System.out.println();
                Ss.display();

        }

    }
}
