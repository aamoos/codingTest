package com.codingTest.알고리즘복습.step15;

import java.util.Scanner;

/**
 * packageName    : com.codingTest.알고리즘복습.step15
 * fileName       : P3
 * author         : 김재성
 * date           : 2023-10-16
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-10-16        김재성       최초 생성
 */
public class P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a1 = sc.nextInt();  //분자1
        int b1 = sc.nextInt();  //분모1

        int a2 = sc.nextInt();  //분자2
        int b2 = sc.nextInt();  //분모2

        sc.close();

        int a3 = a1 * b2 + b1 * a2;
        int b3 = b1 * b2;

        int gcd = getGCD(a3, b3);

        System.out.println(a3 / gcd + " " + b3 / gcd);
    }

    public static int getGCD(int n, int m){
        if(n % m == 0){
            return m;
        }else{
            return getGCD(m, n % m);
        }
    }
}