package com.codingTest.알고리즘2024.chap1.sector1;

import java.util.Scanner;

public class practice7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println(solution(str));
    }

//    public static String solution(String str){
//        String answer = "YES";
//        str = str.toUpperCase();
//        int len = str.length();
//        for(int i=0; i<len/2; i++){
//            if(str.charAt(i) != str.charAt(len-i-1)){
//                return "NO";
//            }
//        }
//
//        return answer;
//    }

    public static String solution(String str){
        String answer = "NO";
        String tmp = new StringBuilder(str).reverse().toString();

        //대소문자 무시하고 eqaul 체크
        if(str.equalsIgnoreCase(tmp)){
            answer = "YES";
        }
        return answer;
    }

}
