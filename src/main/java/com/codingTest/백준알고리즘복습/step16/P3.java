package com.codingTest.백준알고리즘복습.step16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * packageName    : com.codingTest.백준알고리즘복습.step16
 * fileName       : P3
 * author         : 김재성
 * date           : 2023-10-20
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-10-20        김재성       최초 생성
 */
public class P3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for(int i=0; i<N; i++){
            Stack<Character> stack = new Stack<>();
            String answer = "";
            boolean flag = true;
            String s = br.readLine();

            for (char c : s.toCharArray()) {
                //여는 괄호일때 stack에 넣는다.
                if('(' == c){
                    stack.push(c);
                }else if(stack.size() == 0){
                    flag = false;
                } else{
                    //닫는 괄호일때는 stack에 뺌
                    stack.pop();
                }
            }

            if(flag){
                if(stack.size() == 0){
                    answer = "YES";
                }else{
                    answer = "NO";
                }
            }else{
                answer = "NO";
            }
            System.out.println(answer);
        }
    }
}
