package thread;

import static java.lang.Thread.sleep;

/*
匿名内部类中创建线程
 */
public class InnerClassThread{
    public static void main(String[] args) {

       /* Runnable r = new Runnable() {
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
        };
        new Thread(r).start();*/
       new Thread(()-> {
               for(int i=0; i<10; i++){
                   try {
                       sleep(100);
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                       return;
                   }
                   System.out.println(Thread.currentThread().getName()+"--->"+i);
               }
       }).start();
    }
}
