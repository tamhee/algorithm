package problems09.run;

import java.util.Scanner;

public class Tamhee {
	public static void main (String[] args) {
		Tamhee T = new Tamhee();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}
	
	public int solution(String str) {
		String answer = "";
		
		for(char x : str.toCharArray()) {
			if(Character.isDigit(x)) {
				answer += x;
			}
			
		}
		
		return Integer.parseInt(answer);
	}

}
