package thread.ThreadPool;

public class MyRunnableImp implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"新建线程");
    }
}
