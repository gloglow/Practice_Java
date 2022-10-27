//BAEKJOON  PROBLEM - https://www.acmicpc.net/problem/2750
//20221027
package java_practice;
import java.util.*;
public class Baekjoon2750 {	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int [] nlist=new int[n];
		for(int i=0; i<n; i++) {
			nlist[i]=s.nextInt();
		}
		Arrays.sort(nlist);
		for(int i=0; i<n; i++)
			System.out.println(nlist[i]);
	}
}
