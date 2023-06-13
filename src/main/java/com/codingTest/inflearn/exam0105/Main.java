package com.codingTest.inflearn.exam0105;

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
		String answer = "";
		char[] s = str.toCharArray();
		int lt = 0, rt = s.length-1;

		while(lt < rt){

			//알파벳이 아닐경우
			if(!Character.isAlphabetic(s[lt])){
				lt++;
			} else if(!Character.isAlphabetic(s[rt])){
				rt--;
			} else{
				char tmp = s[lt];
				s[lt] = s[rt];
				s[rt] = tmp;
				lt++;
				rt--;
			}
		}
		answer = String.valueOf(s);
		return answer;
	}
}
