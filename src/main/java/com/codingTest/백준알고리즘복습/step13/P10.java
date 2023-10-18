package com.codingTest.백준알고리즘복습.step13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class P10 {

    public static class People implements Comparable<People>{
        private int age;
        private String name;

        public People(int age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        public int compareTo(People o) {
            return this.age-o.age;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        List<People> list = new ArrayList<>();

        for(int i=0; i<a; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            People people = new People(age , name);
            list.add(people);
        }
        Collections.sort(list);
        for (People p : list) {
            System.out.println(p.age + " " + p.name);
        }
    }
}