package com.codingTest.알고리즘2024.chap1.sector1;

import java.util.Scanner;

public class P8 {
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