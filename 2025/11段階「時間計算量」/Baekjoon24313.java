package JavaPrac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon24313 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		float a1 = Float.parseFloat(st.nextToken());
		float a0 = Float.parseFloat(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		float c = Float.parseFloat(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		float n0 = Float.parseFloat(st.nextToken());
		
		if(c-a1 == 0) {
			if(a0 <= 0)
				System.out.println(1);
			else 
				System.out.println(0);
		}
		else if(c-a1 > 0) {
			if(n0 >= (a0 / (c-a1))){
				System.out.println(1);
			}
			else
				System.out.println(0);
		}
		else {
			System.out.println(0);
			
		}
		
	}
}
