//BAEKJOON  PROBLEM - https://www.acmicpc.net/problem/2693
//20221103
package java_practice;
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon2693 {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t=Integer.parseInt(br.readLine());
		int[] nlist=new int[10];
		for(int i=0; i<t; i++) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			for(int j=0; j<10; j++) {
				nlist[j]=Integer.parseInt(st.nextToken());
			}
			Arrays.sort(nlist);
			bw.write(nlist[7]+"\n");
		}
		bw.close();
		br.close();
	}
}
