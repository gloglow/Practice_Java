package JavaPrac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon10101 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int[] angles = new int[3];
		String str;
		
		for(int i=0; i<3; i++) {
			st  = new StringTokenizer(br.readLine());
			angles[i] = Integer.parseInt(st.nextToken());
		}
		
		if(angles[0] == angles[1]) {
			if(angles[1] == angles[2]) {
				str = "Equilateral";
			}
			else {
				str = "Isosceles";
			}
		}
		else {
			if(angles[1] == angles[2]) {
				str = "Isosceles";
			}
			else if(angles[0] == angles[2]) {
				str = "Isosceles";
			}
			else {
				str = "Scalene";
			}
		}
		if(angles[0] + angles[1] + angles[2] != 180) {
			str = "Error";
		}
		
		System.out.println(str);
	}

}
