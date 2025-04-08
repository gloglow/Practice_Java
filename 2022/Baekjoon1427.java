//BAEKJOON  PROBLEM - https://www.acmicpc.net/problem/1292
//20221117
package java_practice;

import java.io.*;
import java.util.Arrays;

public class Baekjoon1427 {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		String num=br.readLine();
		int[] nlist=new int[10];
		for (int i=0; i<num.length(); i++) {
			nlist[i]=num.charAt(i)-'0';
		}
		Arrays.sort(nlist);
		for (int i=0; i<num.length(); i++) {
			bw.write(""+nlist[nlist.length-i-1]);
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
