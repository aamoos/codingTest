package com.codingTest.exam0104;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * packageName    : com.codingTest.exam0104
 * fileName       : Main2
 * author         : 김재성
 * date           : 2023-06-14
 * description    : 직접 코드구현으로 뒤집기
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-14        김재성       최초 생성
 */
public class Main2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] str = new String[n];

        for (int i=0; i<str.length; i++) {
            str[i] = scan.next();
        }

        for (String x : solution(n, str)) {
            System.out.println(x);
        }

    }

    public static ArrayList<String> solution(int n, String[] str){
        ArrayList<String> answer = new ArrayList<>();

        for(String x : str){
            char[] s = x.toCharArray();

            int lt = 0, rt=x.length()-1;
            while(lt<rt){
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }

            String tmp = String.valueOf(s);
            answer.add(tmp);
        }

        return answer;
    }

}
