package com.codingTest.exam0108;

import java.util.Scanner;

/**
 * packageName    : com.codingTest.exam0108
 * fileName       : Main
 * author         : 김재성
 * date           : 2023-06-18
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-18        김재성       최초 생성
 */
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println(solution(str));
    }

    public static String solution(String s){
        String answer = "NO";
        s = s.toUpperCase().replaceAll("[^A-Z]", "");
        String tmp = new StringBuilder(s).reverse().toString();

        if(s.equals(tmp)){
            answer = "YES";
        }

        return answer;
    }
}
