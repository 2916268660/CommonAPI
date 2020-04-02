package Inner_class.demo01;

/*
获取成员内部类对象的方法
    通过外部类的对象创建
    公式:
        外部类.内部类 内部类对象 = new 外部类().new 内部类();
 */
public class Test {
    public static void main(String[] args) {
        //Outer.Inner inner = new Outer().new Inner();   分开写如下
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.Innermethod();
    }
}
