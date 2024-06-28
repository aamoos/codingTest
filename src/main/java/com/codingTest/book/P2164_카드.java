package com.codingTest.book;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P2164_카드 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Queue<Integer> myQueue = new LinkedList<>();
        int N = scan.nextInt();

        for(int i=1; i<=N; i++){
            myQueue.add(i);
        }

        while(myQueue.size() > 1){
            myQueue.poll();         //한장 뽑아서 버림
            myQueue.add(myQueue.poll());    //한장 뽑아서 맨 앞으로 보냄
        }
        System.out.println(myQueue.poll());
    }
}
