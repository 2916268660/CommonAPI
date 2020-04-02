package thread.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo01 {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(2);
        MyRunnableImp mri = new MyRunnableImp();

        es.submit(new Thread(mri));
        es.submit(new Thread(mri));
        es.submit(new Thread(mri));
    }
}
