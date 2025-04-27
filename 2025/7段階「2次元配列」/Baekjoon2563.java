package JavaPrac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon2563 {

	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		boolean[][] background = new boolean[100][100];
		int cnt = 0;
		
		for(int i=0; i<100; i++) {
			for(int j=0; j<100; j++) {
				background[i][j] = false;
			}
		}
		
		int n = Integer.parseInt(st.nextToken());
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			for(int j=0; j<10; j++) {
				for(int k=0; k<10; k++) {
					background[x+j][y+k] = true;
				}
			}
		}
		
		for(int i=0; i<100; i++) {
			for(int j=0; j<100; j++) {
				if(background[i][j] == true)
					cnt++;
			}
		}
		
		System.out.println(cnt);
	}
}
