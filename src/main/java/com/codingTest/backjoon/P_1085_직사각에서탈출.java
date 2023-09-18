package com.codingTest.backjoon;

import java.util.Scanner;

/**
 * packageName    : com.codingTest.backjoon
 * fileName       : P_1085_직사각에서탈출
 * author         : 김재성
 * date           : 2023-09-18
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-09-18        김재성       최초 생성
 */
public class P_1085_직사각에서탈출 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        int y = scan.nextInt();
        int w = scan.nextInt();
        int h = scan.nextInt();

        int x_min = Math.min(x, w-x);
        int y_min = Math.min(y, h-y);

        System.out.println(Math.min(x_min, y_min));
    }
}
