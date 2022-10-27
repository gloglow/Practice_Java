//BAEKJOON  PROBLEM - https://www.acmicpc.net/problem/10870
//20221027
package java_practice;
import java.util.*;
public class Baekjoon10870 {
	public static int fivo(int n) {
		if(n==0)
			return 0;
		else if(n==1)
			return 1;
		return fivo(n-1)+fivo(n-2);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.printf("%d", fivo(n));
	}
}
