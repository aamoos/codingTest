package com.codingTest.practice.exam0102;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* lowerCase, UpperCase */
public class Main2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a = br.readLine();
		System.out.print(solution(a));
	}

	public static String solution(String a){
		String result = "";
		//toCharArray
		for (char c : a.toCharArray()) {

			//소문자인경우 대문자변환
			if(c>=97 && c<=122){
				result+= (char) (c-32);
			}else{
				//대문자인경우 소문자 변환
				result+= (char) (c+32);
			}
		}
		return result;
	}
}
