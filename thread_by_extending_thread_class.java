class myThread1 extends Thread{
    @Override
    public void run(){
        while(true){
            System.out.println("My thread is running");
            System.out.println("I'm heppi");
        }
    }
}
class myThread2 extends Thread{
    @Override
    public void run(){
        while(true){
            System.out.println("My thread2 is running");
            System.out.println("I'm sed");
        }
    }
}

public class thread_by_extending_thread_class {
    public static void main(String[] args) {
        myThread1 t1 = new myThread1();
        myThread2 t2 = new myThread2();

        t1.start();
        t2.start();
    }
}
