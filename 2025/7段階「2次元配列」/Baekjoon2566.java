package JavaPrac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon2566 {

	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int row = 1;
		int column = 1;
		int max = 0;
		
		for(int i=0; i<9; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<9; j++) {
				int tmp = Integer.parseInt(st.nextToken());
				if(tmp > max) {
					max = tmp;
					row = i+1;
					column = j+1;
				}
			}
		}
		
		System.out.println(max);
		System.out.println(row + " " + column);
	}
}
