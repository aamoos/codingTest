package com.codingTest.backjoon;

import java.util.Scanner;

/**
 * packageName    : com.codingTest.backjoon
 * fileName       : P_3009_네번째점
 * author         : 김재성
 * date           : 2023-09-19
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-09-19        김재성       최초 생성
 */
public class P_3009_네번째점 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] coord_1 = { scan.nextInt(), scan.nextInt() };
        int[] coord_2 = { scan.nextInt(), scan.nextInt() };
        int[] coord_3 = { scan.nextInt(), scan.nextInt() };

        int x, y;

        //x 좌표 비교
        if(coord_1[0] == coord_2[0]){
            x = coord_3[0];
        }else if(coord_1[0] == coord_3[0]){
            x = coord_2[0];
        }else{
            x = coord_1[0];
        }

        //y좌표 비교
        if(coord_1[1] == coord_2[1]){
            y = coord_3[1];
        }else if(coord_1[1] == coord_3[1]){
            y = coord_2[1];
        }else{
            y = coord_1[1];
        }
        System.out.print(x+ " "+y);
    }
}
