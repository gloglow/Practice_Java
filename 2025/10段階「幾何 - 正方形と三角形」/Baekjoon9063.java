package JavaPrac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon9063 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		
		int mostLeft = 10000;
		int mostRight = -10000;
		int mostDown = 10000;
		int mostUp = -10000;
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			if(x>mostRight) mostRight = x;
			if(x<mostLeft) mostLeft = x;
			if(y>mostUp) mostUp = y;
			if(y<mostDown) mostDown = y;
		}
		System.out.println((mostRight - mostLeft)*(mostUp - mostDown));
	}

}
