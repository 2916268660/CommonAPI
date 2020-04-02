package StringClassAPI;

public class Test {
    public static void main(String[] args) {
        String st1 = "abc";
        String str2 = new String("bcd");
        str2 = str2.intern();
        String str3 = "bcd";
        System.out.println(str2==str3);
    }

}
