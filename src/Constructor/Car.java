package Constructor;

public class Car {
    String brand;
    int price;

    void display(){
        System.out.println("Price: "+ price+" Brand: "+brand);
    }
    static void main(String[] args) {
    Car c1 = new Car();
    c1.display();

    }
}
