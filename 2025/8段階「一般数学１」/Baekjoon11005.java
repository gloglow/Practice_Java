package JavaPrac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon11005 {

	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		int x, y;
		x = n;
		
		String str = "";
		
		while(x > 0) {
			y = x % b;
			x /= b;
			
			if(y >= 10) {
				char ch = (char)(55 + y);
				str+=ch;
			}
			else {
				str += y;
			}
			
			if(x == 1) {
				str += '1';
				break;
			}
		}

		for(int i=0; i<str.length(); i++) {
			System.out.print(str.charAt(str.length() - i - 1));
		}
	}
}
