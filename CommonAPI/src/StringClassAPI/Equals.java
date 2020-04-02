package StringClassAPI;

/*
字符串比较
public boolean equals(Object obj);   参数可以是任何参数，只有参数是一个字符串并且字符串内容相同才会返回true，
                                      否则返回false
public boolean equalsInogreCase(String str);   比较字符串内容是否相同，忽略大小写
对于引用类型来说，equals 只比较的是字符串的内容，而 == 比较的是地址值
备注：
    任何对象都能可以用Object接受
 */
public class Equals {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";
        String str3 = new String("abc");
        String str4 = "Abc";
        System.out.println(str1.equals(str2));     //true
        System.out.println(str1.equals(str3));     //true
        System.out.println(str2.equals(str3));     //true

        System.out.println(str1.equalsIgnoreCase(str4));  //true

        System.out.println(str1==str2);             //true
        System.out.println(str1==str3);             //false
        System.out.println(str2==str3);             //false
    }
}
