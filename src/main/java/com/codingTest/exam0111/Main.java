package com.codingTest.exam0111;

import java.util.Scanner;

/**
 * packageName    : com.codingTest.exam0111
 * fileName       : Main
 * author         : 김재성
 * date           : 2023-06-21
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-21        김재성       최초 생성
 */
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println(solution(str));
    }

    public static String solution(String s){
        String answer = "";

        s = s+" ";
        int cnt = 1;

        for(int i=0; i<s.length()-1; i++){
            if(s.charAt(i) == s.charAt(i+1)){
                cnt++;
            }else{
                answer+=s.charAt(i);
                if(cnt>1){
                    answer+= String.valueOf(cnt);
                    cnt = 1;
                }
            }
        }
        return answer;
    }
}
