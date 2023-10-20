package com.codingTest.백준알고리즘복습.step16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * packageName    : com.codingTest.백준알고리즘복습.step16
 * fileName       : P2
 * author         : 김재성
 * date           : 2023-10-20
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-10-20        김재성       최초 생성
 */
public class P2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<N; i++){
            int num = Integer.parseInt(br.readLine());

            if(num == 0){
                stack.pop();        //0이면 스택의 가장 최근의수를 뺀다.
            }else{
                stack.push(num);
            }
        }

        int sum = 0;

        for (int o : stack) {
            sum+=o;
        }

        System.out.println(sum);
    }
}