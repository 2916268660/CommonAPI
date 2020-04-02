package Inner_class.demo02;

/*
局部内部类
    局部内部类是定义在一个方法或一个作用域中的类，
    它与成员内部类的区别就在于局部内部类的访问权限仅限于该方法内或该作用域中
  使用局部内部类的方法
    由于局部内部类的访问权限仅限于该方法内或该作用域中，
    所以只能在该方法中创建局部内部类的对象以及调用局部内部类的方法
 */

public class Outer {
    int num = 10;
    public void Outermethod(){
         class Inner{
            public void Innermethod(){
                System.out.println(num);   //10
            }
        }
        Inner inner = new Inner();
         inner.Innermethod();
    }


}
