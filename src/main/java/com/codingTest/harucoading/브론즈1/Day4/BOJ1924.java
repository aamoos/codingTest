package com.codingTest.harucoading.브론즈1.Day4;

import java.util.Scanner;

public class BOJ1924 {
    public static void main(String[] args) {
        int m[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String day_str[] = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        int y = scan.nextInt();

        int day = 0;
        for(int i=0; i<x; i++){
            day += m[i];
        }
        day += y;
        System.out.println(day_str[day%7]);
    }
}
