package Constructor;
    class Students{
        String name;
        int roll;


        Students(){
        name = "unknown";
        }
        Students(String name){
            this.name = name;
        }
        Students(String name, int roll){
            this.name = name;
            this.roll = roll;
        }

        void display(){
            System.out.println("name: "+name+" roll: "+roll);
        }
    }
public class ConstructorOverloading {

    static void main() {
//        Passing the value

        Students s1 = new Students();
        Students s2 = new Students("sangit");
        Students s3 = new Students("sangit",21);

//        Display
        s1.display();
        s2.display();
        s3.display();
    }





}
