package StringClassAPI;

/*
字符串转化的方法
public char[] toCharArray();   将字符串转化为新的字符数组；
public byte[] getBytes();     将字符串转化为字节数组
public String replace(CharSequence target, CharSequence replacement);  使用指定的字面值替换所有目标字符串中的字符
*/
public class Convert {
    public static void main(String[] args) {
        String str1 = "abc";
        char[] chars = str1.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);      //  a  b  c
        }
        System.out.println("-----------");
        byte[] bytes = str1.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);               // 97  98  99
        }
        System.out.println("-----------");

        String str2 = "你会不会玩？ 你大爷的！";
        String str3 = str2.replace("大爷","**");
        System.out.println(str3);     //你会不会玩？ 你**的！
    }


}
