//BAEKJOON  PROBLEM - https://www.acmicpc.net/problem/3460
//20221027
package java_practice;
import java.util.*;
public class Baekjoon3460 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		for(int i=0; i<t; i++) {
			int n=s.nextInt();
			String str=Integer.toBinaryString(n);
			for (int j=0;j<str.length();j++) {
				if(str.charAt(str.length()-j-1)=='1') {
					System.out.printf("%d",j);
					System.out.printf(" ");
				}
			}
		}
	}
}
