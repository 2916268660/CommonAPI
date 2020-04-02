package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
遍历Map集合两种方法；
    1、使用Map类中的keySet()方法，该方法是让所有key值存入一个set集合，然后可以通过key查出并遍历出所对应的value值
    2、使用Entry接口，该接口将本Map集合里所有键值对封装成对象，即键值对对象，然后将这些对象存入Set集合，遍历Set集合即可
 */
public class HashaMap {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("hhh","hh");
        map.put("www","ww");
        map.put("aaa","aa");
        map.put("qqq","qq");
        Set<String> keys = map.keySet();
        for (String key:keys) {
            String s = map.get(key);
            System.out.println(key+":"+s);
        }
        System.out.println("--------");
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> maps:entries){
            String key = maps.getKey();
            String value = maps.getValue();
            System.out.println(key+":"+value);
        }
    }
}
