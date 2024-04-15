package com.codingTest.알고리즘2024.chap1.sector1;

import java.util.Scanner;

public class P12 {
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
            int num = Integer.parseInt(tmp, 2); //2진수
            answer+=(char) num;
            s = s.substring(7);
        }

        return answer;
    }

}
