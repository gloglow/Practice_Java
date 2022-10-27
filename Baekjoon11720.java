//BAEKJOON  PROBLEM - https://www.acmicpc.net/problem/11720
//20221027
package java_practice;
import java.util.*;
public class Baekjoon11720 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int sum=0;
		String str=s.next();
		for(int i=0; i<n; i++) {
			sum+=str.charAt(i)-48;
		}
		System.out.print(sum);
	}
}
