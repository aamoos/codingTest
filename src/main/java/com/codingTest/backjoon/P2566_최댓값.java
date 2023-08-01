package com.codingTest.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * packageName    : com.codingTest.backjoon
 * fileName       : P2566_최댓값
 * author         : 김재성
 * date           : 2023-08-01
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-08-01        김재성       최초 생성
 */
public class P2566_최댓값 {
    public static void main(String[] args) throws IOException {

        int [][] array = new int[10][10];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;
        int row = 0;
        int column = 0;

        for(int i=0; i<9; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<9; j++){
                array[i][j] = Integer.parseInt(st.nextToken());
                if(max < array[i][j]){
                    max = array[i][j];
                    row = i;
                    column= j;
                }
            }
        }

        System.out.println(max);
        System.out.print((row+1)+" "+(column+1));
    }
}
