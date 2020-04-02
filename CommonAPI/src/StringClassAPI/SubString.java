package StringClassAPI;


/*
字符串的截取方法
public String substring(int index);  截取从参数索引的位置一直到字符串的尾部的部分，并返回新的字符串
public String substring(int begin,int end);  截取从begin索引的位置一直到end索引的位置的部分，并且返回新的字符串
备注；
    [begin.end)  左闭右开
 */
public class SubString {
    public static void main(String[] args) {
        String str1 = "abcdefg";
        String str2 = str1.substring(2);
        System.out.println(str2);    //cdefg
        String str3 = str1.substring(2,4);
        System.out.println(str3);   //cd
    }
}
