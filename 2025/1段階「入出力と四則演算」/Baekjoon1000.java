package Practice_Java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon1000 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer sTokenizer = new StringTokenizer(bReader.readLine());
		
		int n, m;
		
		n = Integer.parseInt(sTokenizer.nextToken());
		m = Integer.parseInt(sTokenizer.nextToken());
		
		System.out.println(n+m);
	}

}
