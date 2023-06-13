package com.codingTest.inflearn.exam0102;

import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		System.out.print(solution(str));
	}


	public static String solution(String str){
		String answer = "";

		for (char x : str.toCharArray()) {
			//소문자면 대문자로 변환
			if(Character.isLowerCase(x)){
				answer+=Character.toUpperCase(x);
			}else{
				//대문자면 소문자로 변환
				answer+=Character.toLowerCase(x);
			}
		}

		return answer;
	}
}
