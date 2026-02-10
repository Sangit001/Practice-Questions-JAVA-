package OOPS;
import java.util.Scanner;



abstract class Car{
    int a = 20;
    abstract void Color();
    abstract void Model();
}

class Detail extends Car{

    void Color(){
        System.out.println("color is red");
    }
    void Model(){
        System.out.println("Model is BMW");
    }
}

class Q2{
    public static void main(String[] args){

        Car car = new Detail();
        car.Color();
        car.Model();

    }
}


