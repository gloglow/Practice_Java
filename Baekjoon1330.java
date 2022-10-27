//BAEKJOON  PROBLEM - https://www.acmicpc.net/problem/1000
//20221027

package java_practice;
import java.util.*;

public class Baekjoon1330 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		if(a>b) {
			System.out.println(">");
		}else if(a<b) {
			System.out.println("<");
		}else {
			System.out.println("==");
		}
	}

}
