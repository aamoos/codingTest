package com.codingTest.harucoading.브론즈1.Day8;

import java.util.ArrayList;
import java.util.Scanner;

public class BOJ9506 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true){
            int N = scan.nextInt();
            if(N == -1){
                break;
            }

            ArrayList<Integer>temp = new ArrayList<>();
            int sum = 0;

            for(int i=1; i<N; i++){
                if(N%i == 0){
                    //i가 N의 약수이면
                    temp.add(i);
                    sum+=i;
                }
            }

            if(sum == N){
                //완전수 이면?
                System.out.println(N+ " = ");
                for(int i=0; i<temp.size()-1; i++){
                    System.out.print(temp.get(i)+ " + ");
                }
                System.out.println(temp.get(temp.size())-1);
            }else{
                //아니면
                System.out.println(N+ " is NOT perfect.");
            }
        }
    }
}
