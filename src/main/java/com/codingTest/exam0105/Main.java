package com.codingTest.exam0105;

import java.util.Scanner;

/**
 * packageName    : com.codingTest.exam0105
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
        char[] s = str.toCharArray();
        int lt = 0, rt = str.length()-1;

        while(lt < rt){
            if(!Character.isAlphabetic(s[lt])){
                lt++;
            }else if(!Character.isAlphabetic(s[rt])){
                rt--;
            }else{
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
        }

        answer = String.valueOf(s);

        return answer;
    }
}
