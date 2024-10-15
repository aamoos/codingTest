package com.codingTest.harucoading.브론즈2.Day5;

import java.util.Scanner;

public class BOJ1978 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int count = 0;

        for(int i=0; i<N; i++){
            int temp = scan.nextInt();
            boolean isTrue = true;

            if(temp == 1){
                isTrue = false;
            }else{
                // 1보다 크고 약수가 나 외에 없는 수가 소수다
                for(int j=2; j<=Math.sqrt(temp); j++){
                    if(temp%j == 0){
                        isTrue = false;
                        break;
                    }
                }
            }
            if(isTrue){
                count++;
            }
        }
        System.out.println(count);
    }
}
