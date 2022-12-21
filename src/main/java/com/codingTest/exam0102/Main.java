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
//		for (char c : s.toCharArray()) {
//			if(Character.isUpperCase(c)){
//				//대문자
//				result+=Character.toLowerCase(c);
//			} else if(Character.isLowerCase(c)){
//				//소문자
//				result+=Character.toUpperCase(c);
//			}
//		}
		/*
		아스키 코드
		대문자 : 65~90
		소문자 : 97~122  (소문자 32를 뺴면 대문자)
		*/

		for (char c : s.toCharArray()) {
			//소문자일경우
			if(c>=97 && c<=122){
				//대문자로변환
				result+= (char) (c-32);
			}

			//대문자일경우
			else{
				//소문자로변환
				result+= (char) (c+32);
			}
		}
		System.out.println(result);
	}
}
