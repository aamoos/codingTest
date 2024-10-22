package com.codingTest.harucoading.브론즈2.Day8;

import java.util.Scanner;

public class BOJ2231 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int result = 0;

        for(int i=1; i<n; i++){
            if(n == check(i)){
                result = i;
                break;
            }
        }
        System.out.println(result);
    }

    private static int check(int now) {
        int sum = now;
        char text[] = String.valueOf(now).toCharArray();

        for(int i=0; i<text.length; i++){
            sum += Integer.parseInt(String.valueOf(text[i]));
        }
        return sum;
    }
}
