package com.codingTest.백준알고리즘복습.step13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class P7 {

    public static class Point implements Comparable<Point> {
        private int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Point o) {

            if(this.x == o.x){
                return this.y-o.y;    // y좌표 오름차순
            }else{
                return this.x-o.x;      // x좌표 오름차순
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        List<Point> list = new ArrayList<>();

        for(int i=0; i<N; i++){
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
