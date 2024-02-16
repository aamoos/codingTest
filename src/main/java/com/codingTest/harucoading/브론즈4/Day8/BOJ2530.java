package com.codingTest.harucoading.브론즈4.Day8;

import java.util.Scanner;

public class BOJ2530 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int h = scan.nextInt();
        int m = scan.nextInt();
        int s = scan.nextInt();
        int time = scan.nextInt();

        //초 => 분 => 시 이런 순으로 계산
        // 나눗셈 / 연산 => 몫    % 연산 => 나머지를 나타낸다.

        s += time;
        if(s>59){
            m+=s/60;
            s=s%60;
        }

        if(m>59){
            h+=m/60;
            m=m%60;
        }

        if(h>23){
            h=h%24;
        }
        System.out.println(h+" "+m+" "+s);
    }
}