package arrays;

import java.util.Arrays;
/*
java.util.Arrays  接口提供了大量的静态方法，用来实现数组的常见操作
public static String toString(数组);   将参数数组转化为字符串
public static void sort(数组);   将参数数组按照默认的顺序(升序，从小到大)进行排序
备注：
    如果是数值，sort默认进行升序排序
    如果是字符，sort默认按照字母顺序排序
    如果是自定义类型，需要指定类实现compareble接口或有compareble
 */
public class ArraysMethod {
    public static void main(String[] args) {
        int[] arr = {50,20,30};
        String str1 = Arrays.toString(arr);
        System.out.println(str1);           //[50, 20, 30]
        System.out.println("----------");
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));      //[20, 30, 50]
    }
}
