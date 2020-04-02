package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*

 */
public class Test {
    public static void main(String[] args) {
        Collection<String> colls = new ArrayList<>();
        colls.add("哈哈哈");
        colls.add("嘿嘿嘿");
        colls.add("哦哦哦");
        colls.add("嗯嗯嗯");
        colls.add("啦啦啦");
        Iterator<String> iterator = colls.iterator();
        while (iterator.hasNext()){
            String s = iterator.next();
            System.out.println(s);
        }
    }


}
