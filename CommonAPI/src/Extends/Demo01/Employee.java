package Extends.Demo01;

import java.util.ArrayList;
import java.util.Random;

public class Employee extends User {
    public Employee() {
    }

    public Employee(String name, int money) {
        super(name, money);
    }
    public void accept(ArrayList<Integer> moneys ){
        int index = new Random().nextInt(moneys.size());
        int getmoney = moneys.remove(index);
        super.setMoney(getmoney+super.getMoney());

    }
}
