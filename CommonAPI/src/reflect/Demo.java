package reflect;

import java.lang.reflect.Field;

/*

 */
public class Demo {
    public static void main(String[] args) throws Exception {
        Class cls = Class.forName("reflect.Person");
        Field[] fields = cls.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        Field a = cls.getDeclaredField("a");
        Person p = new Person();
        a.setAccessible(true);
        a.set(p,"hhh");
        Object o = a.get(p);
        System.out.println(o);

    }
}
