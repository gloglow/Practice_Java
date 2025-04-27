package JavaPrac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon2745 {

	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String str = st.nextToken();
		int n = Integer.parseInt(st.nextToken());
		int sum = 0;
		
		for(int i=0; i<str.length(); i++) {
			int num;
			char tmp = str.charAt(str.length() - i - 1);
			if(tmp >= 'A') {
				num = tmp - 'A' + 10; 
			}
			else {
				num = tmp - '0';
			}
			
			num *= Math.pow(n, i);
			sum += num;
		}
		
		System.out.println(sum);
	}
}
