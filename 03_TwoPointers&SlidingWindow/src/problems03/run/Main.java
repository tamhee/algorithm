package problems03.run;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int k = kb.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = kb.nextInt();
			
		}
		
		System.out.print(T.solution(n, k, arr));
		
		
	}
	
	public int solution(int n, int k, int[] arr) {
		int answer = 0, sum = 0;
		
		for(int i = 0; i<k; i++) {
			sum += arr[i];
		}
		
		answer=sum;
		
		for(int i=k; i<n; i++) {
			sum += (arr[i] - arr[i-k]);
			answer = Math.max(sum, answer);
		}
		
		return answer;
		
		
	}

}
