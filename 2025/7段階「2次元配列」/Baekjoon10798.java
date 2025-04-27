package JavaPrac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon10798 {

	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		char[][] mat = new char[5][15];
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<15; j++) {
				mat[i][j] = '가';
			}
		}
		
		for(int i=0; i<5; i++) {
			st = new StringTokenizer(br.readLine());
			String str = st.nextToken();
			for(int j=0; j<str.length(); j++) {
				mat[i][j] = str.charAt(j);
			}
		}
		
		for(int i=0; i<15; i++) {
			for(int j=0; j<5; j++) {
				if(mat[j][i] != '가') {
					System.out.print(mat[j][i]);
				}
			}
		}
	}
}
