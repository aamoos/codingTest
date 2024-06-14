package com.codingTest.book;

import java.util.Scanner;

public class P1546_평균구하기 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] A = new int[N];

        long sum = 0;
        long max = 0;

        for(int i=0; i<N; i++){
            int temp = scan.nextInt();

            if(temp > max){
               max = temp;
            }
            sum = sum + temp;
        }

        System.out.println(sum*100.0/max/N);
    }
}
