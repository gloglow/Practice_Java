package JavaPrac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon10988 {

	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String str = st.nextToken();
		int index = 0;
		
		while(index <= str.length()/2) {
			if(str.charAt(index) != str.charAt(str.length()-index-1)) {
				System.out.println(0);
				return;
			}
			index++;
		}
		System.out.println(1);
	}
}
