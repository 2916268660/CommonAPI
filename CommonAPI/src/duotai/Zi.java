package duotai;

public class Zi extends Fu {
    int num = 20;
    @Override
    public void method(){
        System.out.println("子类方法");
    }
    public void show(){
        System.out.println(num);
    }
}
