//BAEKJOON  PROBLEM - https://www.acmicpc.net/problem/2309
//20221027
package java_practice;
import java.util.*;
public class Baekjoon2309 {	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int[] dwarf=new int[9];
		for(int i=0; i<9; i++) {
			dwarf[i]=s.nextInt();
		}
		Arrays.sort(dwarf);
		int sum=0;
		for(int i=0; i<9; i++) {
			sum+=dwarf[i];
		}
		int sum_tmp=sum;
		for(int i=0; i<9; i++) {
			sum_tmp=sum;
			sum_tmp-=dwarf[i];
			for(int j=i+1; j<9; j++) {
				if(sum_tmp-dwarf[j]==100) {
					for(int k=0; k<9; k++) {
						if(k!=i&&k!=j)
							System.out.printf("%d\n", dwarf[k]);
					}
					System.exit(0);
				}
			}
		}
	}
}
