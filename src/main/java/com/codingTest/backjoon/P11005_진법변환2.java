package com.codingTest.backjoon;

import java.util.Scanner;

public class P11005_진법변환2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[] arr = new char[36];
        StringBuilder sb = new StringBuilder();

        int num = scan.nextInt();
        int slice = scan.nextInt();
        int i = 0;

        while(num > 0){
            int strNum = num % slice;
            if(strNum < 10){
                arr[i] = ((char) (strNum + '0'));
            }else{
                arr[i] = ((char) (strNum - 10 + 'A'));
            }

            num /= slice;
            i++;
        }

        for(int j=i; j>=0; j--){
            sb.append(arr[j]);
        }

        System.out.println(sb.toString().trim());
    }
}
