package InterfaceQuestion;

interface Father{
    void father();
}
interface Mother{
    void mother();
}

class Child implements Father, Mother{
    public void father(){
        System.out.println("Father features.");
    }
    public void mother(){
        System.out.println("Mother features.");
    }
}
public class Parents{
    public static void main(String[] args){
        Child c = new Child();
        c.mother();
        c.father();
    }
}
