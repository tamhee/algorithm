package problems10.run;

import java.util.Scanner;

public class Tamhee {
	
	public static void main(String[] args) {
		Tamhee T = new Tamhee();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		char m = kb.next().charAt(0);
		for(int x : (T.solution(str, m))) {
			System.out.print(x + " ");
		}
	}
	
	public int[] solution(String str, char m) {
		int[] answer = new int[str.length()];
		int p = 1000;
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)==m) {
				p = 0;
				answer[i] = p;
			}else {
				p++;
				answer[i] = p;
			}
		}
		
		p = 1000;
		
		for(int i=str.length()-1; i>=0; i--) {
			if(str.charAt(i)==m) {
				p = 0;
			}else {
				p++;
				answer[i] = Math.min(answer[i], p);
			}
		}
		return answer;
		
	}

}
