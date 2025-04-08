//BAEKJOON  PROBLEM - https://www.acmicpc.net/problem/2667
//20221128
package java_practice;
import java.io.*;
import java.util.Arrays;

public class Baekjoon2667 {
	static int[][] searching(char[][] board, int[][] board_check, int[] block_list, int pos, int i, int j){
		block_list[pos]++;
		board_check[i][j]=1;
		if(i>0&&board_check[i-1][j]==0&&board[i-1][j]=='1')
			board_check=searching(board, board_check, block_list, pos, i-1, j);
		if(i<board.length-1&&board_check[i+1][j]==0&&board[i+1][j]=='1')
			board_check=searching(board, board_check, block_list, pos, i+1, j);
		if(j>0&&board_check[i][j-1]==0&&board[i][j-1]=='1')
			board_check=searching(board, board_check, block_list, pos, i, j-1);
		if(j<board.length-1&&board_check[i][j+1]==0&&board[i][j+1]=='1')
			board_check=searching(board, board_check, block_list, pos, i, j+1);
		return board_check;
	}
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

		int n=Integer.parseInt(br.readLine());
		char[][] board=new char[n][n];
		int[][] board_check=new int[n][n]; // 탐색했는지아닌지 체크
		int block_count=0; // 총 단지 수 
		int[] block_list=new int[2000]; // 단지당 아파트 수
		int pos=0; // block_list 기록용. 몇번째 단지인지
		String tmp;
		
		for(int i=0; i<n; i++) { // 입력
			tmp=br.readLine();
			for(int j=0; j<n; j++)
				board[i][j]=tmp.charAt(j);
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(board_check[i][j]==0&&board[i][j]=='1') {
					block_count++;
					board_check=searching(board, board_check, block_list, pos, i, j);
					pos++;
				}
			}
		}
		
		int[] sorting=new int[pos];
		System.arraycopy(block_list, 0, sorting, 0, pos);
		Arrays.sort(sorting);
		
		bw.write(block_count+"\n");
		for(int i=0; i<pos; i++)
			bw.write(sorting[i]+"\n");
		bw.flush();
		bw.close();
		br.close();	
	}
}
