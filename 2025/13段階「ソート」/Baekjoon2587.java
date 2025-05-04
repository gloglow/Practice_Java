package JavaPrac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Baekjoon2587 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		ArrayList<Integer> aList = new ArrayList<Integer>();
		float sum = 0;
		
		for(int i=0; i<5; i++) {
			st = new StringTokenizer(br.readLine());
			int tmp = Integer.parseInt(st.nextToken());
			aList.add(tmp);
			sum += tmp;
		}
		
		Collections.sort(aList);
		System.out.println(Math.round(sum / 5f));
		System.out.println(aList.get(2));
		
	}
}
