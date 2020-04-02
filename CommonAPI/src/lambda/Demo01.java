package lambda;

import java.util.Arrays;
import java.util.Comparator;

public class Demo01 {
    public static void main(String[] args) {
        Person []arr = {
                new Person("qqq",18),
                new Person("sss",25),
                new Person("www",10)
        };
        /*Arrays.sort(arr, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge()-o2.getAge();
            }
        });*/
        //使用lambda表达式简化匿名内部类
        Arrays.sort(arr, ( o1, o2)-> o1.getAge()-o2.getAge());
        for(Person list:arr){
            System.out.println(list);
        }
    }
}
