package thread.waitAndnotify;

public class ChiBaoZi extends Thread {
    private Baozi bz;
    public ChiBaoZi(Baozi bz){
        this.bz = bz;
    }
    @Override
    public void run() {
        synchronized (bz){
            //先做一个判断包子的状态是否有
            if(bz.state == false){
                try {
                    bz.wait(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("包子做好了，开始吃"+bz.pi+bz.xian+"包子");
        }
    }
}
