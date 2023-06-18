package com.codingTest.exam0106;

import java.util.Scanner;

/**
 * packageName    : com.codingTest.exam0106
 * fileName       : Main
 * author         : 김재성
 * date           : 2023-06-16
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-16        김재성       최초 생성
 */
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println(solution(str));
    }

    public static String solution(String str){
        String answer = "";

        for(int i=0; i<str.length(); i++){
            //System.out.println(str.charAt(i)+ " " + i + " "+str.indexOf(str.charAt(i)));

            if(str.indexOf(str.charAt(i)) == i){
                answer+=str.charAt(i);
            }
        }
        return answer;
    }
}
