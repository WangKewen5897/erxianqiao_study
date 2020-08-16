package com.wkw.GameOf24;

import java.util.Scanner;

public class GameOf24 {
//    StringBuilder str1 = new StringBuilder("YES\n"+"2*4=8\n"+"3*8=24\n"+"1*24=24\n"); //str1追加固定部分的公式
//    StringBuilder str2 = new StringBuilder("YES\n"+"5-2=3\n"+"1+3=4\n"+"4+4=8\n"+"3*8=24\n");
//    private void operate(int n){
//
//    }
    public static void main(String[] args) {
        StringBuilder str1 = new StringBuilder("YES\n"+"2 * 4 = 8\n"+"3 * 8 = 24\n"+"1 * 24 = 24\n"); //str1追加固定部分的公式
        StringBuilder str2 = new StringBuilder("YES\n"+"5 - 2 = 3\n"+"1 + 3 = 4\n"+"4 + 4 = 8\n"+"3 * 8 = 24\n");
//            System.out.println("请输入n的数值：");
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
        if(n%2==0){
            if(n>=4&&n<=100000){
                while(n>4){
                    String s = n+" - "+(n-1)+" = 1\n";
                    str1.append(s);
                    str1.append("1 * 24 = 24\n");
                    n-=2;
                }
                System.out.println(str1);
            } else {
                System.out.println("NO");
            }
        }else if(n%2==1){
            if(n>=5&&n<=100000){
                while(n>5){
                    String s1 = n+" - "+(n-1)+" = 1\n";
                    str2.append(s1);
                    str2.append("1 * 24 = 24\n");
                    n-=2;
                }
                System.out.println(str2);
            }else {
                System.out.println("NO");
            }
        }else {
            System.out.println("NO");
        }
//            GameOf24 op = new GameOf24();
//            op.operate(n);
        }
}
