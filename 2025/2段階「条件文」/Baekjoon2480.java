package JavaPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon2480 {

	public static void main(String[] args) throws IOException {
		int h, m, t;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		h = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		t = Integer.parseInt(st.nextToken());

		m += t;
		while (m >= 60) {
			h++;
			m -= 60;
		}
		while (h >= 24) {
			h -= 24;
		}
		System.out.printf("%d %d", h, m);
	}

}