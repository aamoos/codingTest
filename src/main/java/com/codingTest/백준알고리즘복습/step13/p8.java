package com.codingTest.백준알고리즘복습.step13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

/**
 * packageName    : com.codingTest.알고리즘복습.step13
 * fileName       : p8
 * author         : 김재성
 * date           : 2023-10-06
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-10-06        김재성       최초 생성
 */
public class p8 {

    public static class Point implements Comparable<Point>{
        private int x,y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Point o) {

            if(this.y == o.y){
                return this.x - o.x;        //x좌표 오름차순
            }else{
                return this.y - o.y;        //y좌표 오름차순
            }


        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        List<Point> list = new ArrayList<>();
        for(int i=0; i<a; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            Point point = new Point(x, y);
            list.add(point);
        }

        Collections.sort(list);

        for (Point point : list) {
            System.out.println(point.x+" "+point.y);
        }
    }
}
