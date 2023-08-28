package com.codingTest.알고리즘기본문제풀이;

import java.util.Scanner;
import java.util.Stack;

public class 섹션5_4_후위식연산 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println(solution(str));
    }

    public static int solution(String str){
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for(char x : str.toCharArray()){
            //숫자냐
            if(Character.isDigit(x)){
                stack.push(x-48);
            }else{
                int rt = stack.pop();
                int lt = stack.pop();

                if(x == '+'){
                    stack.push(lt+rt);
                }else if(x == '-'){
                    stack.push(lt-rt);
                }else if(x == '*'){
                    stack.push(lt*rt);
                }else if(x == '/'){
                    stack.push(lt/rt);
                }
            }
        }
        answer=stack.get(0);
        return answer;
    }
}
