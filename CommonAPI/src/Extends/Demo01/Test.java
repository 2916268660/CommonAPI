package Extends.Demo01;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Manager manager = new Manager("老板",100);

        Employee one = new Employee("张三",0);
        Employee two = new Employee("李四",0);
        Employee three = new Employee("王五",0);

        manager.show();
        one.show();
        two.show();
        three.show();
        System.out.println("------------------");

        ArrayList<Integer> moneys = manager.send(10, 5);
        one.accept(moneys);
        two.accept(moneys);
        three.accept(moneys);

        manager.show();
        one.show();
        two.show();
        three.show();
    }
}
