package StaticKeyWords;

/*
静态代码块特点
第一次使用到该类时，静态代码块执行唯一的一次

使用静态成员方法/变量时 推荐使用  类.静态变量;    类.静态方法();
 */
public class StaticKeywords {
    public static void main(String[] args) {
        Person one = new Person();
        System.out.println("---------");
        Person two = new Person();
    }
}
