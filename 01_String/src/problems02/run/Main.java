package problems02.run;

import java.util.Scanner;

public class Main {
	/* 2. 대소문자 변환 */
	public String solution(String str) {
		String answer="";
		for(char x : str.toCharArray()) {
			/*if(Character.isLowerCase(x)) answer+= Character.toUpperCase(x);
			else answer+= Character.toLowerCase(x);*/
			//대문자는 65 ~ 90
			//소문자는 97 ~ 122
			if(x>=65 && x<=90) answer+=(char)(x+32);
			else answer+=(char)(x-32);
			
			
		}
		return answer;
		
		
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str= kb.next();
		System.out.print(T.solution(str));
		
	}
}
