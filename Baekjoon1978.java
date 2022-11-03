//BAEKJOON  PROBLEM - https://www.acmicpc.net/problem/1978
//20221103

package java_practice;
import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon1978 {
	static boolean Prime_check(int n) {
		if (n==1) return false;
		for (int i=2; i<n; i++) {
			if (n%i==0) return false;
		}
		return true;
	}
	public static void main(String[] args)throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n;
		int cnt=0;
		n=Integer.parseInt(br.readLine());
		StringTokenizer st=new StringTokenizer(br.readLine());
		for (int i=0; i<n; i++) {
			if(Prime_check(Integer.parseInt(st.nextToken()))) cnt++;
		}
		bw.write(cnt+"");
		bw.flush();
		br.close();
		bw.close();
	}

}
