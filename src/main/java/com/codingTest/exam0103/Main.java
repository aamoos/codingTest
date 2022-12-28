package com.codingTest.exam0103;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String result = "";
		int max = Integer.MIN_VALUE;
		String[] arr = br.readLine().split(" ");
		for (String s : arr) {
			int len = s.length();
			if(len > max){
				max=len;
				result=s;
			}
		}
		System.out.println(result);
	}
}
