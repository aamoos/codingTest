package com.codingTest.exam0107;

import java.util.Scanner;

/**
 * packageName    : com.codingTest.exam0107
 * fileName       : Main
 * author         : 김재성
 * date           : 2023-06-18
 * description    : StringBuilder
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-18        김재성       최초 생성
 */
public class Main2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println(solution(str));
    }

    public static String solution(String str){
        String answer = "NO";
        String tmp = new StringBuilder(str).reverse().toString();

        //대소문자 구분없이 비교
        if(str.equalsIgnoreCase(tmp)){
            answer = "YES";
        }
        return answer;
    }
}
