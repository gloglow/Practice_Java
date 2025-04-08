//BAEKJOON  PROBLEM - https://www.acmicpc.net/problem/1181
//20221114
package java_practice;
import java.io.*;
public class Baekjoon1181 {
	static int compare_word(String a, String b) { // 0이면 a가 앞, 1이면 b가 앞
		if(b==null)
			return 0;
		if (a.length()<b.length())
			return 0;
		else if (a.length()>b.length())
			return 1;
		else {
			for (int i=0; i<a.length(); i++) {
				if (a.charAt(i)<b.charAt(i))
					return 0;
				else if (a.charAt(i)>b.charAt(i))
					return 1;
			}
			return 2;
		}
	}
	static int trimming(int n, int j, String[] wlist) {
		for (int i=j; i<n-1; i++) {
			wlist[i]=wlist[i+1];
		}
		wlist[n-1]=null;
		n--;
		return n;
	}
	static int sorting(int n, String[] wlist) {
		String tmp;
		int result;
		int end=n;
		for (int i=0; i<n-1; i++) {
			for (int j=0; j<end-1; j++) {
				result=compare_word(wlist[j], wlist[j+1]);
				if(result==0)
					continue;
				else if(result==1){
					tmp=wlist[j];
					wlist[j]=wlist[j+1];
					wlist[j+1]=tmp;
					if(j>0&&compare_word(wlist[j-1], wlist[j])==2) {
						n=trimming(n, j-1, wlist);
						end--;
						j--;
					}
				}
				else if(result==2) {
					while(n!=1&&result==2) {
						n=trimming(n, j, wlist);
						end--;
						result=compare_word(wlist[j], wlist[j+1]);
					}
					j--;
				}
			}
			end--;
		}
		return n;
	}
	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader (System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n=Integer.parseInt(br.readLine());
		String[] wlist=new String[20001];
		for (int i=0; i<n; i++) {
			wlist[i]=br.readLine();
		}
		n=sorting(n, wlist);
		for (int i=0; i<n; i++) {
			bw.write(wlist[i]+"\n");
		}
		bw.flush();
		br.close();
		bw.close();
	}
}
