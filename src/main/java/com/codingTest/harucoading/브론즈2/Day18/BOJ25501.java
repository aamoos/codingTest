package com.codingTest.harucoading.브론즈2.Day18;

import java.util.Scanner;

public class BOJ25501 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        scan.nextLine();
        for(int i=0; i<N; i++){
            char[] text = scan.nextLine().toCharArray();
            boolean isP = true;
            int index = 0;
            for(int j=0; j<text.length/2+1; j++){
                index++;
                if(text[j] != text[text.length-1-j]){
                    isP = false;
                    break;
                }
            }
            if(isP){
                System.out.println(1+" "+index);
            }else{
                System.out.println(0+" "+index);
             }
        }
    }
}
