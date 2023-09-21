package com.codingTest.알고리즘기본문제풀이;

import java.util.Scanner;
import java.util.Stack;

/*
()(((()())(())()))(())
 */
public class 섹션5_5_쇠막대기 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println(solution(str));
    }

    public static int solution(String str){
        int answer = 0;
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == '('){
                stack.push('(');
            }else{
                stack.pop();
                if(str.charAt(i-1) == '('){
                    answer = answer+stack.size();
                }else{
                    answer++;
                }
            }
        }
        return answer;
    }
}
