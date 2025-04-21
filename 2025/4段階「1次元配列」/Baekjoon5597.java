package JavaPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.StringTokenizer;

public class Baekjoon5597 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		HashSet<Integer> students = new HashSet<Integer>();
		
		for(int i=0; i<30; i++) {
			students.add(i+1);
		}
		
		for(int i=0; i<28; i++) {
			st = new StringTokenizer(br.readLine());
			students.remove(Integer.parseInt(st.nextToken()));
			
		}
		
		Iterator<Integer> it = students.iterator();
		int a = it.next();
		int b = it.next();
		
		if(a < b) {
			System.out.println(a);
			System.out.println(b);
		}
		else {
			System.out.println(b);
			System.out.println(a);
		}
	}

}
