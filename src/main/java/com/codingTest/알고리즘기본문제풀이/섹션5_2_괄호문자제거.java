package com.codingTest.알고리즘기본문제풀이;

import java.util.Scanner;
import java.util.Stack;

public class 섹션5_2_괄호문자제거 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println(solution(str));
    }

    public static String solution(String str){
        String answer = "";
        Stack<Character> stack = new Stack<>();
        for(char x : str.toCharArray()){

            if(')' == x){
                while('(' != stack.pop());
            }else{
                stack.push(x);
            }
        }

        for(int i=0; i<stack.size(); i++){
            answer+=stack.get(i);
        }
        return answer;
    }
}
