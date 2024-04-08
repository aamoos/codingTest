package com.codingTest.알고리즘2024.chap1.sector1;

import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        int answer = 0;
        Scanner scan = new Scanner(System.in);
        //문자열
        String str = scan.next();
        //문자
        char c = scan.next().charAt(0);
        System.out.print(solution(str, c));
    }

    public static int solution(String str, char c){
        int answer = 0;
        str = str.toUpperCase();        //대문자

        c = Character.toUpperCase(c);   //대문자

        /*
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == c){
                answer++;
            }
        }
         */

        for(char x : str.toCharArray()){
            if(x == c){
                answer++;
            }
        }

        return answer;
    }
}