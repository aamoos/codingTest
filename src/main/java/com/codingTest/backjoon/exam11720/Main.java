package com.codingTest.backjoon.exam11720;

import java.util.Scanner;

/**
 * packageName    : com.codingTest.backjoon.exam11720
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
        String sNum = sc.next();
        char[] cNum = sNum.toCharArray();
        int sum = 0;
        for(int i=0; i<cNum.length; i++){
            sum+=cNum[i] - '0';
        }
        System.out.println(sum);
    }

}
