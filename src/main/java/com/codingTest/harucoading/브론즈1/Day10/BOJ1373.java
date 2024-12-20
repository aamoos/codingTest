package com.codingTest.harucoading.브론즈1.Day10;

import java.util.ArrayList;
import java.util.Scanner;

public class BOJ1373 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[] text = scan.nextLine().toCharArray();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=text.length-1; i>=0;){
            int temp = 0;
            for(int j=1; j<=4 && i>=0; j=j*2){
                temp += j * Integer.parseInt(String.valueOf(text[i--]));
            }
            arr.add(temp);
        }

        for(int i=arr.size()-1; i>=0; i--){
            System.out.print(arr.get(i));
        }
    }
}