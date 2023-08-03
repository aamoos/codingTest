package com.codingTest.backjoon;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * packageName    : com.codingTest.backjoon
 * fileName       : P2581_소수
 * author         : 김재성
 * date           : 2023-08-03
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-08-03        김재성       최초 생성
 */
public class P2581_소수 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int M = scan.nextInt();
        int N = scan.nextInt();
        List<Integer> list = new ArrayList<Integer>();
        int sum = 0;
        for(int i=M; i<=N; i++){

            //1은소수가 아님
            if(i!=1){
                //소수인항목만 배열에 넣어주기
                if(checkSosu(i)){
                    list.add(i);
                    sum+=i;
                }
            }
        }

        //소수가없는경우
        if(list.size() == 0){
            System.out.println(-1);
        }else{
            //소수가 있는경우
            System.out.println(sum);
            System.out.println(list.get(0));
        }
    }

    public static boolean checkSosu(int a){
        boolean result = true;
        int sosuCount = 0;

        for(int i=1; i<=a; i++){
            //약수가 나올경우 sosuCount +1을함
            if(a%i == 0){
                sosuCount++;
            }
        }

        //약수가 2개이상일때 소수가 아님
        if(sosuCount > 2){
            result = false;
        }

        return result;
    }
}
