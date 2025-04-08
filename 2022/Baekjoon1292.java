//BAEKJOON  PROBLEM - https://www.acmicpc.net/problem/1292
//20221104

package java_practice;
import java.io.*;
public class Baekjoon1292 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String tmp[]=br.readLine().split(" ");
		int start=Integer.parseInt(tmp[0]);
		int end=Integer.parseInt(tmp[1]);
		
		int[] nlist=new int[1000];
		int num=1;
		int cnt=1;
		int sum=0;
		
		for(int i=0; i<nlist.length; i++) {
			nlist[i]=num;
			if(num==cnt) {
				cnt=1;
				num++;
			}
			else {
				cnt++;
			}
		}
		
		
		for(int i=start-1; i<end; i++) {
			sum+=nlist[i];
		}
		
		System.out.println(sum);
	}

}
