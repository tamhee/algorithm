package problems06.run;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) arr[i] = kb.nextInt();
		System.out.println(T.solution(n, arr));
	}
	
	public ArrayList<Integer> solution(int n, int[] arr){
		ArrayList<Integer> answer = new ArrayList<>();
		int[] tmp = arr.clone(); //���� ����
		Arrays.sort(tmp); //������ tmp �� arr ��
		
		for(int i=0; i<n; i++) {
			if(arr[i] != tmp[i]) answer.add(i+1);
		}
		
		
		return answer;
	}

}
