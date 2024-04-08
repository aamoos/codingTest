package com.codingTest.알고리즘2024.chap1.sector1;

import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        System.out.println(solution(s));
    }

    public static String solution(String str){
        String answer = "";
        int m = Integer.MIN_VALUE;

        String[] arr = str.split(" ");

        for (String s : arr) {
            int len = s.length();
            if(len > m){
                m = len;
                answer = s;
            }
        }

        return answer;
    }
}
