package thread.Synchronized;

public class Test {
    public static void main(String[] args) {
        RunnableImp run = new RunnableImp();
        new Thread(run,"线程1").start();
        new Thread(run,"线程2").start();
        new Thread(run,"线程3").start();
    }
}
