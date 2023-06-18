package com.codingTest.exam0104;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * packageName    : com.codingTest.exam0104
 * fileName       : Main
 * author         : 김재성
 * date           : 2023-06-14
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-14        김재성       최초 생성
 */
public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] str = new String[n];

        for (int i=0; i<str.length; i++) {
            str[i] = scan.next();
        }

        for (String x : solution(n, str)) {
            System.out.println(x);
        }

    }

    public static ArrayList<String> solution(int n, String[] str){
        ArrayList<String> answer = new ArrayList<>();

        for(String x : str){
            String tmp = new StringBuilder(x).reverse().toString();
            answer.add(tmp);
        }

        return answer;
    }
}
