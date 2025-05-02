package JavaPrac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;

public class Baekjoon19532 {

	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		int e = Integer.parseInt(st.nextToken());
		int f = Integer.parseInt(st.nextToken());
		
		int x;
		int y;
		boolean flag = false;
		
		for(x=-999; x<=999; x++) {
			for(y=-999; y<=999; y++) {
				if(a*x + b*y == c && d*x + e*y == f) {
					System.out.println(x + " " + y);
					flag = true;
					break;
				}
			}
			if(flag)
				break;
			
		}
	}
}
