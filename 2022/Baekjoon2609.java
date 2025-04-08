//BAEKJOON  PROBLEM - https://www.acmicpc.net/problem/2609
//20221029
package java_practice;
import java.util.*;
public class Baekjoon2609 {
	static int find_gcd(int a, int b) {
		int gcd=a;
		while(gcd>0) {
			if(a%gcd==0&&b%gcd==0)
				return gcd;
			gcd--;
		}
		return 0;
	}
	static int find_lcm(int a, int b) {
		int lcm=a;
		while(true) {
			if(lcm%a==0&&lcm%b==0)
				return lcm;
			lcm++;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		
		int gcd;
		int lcm;
		
		gcd=find_gcd(a,b);
		lcm=find_lcm(a,b);
		
		System.out.println(gcd);
		System.out.println(lcm);
	}
}
