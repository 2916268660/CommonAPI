package Inner_class.demo03;

/*
匿名内部类：
    如果接口的实现类（或者父类的子类）只用到唯一的一次时
    那么就可以剩下该类的定义，使用【匿名内部类】
    使用方法
        接口 对象名 = new 接口(){.....};

    注意事项：
        匿名内部类在创建对象
 */
public class Test {
    public static void main(String[] args) {
        Myinterface obj = new Myinterface(){
            @Override
            public void method() {
                System.out.println("使用内部抽象类覆盖重写了接口的抽象方法1");
            }
            @Override
            public void m() {
                System.out.println("AAAA");
            }
        };
        obj.method();
        obj.m();
        //匿名内部类使用匿名对象直接调用方法
        new Myinterface(){
            @Override
            public void method() {
                System.out.println("使用内部抽象类覆盖重写了接口的抽象方法2");
            }
            @Override
            public void m() {
                System.out.println("BBBB");
            }
        }.method();
    }
}
