package com.codingTest.practice.exam0102;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* lowerCase, UpperCase */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a = br.readLine();
		System.out.print(solution(a));
	}

	public static String solution(String a){
		String result = "";
		//toCharArray
		for (char c : a.toCharArray()) {
			//대문자인경우
			if(Character.isUpperCase(c)){
				result+=Character.toLowerCase(c);
			} else if(Character.isLowerCase(c)){
				result+=Character.toUpperCase(c);
			}
		}
		return result;
	}
}
