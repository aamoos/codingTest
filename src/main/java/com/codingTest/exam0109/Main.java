package com.codingTest.exam0109;

import java.util.Scanner;

/**
 * packageName    : com.codingTest.exam0109
 * fileName       : Main
 * author         : 김재성
 * date           : 2023-06-19
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-19        김재성       최초 생성
 */
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println(solution(str));
    }

    public static int solution(String s){
        int answer = 0;

        for (char x : s.toCharArray()) {
            if(x>=48 && x<=57){
                answer = answer*10+(x-48);
            }
        }
        return answer;
    }
}
