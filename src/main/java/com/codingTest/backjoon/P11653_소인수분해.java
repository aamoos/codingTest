package com.codingTest.backjoon;

import java.util.Scanner;

/**
 * packageName    : com.codingTest.backjoon
 * fileName       : P11653_소인수분해
 * author         : 김재성
 * date           : 2023-08-03
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-08-03        김재성       최초 생성
 */
public class P11653_소인수분해 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();

        int b = 2;

        while(true){

            if(a % b != 0){
                b++;
            }else{
                a/=b;
                System.out.println(b);
            }

            //소인수분해가 끝났을때 나옴
            if(a == 1){
                break;
            }
        }
    }
}
