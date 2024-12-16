package com.codingTest.harucoading.브론즈2.Day1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BOJ3052 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Set<Integer> mySet = new HashSet<>();
        for(int i=0; i<10; i++){
           int temp = scan.nextInt() % 42;
           mySet.add(temp);
        }
        System.out.println(mySet.size());
    }
}