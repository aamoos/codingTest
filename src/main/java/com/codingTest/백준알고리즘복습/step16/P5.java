package com.codingTest.백준알고리즘복습.step16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 * packageName    : com.codingTest.백준알고리즘복습.step16
 * fileName       : P5
 * author         : 김재성
 * date           : 2023-10-23
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-10-23        김재성       최초 생성
 */
public class P5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //학생수
        int n = Integer.parseInt(br.readLine());

        Queue<Integer> q = new LinkedList<>();  //대기열
        Stack<Integer> s = new Stack<>();       //추가 대기열

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0; i<n; i++){
            q.offer(Integer.parseInt(st.nextToken()));
        }

        int start = 1;      //간식 먹는 순서

        while(!q.isEmpty()){
            if(q.peek() == start){
                //대기열과 간식을 받아야하는 사람과 같다면
                q.poll();
                start++;
            }else if(!s.isEmpty() && s.peek() == start){
                //추가 대기열이 비어있지 않고 간식을 받아야 하는 사람과 같다면
                s.pop();
                start++;
            }else{
                //대기열, 추가대기열이 둘 다 간식을 받아야하는 사람과 다르다면
                //대기열에 있는 사람을 추가 대기열로 이동
                s.push(q.poll());
            }
        }
        while(!s.isEmpty()){
            //대기열 사람이 다 빠지고 추가 대기열에 있는 사람 체크
            if(s.peek() == start){
                //간식을 받아야 하는 사람과 같다면
                s.pop();
                start++;
            }else{
                //다르다면
                System.out.println("Sad");
                return;
            }
        }
        //여기까지 왔다면 간식을 모든 사람 순서대로 다 받은 것이니까
        System.out.println("Nice");

    }
}