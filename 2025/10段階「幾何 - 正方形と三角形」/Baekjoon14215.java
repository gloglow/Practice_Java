package JavaPrac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Baekjoon14215 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		ArrayList<Integer> nlist = new ArrayList<Integer>();
		
		for(int i = 0; i<3; i++) {
			nlist.add(Integer.parseInt(st.nextToken()));
		}
		
		Collections.sort(nlist);
		
		if(nlist.get(2) >= nlist.get(0) + nlist.get(1)) {
			nlist.set(2, nlist.get(0) + nlist.get(1) - 1);
		}
		
		System.out.println(nlist.get(0) + 
				nlist.get(1) +
				nlist.get(2));
	}
}
