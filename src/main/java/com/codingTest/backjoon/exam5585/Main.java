package com.codingTest.backjoon.exam5585;

import java.util.Scanner;

/**
 * packageName    : com.codingTest.backjoon.exam5585
 * fileName       : Main
 * author         : 김재성
 * date           : 2023-06-26
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-26        김재성       최초 생성
 */
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        n = 1000-n;
        int answer = 0;

        if(n/500 != 0){
            answer+=n/500;
            n=n%500;
        }

        if(n/100 != 0){
            answer+=n/100;
            n=n%100;
        }

        if(n/50 != 0){
            answer+=n/50;
            n=n%50;
        }

        if(n/10 != 0){
            answer+=n/10;
            n=n%10;
        }

        if(n/5 != 0){
            answer+=n/5;
            n=n%5;
        }

        if(n/1 != 0){
            answer+=n/1;
            n=n%1;
        }
        System.out.println(answer);
    }
}
