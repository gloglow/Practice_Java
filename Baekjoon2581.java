//BAEKJOON  PROBLEM - https://www.acmicpc.net/problem/2581
//20221106

package java_practice;
import java.util.Scanner;
public class Baekjoon2581 {
	static boolean prime_check(int n) {
		if (n==1) return false;
		else if(n==2) return true;
		for (int i=2; i<(n/2+1); i++) {
			if(n%i==0) return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int m=s.nextInt();
		int n=s.nextInt();
		int min=10000;
		int sum=0;
		for (int i=m; i<n+1; i++) {
			if (prime_check(i)) {
				if (min>i) min=i;
				sum+=i;
			}
		}
		if(min==10000) System.out.println(-1);
		else {
			System.out.printf("%d\n%d", sum, min);
		}
	}

}
