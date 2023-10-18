package com.codingTest.백준알고리즘복습.step14;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int[] cards = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            cards[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(cards); //이분탐색할 배열은 정렬되어 있어야함
        int M = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<M; i++){
            int temp = Integer.parseInt(st.nextToken());
            sb.append(binarySearch(cards, N, temp)+ " ");
        }

        bw.write(sb.toString()+ "\n");
        bw.flush();
        bw.close();
        br.close();
    }

    public static int binarySearch(int[] cards, int N, int search){
        int first = 0;
        int last = N-1;
        int mid = 0;

        while(first <= last){
            mid = (first + last) / 2; //중간 인덱스

            //중간값과 찾으려는 수가 같은 경우
            if(cards[mid] == search){
                return 1;
            }

            //중간값이 찾으려는 수보다 작으면
            if(cards[mid] < search){
                first = mid + 1;
            } else{
                //중간값이 찾으려는 수보다 크면, 그이상으로는 볼필요 없음
                last = mid - 1;
            }
        }
        return 0;
    }
}
