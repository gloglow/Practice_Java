//BAEKJOON  PROBLEM - https://www.acmicpc.net/problem/2504
//20221205
package java_practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;

public class Baekjoon2504 {
	static int cal(Deque<Character> str1) {
		Deque<Character>str2=new ArrayDeque<>();
		int tmp=1;
		int rst=0;
		
		while(!str1.isEmpty()) {
			str2.push(str1.pop());
			while(!str1.isEmpty()&&!str2.isEmpty()&&((str1.peek()=='('&&str2.peek()==')')||
					(str1.peek()=='['&&str2.peek()==']'))) {
				str1.pop();
				if(str2.peek()==')')
					tmp*=2;
				else if(str2.peek()==']')
					tmp*=3;
				str2.pop();
				if(!str1.isEmpty()&&(str1.peek()==')'||str1.peek()==']'))
					tmp=tmp+cal(str1);
			}
		}
		rst=tmp;
		while(!str2.isEmpty())
			str1.add(str2.pop());
		return rst;
	}
	
	
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		String str=br.readLine();
		Deque<Character> tmp=new ArrayDeque<>();
		int rst=0;

		for (int i=0; i<str.length(); i++)
			tmp.push(str.charAt(i));
		rst=cal(tmp);
		if(!tmp.isEmpty())
			rst=0;
		
		bw.write(""+rst);
		bw.flush();
		bw.close();
		br.close();
	}

}
