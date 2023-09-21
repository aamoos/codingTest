package com.codingTest.알고리즘기본문제풀이;

import java.util.Scanner;
import java.util.Stack;

/*
5
0 0 0 0 0
0 0 1 0 3
0 2 5 0 1
4 2 4 4 2
3 5 1 3 1
8
1 5 3 5 1 2 1 4
 */

public class 섹션5_3_크레인인형뽑기 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] board = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j] = scan.nextInt();
            }
        }
        int m = scan.nextInt();
        int[] moves = new int[m];
        for(int i=0; i<m; i++){
            moves[i] = scan.nextInt();
        }
        System.out.println(solution(board, moves));
    }

    public static int solution(int[][] board, int[] moves){
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for(int pos : moves){
            for(int i=0; i<board.length; i++){
                if(board[i][pos-1] != 0){
                    //인형이 발견
                    int tmp = board[i][pos-1];
                    board[i][pos-1] = 0;

                    if(!stack.isEmpty() && tmp == stack.peek()){
                        answer+=2;
                        stack.pop();
                    }else{
                        stack.push(tmp);
                    }
                    break;
                }
            }
        }

        return answer;
    }
}
