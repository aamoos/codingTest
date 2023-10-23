package com.codingTest.백준알고리즘복습.step16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * packageName    : com.codingTest.백준알고리즘복습.step16
 * fileName       : P4
 * author         : 김재성
 * date           : 2023-10-23
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-10-23        김재성       최초 생성
 */
public class P4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String s;

        while(true){
            s = br.readLine();

            //종료 조건문
            if(s.equals(".")){
                break;
            }
            sb.append(solve(s)).append('\n');
        }
        System.out.println(sb);
    }

    public static String solve(String s){

        Stack<Character> stack = new Stack<>();

        for(int i=0; i<s.length(); i++){

            //i 번째 문자
            char c = s.charAt(i);

            //여는 괄호일 경우 스택에 push
            if(c == '(' || c == '['){
                stack.push(c);
            }

            //다든 소괄호 일 경우
            else if(c == ')'){

                //스택이 비어있거나 pop할 원소가 소괄호랑 매칭이 안되는 경우
                if(stack.empty() || stack.peek() != '('){
                    return "no";
                }else{
                    stack.pop();
                }
            }

            else if(c == ']'){

                //스택이 비어있거나 pop할 원소가 대괄호랑 매칭이 안되는 경우
                if(stack.empty() || stack.peek() != '['){
                    return "no";
                }else{
                    stack.pop();
                }
            }
        }

        if(stack.empty()){
            return "yes";
        }else{
            return "no";
        }
    }
}