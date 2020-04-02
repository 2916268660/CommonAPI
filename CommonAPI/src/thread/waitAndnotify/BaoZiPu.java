package thread.waitAndnotify;

public class BaoZiPu extends Thread {
    private Baozi bz;
    public BaoZiPu(Baozi bz){
        this.bz = bz;
    }
    @Override
    public void run() {
        synchronized(bz){
            if(bz.state == true){
                System.out.println("有包子，让顾客吃");
            }else{
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                bz.pi = "面皮";
                bz.xian = "羊肉大葱";
                bz.state = true;
                System.out.println(bz.pi+bz.xian+"包子已经做好");
                bz.notify();
            }
        }
    }
}
