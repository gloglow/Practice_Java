//BAEKJOON  PROBLEM - https://www.acmicpc.net/problem/2941
//20221120

package java_practice;
import java.io.*;

public class Baekjoon2941 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		String word=br.readLine();
		int rst=word.length();
		for (int i=0; i<word.length(); i++) {
			if(word.charAt(i)=='=') {
				if(word.charAt(i-1)=='c'||word.charAt(i-1)=='s')
					rst--;
				if(word.charAt(i-1)=='z') {
					rst--;
					if(i>=2&&word.charAt(i-2)=='d') {
						rst--;
					}
				}
			}
			if(word.charAt(i)=='-') {
				if(word.charAt(i-1)=='c'||word.charAt(i-1)=='d')
					rst--;
			}
			if(word.charAt(i)=='j') {
				if(i>=1&&(word.charAt(i-1)=='l'||word.charAt(i-1)=='n'))
					rst--;
			}
		}
		
		bw.write(""+rst);
		bw.flush();
		bw.close();
		br.close();
	}

}
