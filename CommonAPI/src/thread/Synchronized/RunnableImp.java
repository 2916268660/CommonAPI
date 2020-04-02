package thread.Synchronized;

public class RunnableImp implements Runnable{
    private int ticket = 100;
    Object obj = new Object();

    @Override
    public void run()
    {
        synchronized(obj)                 //使用synchronized关键字 同步代码块synchronized(对象锁){.....}
        {
            while(true)
            {
                if(ticket>0)
                {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+"--->第"+ticket+"张票");
                    ticket--;
                }
            }
        }
    }
//    public void sell()
//    {
//
//    }
}
