//BAEKJOON  PROBLEM - https://www.acmicpc.net/problem/10818
//20221027
package java_practice;
import java.util.*;
public class Baekjoon10818 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int input;
		int min=1000000;
		int max=-1000000;
		for(int i=0; i<n; i++) {
			input=s.nextInt();
			if(input<min) min=input;
			if(input>max) max=input;
		}
		System.out.printf("%d %d", min, max);
	}
}
