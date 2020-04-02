package thread;

public class RunnableTest {
    public static void main(String[] args) {
        MyRunnable mr = new MyRunnable();
        new Thread(mr).start();
    }
}
