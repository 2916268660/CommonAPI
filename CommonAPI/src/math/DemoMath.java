package math;

/*
java.lang.Math 提供的数学工具方法，大部分都是静态方法
public static double abs(double num);   获取绝对值
public static double ceil(double num);   向上取整
public static double floor(double num);   向下取整
public static long round(double num);   四舍五入
 */
public class DemoMath {
    public static void main(String[] args) {
        //获取绝对值
        System.out.println(Math.abs(3.14));  //3.14
        System.out.println(Math.abs(-1));    //1
        System.out.println(Math.abs(0));    //0
        System.out.println("-------------");
        //向上取整
        System.out.println(Math.ceil(3.9));  //4.0
        System.out.println(Math.ceil(3.001)); //4.0
        System.out.println(Math.ceil(3.00));  //3.0
        System.out.println("-------------");
        //向下取整
        System.out.println(Math.floor(3.9)); //3.0
        System.out.println("-------------");
        //四舍五入
        System.out.println(Math.round(3.14));  //3
        System.out.println(Math.round(3.5));   //4
    }
}
