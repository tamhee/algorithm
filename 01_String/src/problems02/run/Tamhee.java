package problems02.run;

import java.util.Scanner;

public class Tamhee {
	public static void main(String[] args) {
		Tamhee T = new Tamhee();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
		
	}

	public String solution(String str) {
		String answer = "";
		for(char x : str.toCharArray()) {
			/*if(Character.isUpperCase(x)) answer += Character.toLowerCase(x);
			else answer += Character.toUpperCase(x);*/
			if(x>=65 && x<=90) answer += (char)(x+32);
			else answer += (char)(x-32);
			
		}
		return answer;
	}
	

}
