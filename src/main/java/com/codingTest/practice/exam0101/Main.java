package com.codingTest.practice.exam0101;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a = br.readLine().toLowerCase();
		char b = br.readLine().toLowerCase().charAt(0);
		System.out.print(solution(a, b));
	}

	public static int solution(String a, char b){
		int result = 0;

		//toCharArray
		for (char c : a.toCharArray()) {
			if(c == b){
				result++;
			}
		}
		return result;
	}
}
