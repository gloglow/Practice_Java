//BAEKJOON  PROBLEM - https://www.acmicpc.net/problem/2751
//20221118
package java_practice;
import java.io.*;
import java.util.Arrays;
public class Baekjoon2751 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n=Integer.parseInt(br.readLine());
		int[] nlist=new int[n];
		for (int i=0; i<n; i++) {
			nlist[i]=Integer.parseInt(br.readLine());
		}
		Arrays.sort(nlist);
		for (int i=0; i<n; i++) {
			bw.write(nlist[i]+"\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}

}
