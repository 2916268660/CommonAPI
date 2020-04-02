package Extends;

public class Zi extends Fu{

    int num = 10;

    public Zi(){
        System.out.println("子类构造方法");
    }

    public void method(){
        int num = 30;
        int i = super.num;
        System.out.println("子类方法执行");
        System.out.println(num);     //30
        System.out.println(this.num);  //10
        System.out.println(i);  //20
    }

}
