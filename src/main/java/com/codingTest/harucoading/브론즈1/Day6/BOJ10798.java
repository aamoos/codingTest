package com.codingTest.harucoading.브론즈1.Day6;

import java.util.Scanner;

public class BOJ10798 {
    public static void main(String[] args) {
        char[][] map = new char[5][15];

        for(int i=0; i<5; i++){
            for(int j=0; j<15; j++){
                map[i][j] = ' ';
            }
        }

        Scanner scan = new Scanner(System.in);
        for(int i=0; i<5; i++){
            char text[] = scan.nextLine().toCharArray();

            for(int j=0; j<text.length; j++){
                map[i][j] = text[j];
            }
        }
        for(int i=0; i<15; i++){
            for(int j=0; j<5; j++){
                if(map[i][j] != ' '){
                    System.out.print(map[i][j]);
                }
            }
        }
    }
}
