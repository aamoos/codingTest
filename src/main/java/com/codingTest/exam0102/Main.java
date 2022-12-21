package com.codingTest.exam0102;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		String result = "";

		//string for문 돌리기
		for (char c : s.toCharArray()) {
			if(Character.isUpperCase(c)){
				//대문자
				result+=Character.toLowerCase(c);
			} else if(Character.isLowerCase(c)){
				//소문자
				result+=Character.toUpperCase(c);
			}
		}
		System.out.println(result);
	}
}
