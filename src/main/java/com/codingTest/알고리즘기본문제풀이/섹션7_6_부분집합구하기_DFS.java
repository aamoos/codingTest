package com.codingTest.알고리즘기본문제풀이;

public class 섹션7_6_부분집합구하기_DFS {
    static int n;
    static int[] ch;
    public static void DFS(int L){
        if(L==n+1){
            String tmp = "";
            for(int i=1; i<=n; i++){
                if(ch[i] == 1){
                    tmp = tmp+(i+" ");
                }
            }

            if(tmp.length() > 0){
                System.out.println(tmp);
            }

        }else{
            ch[L] = 1;
            DFS(L+1);       //왼쪽(사용한다)
            ch[L] = 0;
            DFS(L+1);       //오른쪽(사용안한다)
        }

    }

    public static void main(String[] args) {
        n = 3;
        ch = new int[n+1];
        DFS(1);
    }
}
