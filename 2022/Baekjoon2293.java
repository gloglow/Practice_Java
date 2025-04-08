//BAEKJOON  PROBLEM - https://www.acmicpc.net/problem/2293
//20221123
package java_practice;
import java.io.*;

public class Baekjoon2293 {
	static int calculating(int[] coins, int k, int pos) {
		if(k==0)
			return 1;
		if(k<0||pos>=coins.length||k<coins[pos])
			return 0;
		int rst=0;
		int tmp;
		for(int i=0; i<=k/coins[pos]; i++) {
			tmp=calculating(coins, k-(coins[pos]*i), pos+1);
			rst+=tmp;
		}
		return rst;
	}
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] tmp=new String[2];
		tmp=br.readLine().split(" ");
		int n=Integer.parseInt(tmp[0]);
		int k=Integer.parseInt(tmp[1]);
		int[] coins=new int[n];
		
		for(int i=0; i<n; i++)
			coins[i]=Integer.parseInt(br.readLine());

		int rst=calculating(coins, k, 0);
		bw.write(""+rst);
		bw.flush();
		bw.close();
	}
}
