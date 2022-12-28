package com.codingTest.exam0107;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		System.out.println(solution(str));
	}

	public static String solution(String str){
		String answer = "YES";

		//내가 푼거
//		str = str.toLowerCase();
//		StringBuilder sb = new StringBuilder(str);
//		String reverseStr = sb.reverse().toString();
//
//		if(str.equals(reverseStr)){
//			answer = "YES";
//		}else{
//			answer = "NO";
//		}

		//강의
		str = str.toUpperCase();
		int len = str.length();
		for(int i=0; i<len/2; i++){
			if(str.charAt(i) != str.charAt(len-i-1)) return "NO";
		}

		//강의2
		String tmp = new StringBuilder(str).reverse().toString();

		if(str.equalsIgnoreCase(tmp)){
			answer = "YES";
		}else{
			answer = "NO";
		}

		return answer;
	}
}
