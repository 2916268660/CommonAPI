package StringClassAPI;

/*
字符串分割的方法
public String[] split(String regex);   按照参数的规则，将字符串分割为若干部分
 */
public class Split {
    public static void main(String[] args) {
        String str1 = "aaa,bbb,ccc";
        String[] str2 = str1.split(",");
        for (int i = 0; i < str2.length; i++) {
            System.out.println(str2[i]);
        }
        System.out.println("-----------");
        //要注意分割英文  .  的时候会涉及到正则表达式
        String str3 = "xxx.yy.z";
        String[] str4 = str3.split("\\.");      //String[] str4 = str3.split("."); 这样会分割失败
        for (int i = 0; i < str4.length; i++) {
            System.out.println(str4[i]);
        }
    }
}
