package OOPS;

import Constructor.Student;

public class Q1 {

    static class StudentDetail{

    private String name;
    private int id;
        public StudentDetail(String name){
            this.name = name;
        }
       public StudentDetail(String name, int id){
            this.name = name;
            this.id = id;
        }
    void display(){
            if(name != null){
                System.out.println("Name: "+name);
            }
            if(id != 0){
                System.out.println("Id: "+id);
            }
    }
    }

    public static void main(String[] args){
        StudentDetail s1 = new StudentDetail("sangit");
        StudentDetail s2 = new StudentDetail("sangit", 01);

        s1.display();
        s2.display();
    }

}
