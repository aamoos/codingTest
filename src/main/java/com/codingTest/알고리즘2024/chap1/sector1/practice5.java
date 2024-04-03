package com.codingTest.알고리즘2024.chap1.sector1;

import java.util.Scanner;

public class practice5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println(solution(str));
    }

    public static String solution(String str){
        String answer = "";
        char[] s = str.toCharArray();
        int lt = 0;
        int rt = str.length()-1;

        while(lt < rt){
            //해당 문자가 알파벳이 아닐때
            if(!Character.isAlphabetic(s[lt])){
                lt++;
            }else if(!Character.isAlphabetic(s[rt])){
                rt--;
            }else{
                char temp = s[lt];
                s[lt] = s[rt];
                s[rt] = temp;
                lt++;
                rt--;
            }
        }
        answer=String.valueOf(s);

        return answer;
    }
}
