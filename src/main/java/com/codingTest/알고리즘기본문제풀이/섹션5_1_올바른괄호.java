package com.codingTest.알고리즘기본문제풀이;

import java.util.Scanner;
import java.util.Stack;

public class 섹션5_1_올바른괄호 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println(solution(str));
    }

    public static String solution(String str){
        String answer = "YES";
        Stack<Character> stack = new Stack<>();
        for(char x : str.toCharArray()){
            if('(' == x){
                stack.push(x);
            }else{
                if(stack.isEmpty()){
                   return "NO";
                }else{
                    stack.pop();
                }
            }
        }

        //stack에 자료가 있으면 (여는괄호가 많은 상황)
        if(!stack.isEmpty()){
            return "NO";
        }

        return answer;
    }
}
