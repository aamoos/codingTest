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
public class 섹션4_1학급회장 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String str = scan.next();
        System.out.println(solution(n, str));
    }

    public static char solution(int n, String s){
        char answer = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for(char x : s.toCharArray()){
            map.put(x, map.getOrDefault(x, 0)+1);
        }
        
        int max = Integer.MIN_VALUE;
        for(char key : map.keySet()){
            //System.out.println(x+ " " + map.get(x));
            if(map.get(key) > max){
                max = map.get(key);
                answer=key;
            }
        }
        return answer;
    }
}
