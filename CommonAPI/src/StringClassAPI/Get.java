package StringClassAPI;

/*
字符串的获取方法
public int length();   获取当前字符串种字符的个数，拿到字符串的长度
public String concat(String str);  将当前字符串和参数的字符串拼接起来并返回一个新的字符串
public char charAt(int index);   获取参数索引位置的字符并返回该位置的字符
public int indexOf(String str);   获取参数字符串在当前字符串的首次出现的索引位置，如果没有则返回-1
 */
public class Get {
    public static void main(String[] args) {
        String str1 = "abcdbc";
        System.out.println(str1.length());   //6

        String str2 = str1.concat("哈哈哈");
        System.out.println(str2);    //abcdbc哈哈哈

        char s = str1.charAt(2);
        System.out.println(s);        //c

        System.out.println(str1.indexOf("bc"));  //1
        System.out.println(str1.indexOf("dc"));  //-1
    }
}
