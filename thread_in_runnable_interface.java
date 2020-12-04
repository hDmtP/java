class myrunnableThread1 implements Runnable{
    public void run(){
        for (int i = 0; i < 69; i++) {
            System.out.println(1);
        }
    }
}
class myrunnableThread2 implements Runnable{
    public void run(){
        for (int i = 0; i < 69; i++) {
            System.out.println(2);
        }
    }
}

public class thread_in_runnable_interface {
    public static void main(String[] args) {
        myrunnableThread1 bullet1 = new myrunnableThread1();
        myrunnableThread2 bullet2 = new myrunnableThread2();

        Thread gun1 = new Thread(bullet1);
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();
    }
}
