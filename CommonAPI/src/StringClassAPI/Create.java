package StringClassAPI;

/*
字符串的特点
1、字符串内容永远不会改变  【重点】
2、正因为字符串的内容永不会改变，所以字符串的内容是可以共享的
3、字符串的效果相当于char[]字符数组，但是底层原理是byte[]字节数组
 */


/*
字符串创建的3+1种方法
3种构造方法
public String ();
public String (char[] array);   根据字符数组内容，创建字符串
public String (byte[] array);   根据字节数组内容，创建字符串
1种直接创建
String str = "xx";
 */
public class Create {
    public static void main(String[] args) {
        String str1 = new String("abc");
        System.out.println(str1);          //abc
        System.out.println("-----------");

        char[] chars = {'A','B','C'};
        String str2 = new String(chars);
        System.out.println(str2);          //ABC
        System.out.println("-----------");

        byte[] bytes = {97,98,99};
        String str3 = new String(bytes);
        System.out.println(str3);          //abc

    }
}
