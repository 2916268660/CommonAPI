package thread;
/*
使用Thread类创建线程：
    继承Thread类，让子类重写run()方法，然后在测试类中创建实例对象并调用start();

 */
public class MyThread extends Thread{

    @Override
    public void run() {
        for(int i=0; i<10; i++){
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                return;
            }
            System.out.println(Thread.currentThread().getName()+"--->"+i);
        }
    }
}
