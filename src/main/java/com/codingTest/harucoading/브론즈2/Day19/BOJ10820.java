package com.codingTest.harucoading.브론즈2.Day19;

import java.util.Scanner;

public class BOJ10820 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(scan.hasNextLine()){
            char[] text = scan.nextLine().toCharArray();
            int S = 0;
            int D = 0;
            int N = 0;
            int B = 0;
            for(int i=0; i<text.length; i++){
                char now = text[i];
                if(now == ' '){
                    B++;
                }else if(now >= 'a' && now <= 'z'){
                    //소문자
                    S++;
                }else if(now >= 'A' && now <= 'Z'){
                    //대문자
                    D++;
                }else{
                    N++;
                }
                System.out.println(S+" "+D+" "+N+" "+B);
            }
        }
    }
}
