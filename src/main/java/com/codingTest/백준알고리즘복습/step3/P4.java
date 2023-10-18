package com.codingTest.백준알고리즘복습.step3;

import java.util.Scanner;

/**
 * packageName    : com.codingTest.알고리즘복습.step3
 * fileName       : P4
 * author         : 김재성
 * date           : 2023-10-16
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-10-16        김재성       최초 생성
 */
public class P4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt(); // 영수증에 적힌 총 금액
        int N = sc.nextInt(); // 종류의 수
        int total = 0;

        for(int i = 0; i < N; i++){
            int a = sc.nextInt(); // 각 물건의 가격
            int b = sc.nextInt(); // 각 물건의 개수
            total += a * b;
        }
        if(total == X){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}