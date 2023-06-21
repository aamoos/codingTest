package com.codingTest.exam0110;

import java.util.Scanner;

/**
 * packageName    : com.codingTest.exam0110
 * fileName       : Main
 * author         : 김재성
 * date           : 2023-06-20
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-20        김재성       최초 생성
 */
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        char c = scan.next().charAt(0);
        for(int x : solution(str, c)){
            System.out.print(x+" ");
        }

    }

    public static int[] solution(String s, char t){
        int[] answer = new int[s.length()];
        int p = 1000;

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == t){
                p = 0;
                answer[i] = p;
            }else{
                p++;
                answer[i] = p;
            }
        }
        p = 1000;
        for(int i=s.length()-1; i>=0; i--){
            if(s.charAt(i) == t){
                p = 0;
            }else{
                p++;
                answer[i] = Math.min(answer[i], p);
            }
        }

        return answer;
    }

}
