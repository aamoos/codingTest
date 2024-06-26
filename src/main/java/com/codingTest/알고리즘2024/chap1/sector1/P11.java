package com.codingTest.알고리즘2024.chap1.sector1;

import java.util.Scanner;

public class P11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println(solution(str));
    }

    public static String solution(String s){
        String answer = "";
        s=s+" ";

        int cnt = 1;
        for(int i=0; i<s.length()-1; i++){

            if(s.charAt(i) == s.charAt(i+1)){
                cnt++;
            }else{
                answer+=s.charAt(i);
                if(cnt>1){
                    answer+=String.valueOf(cnt);
                }
                cnt=1;
            }
        }

        return answer;
    }
}
