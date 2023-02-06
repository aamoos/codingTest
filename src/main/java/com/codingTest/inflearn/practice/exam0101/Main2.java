package com.codingTest.inflearn.practice.exam0101;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a = br.readLine().toLowerCase();
		char b = br.readLine().toLowerCase().charAt(0);
		System.out.print(solution(a, b));
	}

	public static int solution(String a, char b){
		int result = 0;

		//for문
		for (int i=0; i<a.length(); i++){
			if(b == a.charAt(i)){
				result++;
			}
		}

		return result;
	}
}
