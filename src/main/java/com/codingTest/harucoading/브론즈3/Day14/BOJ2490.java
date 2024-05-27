package com.codingTest.harucoading.브론즈3.Day14;

import java.util.Scanner;

public class BOJ2490 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for(int i=0; i<3; i++){
            //여기 포문 도는게 한번 던지는 거
            int B = 0;
            for(int j=0; j<4; j++){
                int temp = scan.nextInt();
                if(temp==0){
                    B++;
                }
            }
            switch (B){
                case 1:
                    System.out.println("A");
                    break;
                case 2:
                    System.out.println("B");
                    break;
                case 3:
                    System.out.println("C");
                    break;
                case 4:
                    System.out.println("D");
                    break;
                case 0:
                    System.out.println("E");
                    break;
            }
        }
    }
}
