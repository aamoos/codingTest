package com.codingTest.backjoon.exam12891;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * packageName    : com.codingTest.backjoon.exam12891
 * fileName       : Main
 * author         : 김재성
 * date           : 2023-07-06
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-07-06        김재성       최초 생성
 */
public class Main {

    static int myArr[];
    static int checkArr[];

    static int checkSecret;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        //문자열 크기
        int S = Integer.parseInt(st.nextToken());

        //부분 문자열 크기
        int P = Integer.parseInt(st.nextToken());

        int result = 0;

        //비밀번호 체크 배열
        checkArr = new int[4];
        myArr = new int[4];

        //현재 상태 배열 (전체 문자열)
        char A[] = new char[S];

        //4가 됬을때 전체 count ++
        checkSecret = 0;

        A = br.readLine().toCharArray();
        st = new StringTokenizer(br.readLine());

        for(int i=0; i<4; i++){
            checkArr[i] = Integer.parseInt(st.nextToken());
            if(checkArr[i] == 0){
                checkSecret++;
            }
        }

        for(int i=0; i<P; i++){ //부분문자열 처음 받을때 세팅
            Add(A[i]);
        }

        if(checkSecret == 4){
            result++;
        }

        //슬라이딩 윈도우
        for(int i=P; i<S; i++){
            int j = i-P;
            Add(A[i]);
            Remove(A[j]);
            if(checkSecret == 4){
                result++;
            }
        }
        System.out.println(result);
        br.close();
    }

    private static void Remove(char c) {{
            switch (c){
                case 'A':
                    if(myArr[0] == checkArr[0]){
                        checkSecret--;
                        myArr[0]--;
                        break;
                    }
                case 'C':
                    if(myArr[1] == checkArr[1]){
                        checkSecret--;
                        myArr[1]--;
                        break;
                    }
                case 'G':
                    if(myArr[2] == checkArr[2]){
                        checkSecret--;
                        myArr[2]--;
                        break;
                    }
                case 'T':
                    if(myArr[3] == checkArr[3]){
                        checkSecret--;
                        myArr[3]--;
                        break;
                    }
            }
        }
    }

    private static void Add(char c) {
        switch (c){
            case 'A':
                myArr[0]++;
                if(myArr[0] == checkArr[0]){
                    checkSecret++;
                    break;
                }
            case 'C':
                myArr[1]++;
                if(myArr[1] == checkArr[1]){
                    checkSecret++;
                    break;
                }
            case 'G':
                myArr[2]++;
                if(myArr[2] == checkArr[2]){
                    checkSecret++;
                    break;
                }
            case 'T':
                myArr[3]++;
                if(myArr[3] == checkArr[3]){
                    checkSecret++;
                    break;
                }
        }
    }

}
