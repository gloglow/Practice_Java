package JavaPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon9086 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		for(int i = 0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			String str = st.nextToken();
			System.out.print(str.charAt(0));
			System.out.println(str.charAt(str.length()-1));
		}
	}
}
