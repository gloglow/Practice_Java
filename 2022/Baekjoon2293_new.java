//BAEKJOON  PROBLEM - https://www.acmicpc.net/problem/2293
//20221124
package java_practice;
import java.io.*;

public class Baekjoon2293_new {
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] tmp=new String[2];
		tmp=br.readLine().split(" ");
		int n=Integer.parseInt(tmp[0]);
		int k=Integer.parseInt(tmp[1]);
		int[] coins=new int[n];
		int[] sumlist=new int[100000];
		sumlist[0]=1;
		
		for(int i=0; i<n; i++)
			coins[i]=Integer.parseInt(br.readLine());

		for(int i=0; i<n; i++) {
			for(int j=coins[i]; j<=k; j++) {
				sumlist[j]+=sumlist[j-coins[i]];
			}
		}
		
		bw.write(""+sumlist[k]);
		bw.flush();
		bw.close();
	}
}