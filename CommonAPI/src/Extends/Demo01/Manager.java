package Extends.Demo01;

import java.util.ArrayList;
import java.util.Random;

/*
群主发红包
    需要把红包随机分成若干份然后存入数组集合，然后返回数组集合。
 */
public class Manager extends User {
    public Manager(){

    }

    public Manager(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send(int singleMoney, int num){
        ArrayList<Integer> moneys = new ArrayList<>();
        int totalMoney = singleMoney*num;

        if(super.getMoney()<totalMoney){
            System.out.println("余额不足，请注意及时充值");
            return moneys;
        }
        for (int i = 0; i < num; i++) {
            moneys.add(singleMoney);
        }

        super.setMoney(super.getMoney()-totalMoney);   //当前群主发过红包剩下的余额
        return moneys;
    }
}
