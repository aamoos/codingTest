package com.codingTest.practice.exam0103;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String result = "";
		String[] arr = br.readLine().split(" ");
		System.out.print(solution(arr));
	}

	public static String solution(String[] arr){
		String result = "";
		int max = Integer.MIN_VALUE;
		for (String s : arr) {
			int len = s.length();
			if(len > max){
				max=len;
				result=s;
			}
		}
		return result;
	}
}