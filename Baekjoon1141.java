//BAEKJOON  PROBLEM - https://www.acmicpc.net/problem/1141
//20221129
package java_practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Stack;

public class Baekjoon1141 {
	static int calculating(Stack tmp) {
		for(int i=0; i<tmp.size(); i++) {
			for(int j=0; j<tmp.size(); j++) {
				if(i==j) continue;
				if(((String)tmp.elementAt(j)).startsWith((String)tmp.elementAt(i)))
					return 0;
			}
		}
		return tmp.size();
	}
	static void add(String[] wordlist, Stack tmp, ArrayList count, int wlpos) {
		if(wlpos==wordlist.length) {
			count.add(calculating(tmp));
			return;
		}
		tmp.push(wordlist[wlpos]);
		wlpos++;
		add(wordlist, tmp, count, wlpos);
		tmp.pop();
		add(wordlist, tmp, count, wlpos);
	}
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n=Integer.parseInt(br.readLine());
		String[] wordlist=new String[n];
		Stack tmp=new Stack();
		ArrayList count=new ArrayList();
		int max=0;
		
		for(int i=0; i<n; i++) {
			wordlist[i]=br.readLine();
		}
		
		add(wordlist, tmp, count, 0);
		
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
