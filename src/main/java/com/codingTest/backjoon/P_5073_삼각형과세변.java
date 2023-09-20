package com.codingTest.backjoon;

import java.util.Arrays;
import java.util.Scanner;

/**
 * packageName    : com.codingTest.backjoon
 * fileName       : P_5073
 * author         : 김재성
 * date           : 2023-09-20
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-09-20        김재성       최초 생성
 */
public class P_5073_삼각형과세변 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true){
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();

            int[] arr = new int[3];

            arr[0] = a;
            arr[1] = b;
            arr[2] = c;

            Arrays.sort(arr);

            //a b c가 0일때 마지막줄 빠져나옴
            if(a == 0 && b == 0 && c == 0){
                break;
            }

            //가장 긴 변의 길이보다 나머지 두변의 길이의 합이 길지 않으면
            if( !(arr[2] < arr[0]+arr[1]) ){
                System.out.println("Invalid");
            }else{
                if(a == b && a == c && b == c){
                    //세변의길이가 모두 같은 경우
                    System.out.println("Equilateral");
                }else if(a != b && a!= c && b != c){
                    //세변의길이가 모두 다를경우
                    System.out.println("Scalene");
                }else{
                    System.out.println("Isosceles");
                }
            }
        }
    }
}
