package com.codingTest.inflearn.exam0104;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String result = "";

		int N = Integer.parseInt(br.readLine());
		String[] str = new String[N];

		for(int i=0; i<N; i++){
			str[i] = br.readLine();
		}

		for(String x : solution(str)){
			System.out.println(x);
		}
	}

	public static ArrayList<String> solution(String[] str){
		ArrayList<String> answer = new ArrayList<>();
		for(String x : str){

			//String builder reverse 이용
//			String tmp = new StringBuilder(x).reverse().toString();
//			answer.add(tmp);

			//char
			char[] s = x.toCharArray();
			int lt=0, rt=x.length()-1;
			while(lt<rt){
				char tmp = s[lt];
				s[lt] = s[rt];
				s[rt] = tmp;
				lt++;
				rt--;
			}
			String tmp = String.valueOf(s);
			answer.add(tmp);

		}
		return answer;
	}
}
