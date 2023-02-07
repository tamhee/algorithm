package problems06.run;

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
		
		for(int i=0; i<str.length(); i++) {
			char tmp = str.charAt(i);
			if(str.indexOf(tmp)==i) answer += tmp;
			
		}
		
		return answer;
		
	}
}
