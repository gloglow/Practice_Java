//BAEKJOON  PROBLEM - https://www.acmicpc.net/problem/2501
//20221027
package java_practice;
import java.util.*;
public class Baekjoon2501 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int k=s.nextInt();
		int cnt=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				cnt++;
				if(cnt==k) {
					System.out.printf("%d", i);
					System.exit(0);
				}
			}
		}
		System.out.println(0);
	}
}
