package com.codingTest.초보;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * packageName    : com.codingTest.초보
 * fileName       : P2484
 * author         : 김재성
 * date           : 2023-10-30
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-10-30        김재성       최초 생성
 */
public class P2484 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int man = Integer.parseInt(bf.readLine());
        int winner = 0;
        //최대 상금 담을 변수

        for(int i = 0; i < man; i++) {
            String [] arr = bf.readLine().split(" ");

            int max = 0;
            //같은 숫자중 최댓값 저장할 변수
            int diceNumber = 0;
            int OtherdiceNumber = 0;
            int maxDiceNumber = 0;

            for(int j = 0; j< arr.length -1; j++) {
                int count = 1;
                //같은 숫자 최댓값 찾을 변수
                for(int k = j + 1; k <  arr.length; k++) {
                    if(arr[j].equals(arr[k])) {
                        count++;
                    }
                }

                if(max < count) {
                    max = count;
                    diceNumber = Integer.parseInt(arr[j]);
                    //주사위 면을 저장할 변수
                }else {
                    if(max == 2 && count == 2) {
                        OtherdiceNumber = Integer.parseInt(arr[j]);
                        //3번 조건 체크 하기 위한 식
                    }
                    if(maxDiceNumber < diceNumber) {
                        maxDiceNumber = diceNumber;
                        //모두 다를 경우 대비한 식
                        //나온 주사위 눈준 가장 큰수 저장
                    }
                }

            }

            int sum = 0;
            //합계가 저장될 변수
            if(max == 4) {
                sum = 50000 + (diceNumber*5000);
            }else if(max == 3) {
                sum = 10000 + (diceNumber*1000);
            }else if(max == 2 && OtherdiceNumber != 0) {
                sum = 2000 + (diceNumber * 500) + (OtherdiceNumber * 500);
            }else if(max == 2) {
                sum = 1000 + (diceNumber * 100);
            }else {
                sum = maxDiceNumber * 100;
            }
            //주사위 최대변수에 대한 식

            if(winner < sum) {
                winner = sum;
            }
        }

        System.out.println(winner);

    }
}