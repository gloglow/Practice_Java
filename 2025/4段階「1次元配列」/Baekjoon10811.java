package JavaPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon10811 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[] basket = new int[n];
		int[] tmpArr = new int[n];
		
		for(int i=1; i<n+1; i++) {
			basket[i-1] = i;
			tmpArr[i-1] = i;
		}
		
		for(int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			
			for(int j=start - 1; j<end; j++) {
				basket[j] = tmpArr[end - j + start - 2];
			}
			
			for(int j=0; j<basket.length; j++) {
				tmpArr[j] = basket[j];
			}
		}
		
		for(int i=0; i<basket.length; i++) {
			System.out.print(basket[i] + " ");
		}
	}
}
