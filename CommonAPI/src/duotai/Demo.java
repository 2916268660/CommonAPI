package duotai;

/*
口诀
调用方法时：编译时看左，运行时看右
调用成员变量时：编译时看左，运行时还看左
 */
public class Demo {
    public static void main(String[] args) {
        Fu fu = new Zi();
        fu.method();   //子类方法
        System.out.println(fu.num);   //10
        fu.show();      //20
    }
}
