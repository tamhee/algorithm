package problems02.run;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = kb.nextInt();
		}
		System.out.print(T.solution(n, arr));
	}
	
	public int solution(int n, int[] arr){
		int answer = 1;
		int max = arr[0];
		
		for(int i=1; i<n; i++) {
			if(arr[i]> max) {
				answer++;
				max = arr[i];
			}
			
		}
		
		
		return answer;
	}

}
