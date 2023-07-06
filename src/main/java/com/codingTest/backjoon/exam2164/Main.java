package com.codingTest.backjoon.exam2164;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * packageName    : com.codingTest.backjoon.exam2164
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
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Queue<Integer> myQueue = new LinkedList<>();
        int N = scan.nextInt();

        for(int i=1; i<=N; i++){
            myQueue.add(i);
        }

        while(myQueue.size()>1){
            myQueue.poll(); //맨위에 카드 버림
            int temp = myQueue.poll(); //맨위에 카드를 카드 밑으로 이동
            myQueue.add(temp);
        }
        System.out.println(myQueue.poll());
    }
}
