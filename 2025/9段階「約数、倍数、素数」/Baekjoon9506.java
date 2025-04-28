package JavaPrac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;

public class Baekjoon9506 {

	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		ArrayList<Integer> aList = new ArrayList<Integer>();
		
		do {
			System.out.print(n);
			int i = 1;
			int sum = 0;
			while(i<n) {
				if(n%i == 0) {
					sum += i;
					aList.add(i);
				}
				i++;
			}
			if(sum == n) {
				System.out.print(" = ");
				Iterator<Integer> aIt = aList.iterator();
				for(int j=0; j<aList.size() - 1; j++) {
					System.out.print(aIt.next() + " + ");
				}
				System.out.print(aIt.next());
			}
			else {
				System.out.print(" is NOT perfect.");
			}
			System.out.println();
			st = new StringTokenizer(br.readLine());
			n = Integer.parseInt(st.nextToken());
			aList.clear();

		}while(n != -1);
	}
}
