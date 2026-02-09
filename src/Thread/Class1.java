package Thread;

public class Class1 {

    static class myThread extends Thread{
        public void show(){
            for(int i =0; i<5; i++){

            System.out.println("Hello running");
            }
        }
    }

   public static void main(String[] args) {
        myThread t1 = new myThread();
        t1.show();
    }
}
