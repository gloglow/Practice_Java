//BAEKJOON  PROBLEM - https://www.acmicpc.net/problem/3085
//20221123
package java_practice;
import java.io.*;

public class Baekjoon3085 {
	static int what_is_max(int a, int b, int c, int d) {
		if(a<b)
			a=b;
		if(a<c)
			a=c;
		if(a<d)
			a=d;
		return a;
	}/*
	static int count_candy(char[][] board, int n, char color) {
		for (int i=0; i<n; i++) {
			
		}
	}*/
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n=Integer.parseInt(br.readLine());
		char [][] board=new char[n][n];
		String tmp;
		
		for (int i=0; i<n; i++) {
			tmp=br.readLine();
			for (int j=0; j<n; j++) {
				board[i][j]=tmp.charAt(j);
			}
		}
		
		int max=what_is_max(count_candy(board, n, 'C')
				,count_candy(board, n, 'P')
				,count_candy(board, n, 'Z')
				,count_candy(board, n, 'Y'));
		
		bw.flush();
		bw.close();
		br.close();
	}

}
