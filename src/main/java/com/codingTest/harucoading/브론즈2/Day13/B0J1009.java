package com.codingTest.harucoading.브론즈2.Day13;

import java.util.Scanner;

public class B0J1009 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();

        for(int i=0; i<T; i++){
            int a = scan.nextInt();
            int b = scan.nextInt();

            int result = a%10;
            for(int j=0; j<b-1; j++){
                result = (result*a) % 10;   //나머지 자리를 버리고 일의자리를 취한다.
            }

            if(result == 0){
                System.out.println(10);
            }else{
                System.out.println(result);
            }
        }
    }
}
