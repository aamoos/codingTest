package com.codingTest.harucoading.브론즈2.Day16;

import java.util.Scanner;

public class BOJ1977 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int M = scan.nextInt();
        int N = scan.nextInt();
        int sum = 0;
        int min = -1;
        boolean find_min = false;

        for(int i=1; i*i<=N; i++){
            int temp = i*i;
            if(temp >= M){      //문제에 조건에 맞는 완전제곱수
                if(!find_min){
                    min = temp;
                    find_min = true;
                }
                sum += temp;
            }
        }

        if(min == -1){
            System.out.println(min);
        }else{
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
