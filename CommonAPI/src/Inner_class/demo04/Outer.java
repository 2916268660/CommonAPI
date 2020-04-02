package Inner_class.demo04;
/*
静态内部类：
    在内部类中加入static关键字，静态内部类是不需要依赖于外部类的，
    这点和类的静态成员属性有点类似，并且它不能使用外部类的非static成员变量或者方法
 */
public class Outer {
    public static void main(String[] args) {
        Inner inner = new Inner();
        inner.Innermethod();
    }
    static class Inner{
        public void Innermethod(){
            System.out.println("内部类方法");
        }
    }
}
