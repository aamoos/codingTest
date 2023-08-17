package com.codingTest.알고리즘기본문제풀이;

import java.util.HashMap;
import java.util.Scanner;

/**
 * packageName    : com.codingTest.알고리즘기본문제풀이
 * fileName       : 섹션4_1학급회장
 * author         : 김재성
 * date           : 2023-08-16
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-08-16        김재성       최초 생성
 */
public class 섹션4_2아나그램 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        System.out.println(solution(a, b));
    }

    public static String solution(String s1, String s2){
        String answer="YES";

        HashMap<Character, Integer> map = new HashMap<>();

        for(char x : s1.toCharArray()){
            map.put(x, map.getOrDefault(x, 0)+1);
        }

        for(char x : s2.toCharArray()){
            if(!map.containsKey(x) || map.get(x) == 0){
                return "NO";
            }
            map.put(x, map.get(x) -1);
        }

        return answer;
    }
}
