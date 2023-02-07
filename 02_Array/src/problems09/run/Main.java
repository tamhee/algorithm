package problems09.run;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n= kb.nextInt();
		int[][] arr = new int[n][n];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				arr[i][j] = kb.nextInt();
			}
		}
		
		System.out.print(T.solution(n,arr));
	}
	
	public int solution(int n, int[][] arr) {
		int answer = Integer.MIN_VALUE;
		int sum1, sum2; /*행의합, 열의합*/
		for(int i =0; i<n; i++) {
			sum1=sum2=0;
			for(int j=0; j<n; j++) {
				sum1+=arr[i][j]; /* 행의합 */
				sum2+=arr[j][i]; /* 열의합 */
			}
			answer = Math.max(answer,  sum1);
			answer = Math.max(answer,  sum2);
		}
		
		sum1=sum2=0;
		for(int i=0; i<n; i++) {
			sum1+= arr[i][i];
			sum2+= arr[i][n-i-1];
		}
		answer = Math.max(answer,  sum1);
		answer = Math.max(answer,  sum2);
		
		return answer;
	}

}
