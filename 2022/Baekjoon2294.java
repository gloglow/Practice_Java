//BAEKJOON  PROBLEM - https://www.acmicpc.net/problem/2294
//20221125
package java_practice;
import java.io.*;

public class Baekjoon2294 {

	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] tmp=new String[2];
		tmp=br.readLine().split(" ");
		int n=Integer.parseInt(tmp[0]);
		int k=Integer.parseInt(tmp[1]);
		int[] coins=new int[n];
		int[] coincount=new int[n];
		int[] sumlist=new int[100000];
		int ntmp;
		sumlist[0]=0;
		
		for(int i=0; i<n; i++) {
			coins[i]=Integer.parseInt(br.readLine());
		}
		
		for(int i=0; i<n; i++) {
			for(int j=coins[i]; j<=k; j++) {
				
			}
		}
	}

}
