package com.codingTest.backjoon.exam27866;

import java.util.Scanner;

/**
 * packageName    : com.codingTest.backjoon.exam25083
 * fileName       : Main
 * author         : 김재성
 * date           : 2023-06-16
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-16        김재성       최초 생성
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        int b = scan.nextInt();
        System.out.print(solution(a, b));
    }

    public static char solution(String a, int b){
        char answer;

        answer = a.charAt(b-1);

        return answer;
    }
}
