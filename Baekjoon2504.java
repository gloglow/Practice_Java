//BAEKJOON  PROBLEM - https://www.acmicpc.net/problem/2504
//20221202
package java_practice;

import java.io.*;
import java.util.Stack;

public class Baekjoon2504 {
	static int cal(String str) {
		Stack<Character> st1=new Stack<>();
		Stack<Character> st2=new Stack<>();
		int rst=0;
		int tmp=1;
		for(int i=0; i<str.length(); i++)
			st1.push(str.charAt(i));
		st2.push(st1.pop());
		while(!st1.empty()) {
			if(st2.empty())
				st2.push(st1.pop());
			if((st2.peek()==')'&&st1.peek()=='(')
					||(st2.peek()==']'&&st1.peek()=='[')) {
				if(st2.peek()==')')
					tmp*=2;
				else
					tmp*=3;
				st2.pop();
				st1.pop();
			}
			else {
				if(!st1.empty())
					st2.push(st1.pop());
			}
			if(st2.empty()) {
				rst+=tmp;
				tmp=1;
			}
		}
		return rst;
	}
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		String str=br.readLine();
		int rst=0;

		rst=cal(str);
		
		bw.write(""+rst);
		bw.flush();
		bw.close();
		br.close();
	}

}
