package com.codingTest.harucoading.브론즈1.Day7;

import java.util.Scanner;

public class BOJ11005 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int B = scan.nextInt();

        if(N < B){
            if(N > 9){
                System.out.println( (char) (N+55) );
            }else{
                System.out.println(N);
            }
        }else{
            int cnt = 0;
            double temp = B;
            while(N >= temp){
                temp = Math.pow(B, ++cnt);
            }// B진법으로 표현하였을때 몇자리수로 표현되는지 계산하기

            cnt--;
            while(cnt > 0){
                temp = Math.pow(B, --cnt);
                int now = (int)(N%temp);
                if(N>9){
                    System.out.print((char)(now+55));
                }else{
                    System.out.print(now);
                }
            }
        }
    }
}
