//BAEKJOON  PROBLEM - https://www.acmicpc.net/problem/4673
//20221119
package java_practice;
import java.io.*;

public class Baekjoon4673 {
	static int self(int i) {
		int sum=i;
		while(i>0) {
			sum+=i%10;
			i/=10;
		}
		return sum;
	}

	public static void main(String[] args) throws IOException{
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int[] nlist=new int[10000];
		for (int i=0; i<10000; i++)
			nlist[i]=1;
		for (int i=1; i<10000; i++) {
			if(self(i)<10000)
				nlist[self(i)-1]=-1;
		}
		for (int i=0; i<9999; i++) {
			if(nlist[i]==1)
				bw.write((i+1)+"\n");
		}
		bw.flush();
		bw.close();
	}

}
