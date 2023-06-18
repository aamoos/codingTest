package com.codingTest.exam0107;

import java.util.Scanner;

/**
 * packageName    : com.codingTest.exam0107
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
        String str = scan.next();
        System.out.println(solution(str));
    }

    public static String solution(String str){
        String answer = "YES";
        str = str.toUpperCase();
        int len = str.length();

        for(int i=0; i<len/2; i++){
            if(str.charAt(i) != str.charAt(len-i-1)){
                return "NO";
            }
        }

        return answer;
    }
}
