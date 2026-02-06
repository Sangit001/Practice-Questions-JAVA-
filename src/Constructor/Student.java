package Constructor;

public class Student {
    String name;
    int roll;

    // Creating Constructor

    Student(String _name, int _roll){
        this.name = _name;
        this.roll = _roll;
    }

//    Displaying
    void display(){
        System.out.println("Name: "+name+" Roll: "+roll);
    }

    static void main(String[] args) {
        Student s1 = new Student("Sangit", 101);
        Student s2 = new Student("Hari", 102);
        s1.display();
        s2.display();


    }
}
