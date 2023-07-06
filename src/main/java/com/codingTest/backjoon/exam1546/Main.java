package com.codingTest.backjoon.exam1546;

import java.util.Scanner;

/**
 * packageName    : com.codingTest.backjoon.exam1546
 * fileName       : Main
 * author         : 김재성
 * date           : 2023-07-02
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-07-02        김재성       최초 생성
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        long sum = 0;
        long max = 0;
        for(int i=0; i<N; i++){
            int temp = sc.nextInt();
            if(temp>max){
                max = temp;
            }
            sum = sum + temp;
        }
        System.out.println(sum*100.0/max/N);
    }
}
