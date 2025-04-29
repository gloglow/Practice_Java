package JavaPrac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon5073 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int a, b, c;
		int sum;
		String str;
		
		do {
			st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			c = Integer.parseInt(st.nextToken());
			sum = a + b + c;
			
			if(a == 0 || b == 0 || c == 0) break;
			
			if(a == b) {
				if(a == c) {
					str = "Equilateral";
				}
				else {
					str = "Isosceles";
				}
			}
			else {
				if(a == c) {
					str = "Isosceles";
				}
				else if(b == c) {
					str = "Isosceles";
				}
				else {
					str = "Scalene";
				}
			}
			
			if(sum - a <= a || sum - b <= b || sum - c <= c)
				str = "Invalid";
			
			System.out.println(str);
		}while(true);
	}

}
