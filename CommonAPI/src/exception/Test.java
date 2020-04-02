package exception;


import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        String [] a = {"张三","李四","王五"};
        System.out.println("请输入要注册的用户名：");
        Scanner sc = new Scanner(System.in);
        String l = sc.nextLine();
        for(String s:a){
            try{
                if(s.equals(l)){
                    throw new CustomizeException("该用户名已被注册");
                }
            }catch (CustomizeException e){
                e.printStackTrace();
                return;                //报错后直接结束程序
            }
        }
        System.out.println("注册成功");
    }
}
