//BAEKJOON  PROBLEM - https://www.acmicpc.net/problem/1141
//20221129
package java_practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Baekjoon1141_new {
	static int calculating(ArrayList subset) {
		for(int i=0; i<subset.size(); i++) {
			for(int j=0; j<subset.size(); j++) {
				if(i==j) continue;
				if(((String)subset.get(j)).startsWith((String)subset.get(i)))
					return 0;
			}
		}
		return subset.size();
	}
	static void combination(String[] wordlist, boolean[] visited, int start, int r, ArrayList count) {
		if(r==0) {
			ArrayList<String> tmp=new ArrayList<String>(0);
			for(int i=0; i<wordlist.length; i++) {
				if(visited[i])
					tmp.add(wordlist[i]);
			}
			count.add(calculating(tmp));
			return;
		}
		for(int i=start; i<wordlist.length; i++) {
			visited[i]=true;
			combination(wordlist, visited, i+1, r-1, count);
			visited[i]=false;
		}
	}
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n=Integer.parseInt(br.readLine());
		String[] wordlist=new String[n];
		ArrayList<Integer> count=new ArrayList<Integer>();
		boolean[] visited=new boolean[n];
		int max=0;
		
		for(int i=0; i<n; i++) {
			wordlist[i]=br.readLine();
		}
		br.close();
		for(int i=1; i<=n; i++)
			combination(wordlist, visited, 0, i, count);
		
		for(int i=0; i<(Math.pow(2, n)-1); i++) {
			if(max<(int)(count.get(i)))
				max=(int)count.get(i);
		}
		
		bw.write(""+max);
		
		bw.flush();

		bw.close();
	}

}
