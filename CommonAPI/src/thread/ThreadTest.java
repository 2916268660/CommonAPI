package thread;

public class ThreadTest {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.start();
        for(int i=0; i<10; i++){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
                return;
            }
            System.out.println(Thread.currentThread().getName()+"--->"+i);
        }
    }
}
