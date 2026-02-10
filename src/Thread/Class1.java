package Thread;
class myThread extends Thread{
    public void show(){
        for(int i =0; i<5; i++){
            System.out.println("Hello running");

            try{
                Thread.sleep(1000);
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
 class Class1 {
   public static void main(String[] args) {
        myThread t1 = new myThread();
        t1.show();
    }
}
