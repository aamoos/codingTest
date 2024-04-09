package com.codingTest.알고리즘2024.chap1.sector1;

import java.util.Scanner;

public class P9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println(solution(str));
    }

    public static int solution(String s){
        String answer = "";

        for(char x : s.toCharArray()){
            if(Character.isDigit(x)){
                answer+=x;
            }

        }
        return Integer.parseInt(answer);
    }
}
