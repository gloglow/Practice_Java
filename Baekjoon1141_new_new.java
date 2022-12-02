//BAEKJOON  PROBLEM - https://www.acmicpc.net/problem/1141
//20221202
package java_practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Stack;

public class Baekjoon1141_new_new {
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n=Integer.parseInt(br.readLine());
		HashSet<String> wordlist=new HashSet<String>();
		Stack tmp=new Stack();
		ArrayList count=new ArrayList();
		int max=0;
		
		for(int i=0; i<n; i++) {
			wordlist.add(br.readLine());
		}
		
		for(int i=0; i<(Math.pow(2, n)-1); i++) {
			//bw.write(count.get(i)+"\n");
			if(max<(int)(count.get(i)))
				max=(int)count.get(i);
		}
		
		bw.write(""+max);
		
		bw.flush();
		br.close();
		bw.close();
	}

}
