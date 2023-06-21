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
public class Main2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println(solution(str));
    }

    public static int solution(String s){
        String answer = "";

        for (char x : s.toCharArray()) {
            //숫자냐?
            if(Character.isDigit(x)){
                answer+=x;
            }
        }
        return Integer.parseInt(answer);
    }
}
