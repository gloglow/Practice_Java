//BAEKJOON  PROBLEM - https://www.acmicpc.net/problem/1292
//20221116

package java_practice;
import java.io.*;

public class Baekjoon1316 {

	static boolean gcheck(String str) {
		if (str.length()<3)
			return true;
		char tmp;
		int pos;
		for (int i=0; i<str.length()-1; i++) {
			pos=i+1;
			while(str.charAt(i)==str.charAt(pos)) {
				pos++;
				i++;
				if(pos>=str.length()-1)
					return true;
			}
			for (int j=pos+1; j<str.length(); j++) {
				if (str.charAt(i)==str.charAt(j))
					return false;
			}
		}
		return true;
	}
	public static void main(String[] args)throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int n;
		int cnt=0;
		n=Integer.parseInt(br.readLine());
		for (int i=0; i<n; i++) {
			if (gcheck(br.readLine()))
				cnt++;
		}
		bw.write(""+cnt);
		br.close();
		bw.flush();
		bw.close();
	}

}
