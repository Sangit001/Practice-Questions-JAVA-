package Constructor;

public class ThisAndSuper {

//    These are the keywords used to refers super class and current class instance member.

    static class Employee{
        String name = "sangit";
    }
    static class Senior extends Employee{
        String name = "sr.sangit";
       public void display(){
            System.out.println(super.name);
           System.out.println(this.name);
        }
    }

    public static void main(String[] args) {
        Senior s = new Senior();
        s.display();


    }




}
