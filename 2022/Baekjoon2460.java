//BAEKJOON  PROBLEM - https://www.acmicpc.net/problem/2460
//20221027
package java_practice;
import java.util.*;
public class Baekjoon2460 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nperson=0;
		int max=0;
		Scanner s=new Scanner(System.in);
		for(int i=0; i<10; i++) {
			nperson-=s.nextInt();
			nperson+=s.nextInt();
			if(nperson>max)
				max=nperson;
		}
		System.out.printf("%d", max);
	}
}
