package Inner_class.demo01;
/*
成员内部类:
    成员内部类可以无条件访问外部类的成员方法和成员变量
    当内部类与外部类的成员变量和方法重名时会发生隐藏现象，
    即默认情况下访问的是成员内部类的成员。
    如果要访问外部类的同名成员，需要以下面的形式进行访问：
        外部类.this.成员变量
        外部类.this.成员方法
     外部类要访问内部类需要在外部类创建内部类的对象再调用内部类的成员变量和方法
 */
public class Outer {
    private int num = 10;

    public void Outermethod(){
        Inner inner = new Inner();
        inner.Innermethod1();
        System.out.println("外部类方法"+num);
    }
    class Inner{
        int num = 20;
        public void Innermethod(){
            Outermethod();
            System.out.println("内部类方法"+num);
            System.out.println("当成员变量和方法重名时，外部类的变量num："+Outer.this.num);
        }
        public void Innermethod1(){
            System.out.println("hhhhh");
        }
    }
}
