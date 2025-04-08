//BAEKJOON  PROBLEM - https://www.acmicpc.net/problem/1789
//20221121
package java_practice;
import java.io.*;

public class Baekjoon1789 {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		long s=Long.parseLong(br.readLine());
		int n=1;
		while(s>=0) {
			s-=n;
			n++;
		}
		bw.write(""+(n-2));
		bw.flush();
		br.close();
		bw.close();
	}

}
