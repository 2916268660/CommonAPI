package collection;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/*
计算一个字符串中字符的次数
 */
public class HashMapTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        HashMap<Character,Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            if(map.containsKey(c)){
                Integer value = map.get(c);
                value++;
                map.put(c,value);
            }else {
                map.put(c,1);
            }
        }
        Set<Character> set = map.keySet();
        for (Character key :set) {
            Integer value = map.get(key);
            System.out.println(key+":"+value);
        }

    }
}
