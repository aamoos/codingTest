package com.codingTest.backjoon.exam18398;

import java.io.IOException;
import java.util.Scanner;

/**
 * packageName    : com.codingTest.backjoon.exam18398
 * fileName       : Main
 * author         : 김재성
 * date           : 2023-06-14
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-14        김재성       최초 생성
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt();     //테스트 케이스수

        for(int i=0; i<T; i++){

            int N = scan.nextInt(); //문제의수

            for(int j=0; j<N; j++){
                int A = scan.nextInt();
                int B = scan.nextInt();

                int sum = A+B;  //덧셈
                int product = A*B;

                System.out.println(sum+ " "+product);
            }
        }
        scan.close();
    }
}
