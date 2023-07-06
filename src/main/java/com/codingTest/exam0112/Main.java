package com.codingTest.exam0112;

import java.util.Scanner;

/**
 * packageName    : com.codingTest.exam0112
 * fileName       : Main
 * author         : 김재성
 * date           : 2023-06-22
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-22        김재성       최초 생성
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String str = scan.next();
        System.out.println(solution(n, str));
    }

    public static String solution(int n, String s){
        String answer = "";

        for(int i=0; i<n; i++){
            String tmp = s.substring(0, 7).replace('#', '1').replace('*', '0');
            int num = Integer.parseInt(tmp, 2);
            answer+= (char) num;
            s=s.substring(7);
        }

        return answer;
    }
}
