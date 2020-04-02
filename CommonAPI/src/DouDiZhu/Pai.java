package DouDiZhu;

import org.junit.Test;

import java.util.*;

/*
斗地主案例：
    分析：
        特殊牌：大小王4
        花色：♠，♥，♦，♣
        牌：2,A,K.....3

 */
public class Pai {
    /*
        将牌和花色保存到两个集合中,并且随机组合存到不可重复的另一个集合中
     */
    @Test
    public  List<String> preserve(){
        List<String> huaSe = new ArrayList<>();   //花色的集合
        List<String> value = new ArrayList<>();   //牌面数值的集合
        List<String> poker = new ArrayList<>();   //扑克的集合
        //将花色保存到集合
        Collections.addAll(huaSe,"♠","♥","♦","♣");
        //将牌面数值保存到集合
        Collections.addAll(value,"2","A","K","Q","J","10","9","8","7","6","5","4","3");
        //将两个集合组合并存入扑克牌面
        for (int i = 0; i < huaSe.size(); i++) {
            for (int j = 0; j < value.size(); j++) {
                String s = "["+huaSe.get(i)+value.get(j)+"]";
                poker.add(s);
            }
        }
        poker.add("[大王]");
        poker.add("[小王]");
        return poker;
    }
    /*
    洗牌，将poker集合中的值打乱，使用collections工具类中的
    static void shuffle(List<?> list)
          使用默认随机源对指定列表进行置换。
     */
    @Test
    public List<String> xiPai(List<String> poker){
//        preserve();
        Collections.shuffle(poker);
        return poker;
    }
    /*
    发牌,一人17张牌，底牌三张牌，索引从0开始到53
    53%3 有三个值  0 1 2
    定义四个集合 每个人一个集合 底牌一个集合
    当索引值>50时 开始存入底牌集合
     */
    @Test
    public void faPai(List<String> poker){
        List<String> person1 = new ArrayList<>();
        List<String> person2 = new ArrayList<>();
        List<String> person3 = new ArrayList<>();
        List<String> diPai = new ArrayList<>();
        Random random = new Random();
        String s = poker.get(random.nextInt(poker.size()));
        for (int i = 0; i < 54; i++) {
            if(i%3==0&&i<51){
                person1.add(poker.get(i));
            }else if (i%3==1&&i<51){
                person2.add(poker.get(i));
            }else if (i%3==2&&i<51){
                person3.add(poker.get(i));
            }else if (i>50){
                diPai.add(poker.get(i));
            }
        }
        System.out.println("玩家1："+person1);
        System.out.println("玩家2："+person2);
        System.out.println("玩家3："+person3);
        System.out.println("底牌："+diPai);
    }

}


