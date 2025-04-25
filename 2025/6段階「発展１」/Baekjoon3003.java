package JavaPrac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon3003 {

	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] complete = new int[6];
		int[] pieces = new int[6];
		
		complete[0] = 1;
		complete[1] = 1;
		complete[2] = 2;
		complete[3] = 2;
		complete[4] = 2;
		complete[5] = 8;
		
		for(int i=0; i<6; i++) {
			pieces[i] = Integer.parseInt(st.nextToken());
			pieces[i] = complete[i] - pieces[i];
		}
		
		for(int i=0; i<6; i++) {
			System.out.print(pieces[i] + " ");
		}
	}
}
