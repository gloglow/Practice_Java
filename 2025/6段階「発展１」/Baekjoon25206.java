package JavaPrac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon25206 {

	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		float totalCredit = 0; // 총 학점
		float totalScore = 0; // 총 평점
		
		for(int i=0; i<20; i++) {
			st = new StringTokenizer(br.readLine());
			String tmpStr = st.nextToken();
			
			float credit = Float.parseFloat(st.nextToken()); // 학점
			String score = st.nextToken();
			float floatScore = 0; // 평점
			
			switch(score) {
			case "A+":
				floatScore = 4.5f;
				break;
			case "A0":
				floatScore = 4.0f;
				break;
			case "B+":
				floatScore = 3.5f;
				break;
			case "B0":
				floatScore = 3.0f;
				break;
			case "C+":
				floatScore = 2.5f;
				break;
			case "C0":
				floatScore = 2.0f;
				break;
			case "D+":
				floatScore = 1.5f;
				break;
			case "D0":
				floatScore = 1.0f;
				break;
			case "P":
				totalCredit -= credit;
				break;
			case "F":
				break;
			}
			
			totalCredit += credit;
			
			floatScore *= credit;
			totalScore += floatScore;
		}
		
		float result = totalScore / totalCredit;
		System.out.println(result); 
	}
}
