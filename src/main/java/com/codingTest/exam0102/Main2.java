package com.codingTest.exam0102;

import java.io.IOException;
import java.util.Scanner;

// 아스키 코드
public class Main2 {
	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		System.out.print(solution(str));
	}


	public static String solution(String str){
		String answer = "";

		//ascii 코드
		//대문자는 65~90
		//소문자는 97~122
		// 97-65 = 32 (소문자에서 32빼면 대문자가 됨)

		for (char x : str.toCharArray()) {

			//소문자면 대문자로 변환
			if(x>=97 && x<=122){
				answer+= (char) (x-32);
			}else{
				//대문자면 소문자로 변환
				answer+= (char) (x+32);
			}
		}
		return answer;
	}
}
