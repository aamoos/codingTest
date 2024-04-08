package com.codingTest.알고리즘2024.chap1.sector1;

import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println(solution(str));
    }

    public static String solution(String str){
        String answer = "";

        for (char c: str.toCharArray()) {

            //소문자냐?
//            if(Character.isLowerCase(c)){
//                answer+=Character.toUpperCase(c);
//            }else{
//                answer+=Character.toLowerCase(c);
//            }

            //대문자
            if(c>=65 && c<=90){
                answer+=(char) (c+32);
            }else if(c>=97 && c<=122){
                //소문자
                answer+=(char) (c-32);
            }
        }
        return answer;
    }
}