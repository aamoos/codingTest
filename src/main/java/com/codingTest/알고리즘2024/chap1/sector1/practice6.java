package com.codingTest.알고리즘2024.chap1.sector1;

import java.util.Scanner;

//중복제거
public class practice6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        System.out.println(solution(s));
    }

    public static String solution(String str){
        String answer = "";

        for(int i=0; i<str.length(); i++){
            //처음으로 찾는 문자 위치 == 현재 문자위치
            if(str.indexOf(str.charAt(i)) == i){
                answer+=str.charAt(i);
            }
        }
        return answer;
    }
}
