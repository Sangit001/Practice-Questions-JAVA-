package Constructor;

public class CopyConstructor {

    static class Employee {
        String name;
        int age;
        Employee(String name, int age){
            this.name = name;
            this.age = age;
        }
        Employee(Employee obj2){
         this.name = obj2.name;
         this.age = obj2.age;
        }
    }


    static void main(String[] args) {
//      Original constructor
        Employee e1 = new Employee("sangit",21);
        System.out.println("name: "+ e1.name +" age: "+ e1.age);
//      Copy constructor
        Employee e2 = new Employee(e1);
        System.out.println("name: "+ e2.name +" age: "+ e2.age);
    }
}
