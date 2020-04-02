package Abstract;

/*
抽象方法: 在public后加上abstract关键字 去掉大括号，没有方法的具体实现
抽象类: 在类上加abstract关键字
        抽象方法所在的类一定是抽象类，抽象类里面的方法不一定是抽象方法
 */
public abstract class Demo01 {
    public abstract void method();

    public void hh(){
        System.out.println("hhh");
    }
}
