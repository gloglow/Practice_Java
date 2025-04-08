//BAEKJOON  PROBLEM - https://www.acmicpc.net/problem/1676
//20221122
package java_practice;

import java.io.*;

public class Baekjoon1676 {
	static int factorization(int n, int i) {
		int cnt=0;
		while(true) {
			if(n%i==0) {
				n/=i;
				cnt++;
			}
			else break;
		}
		return cnt;
	}
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n=Integer.parseInt(br.readLine());
		int cnt_2=0;
		int cnt_5=0;
		for (int i=1; i<=n; i++) {
			if(i%2==0)
				cnt_2+=factorization(i, 2);
			if(i%5==0)
				cnt_5+=factorization(i, 5);
		}
		int cnt=(cnt_2<cnt_5)?cnt_2:cnt_5;
		bw.write(""+cnt);
		bw.flush();
		bw.close();
		br.close();
	}

}                  
