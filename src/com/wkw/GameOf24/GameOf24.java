package com.wkw.GameOf24;

import java.util.Scanner;

public class GameOf24 {
    private void operate(int n){
        if(n<1||n>100000){
            System.out.print("数值越界");
        }
        if(n<4){
            System.out.println("NO");
        }else if(n%2==0){
            System.out.println("YES");
            System.out.println("2*4=8");
            System.out.println("3*8=24");
            System.out.println("1*24=24");
            while(n>4){
                System.out.println(n+"-"+(n-1)+"=1");
                System.out.println("1*24=24");
                n-=2;
            }
        }else if(n%2==1){
            System.out.println("YES");
            System.out.println("5-2=1");
            System.out.println("1+3=4");
            System.out.println("4+4=8");
            System.out.println("8*3=24");
            while(n>5){
                System.out.println(n+"-"+(n-1)+"=1");
                System.out.println("1*24=24");
                n-=2;
            }
        }
    }
    public static void main(String[] args) {
            System.out.println("请输入n的数值：");
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            GameOf24 op = new GameOf24();
            op.operate(n);
        }


}
