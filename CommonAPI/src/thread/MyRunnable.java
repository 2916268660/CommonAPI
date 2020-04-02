package thread;

/*
使用Runnable接口创建线程：
    实现Runnable接口，重写接口中的run()方法，然后创建Thread对象时把Runnable实现类的对象传进去然后调用start()方法
    Thread(Runnable target) 分配新的 Thread 对象。
 */
import static java.lang.Thread.sleep;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for(int i=0; i<10; i++){
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
                return;
            }
            System.out.println(Thread.currentThread().getName()+"--->"+i);
        }
    }
}
