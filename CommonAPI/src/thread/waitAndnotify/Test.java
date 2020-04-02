package thread.waitAndnotify;

public class Test {
    public static void main(String[] args) {
        Baozi bz = new Baozi();
        new BaoZiPu(bz).start();
        new ChiBaoZi(bz).start();
    }
}
