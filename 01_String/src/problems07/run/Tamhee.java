package problems07.run;

import java.util.Scanner;

public class Tamhee {
	public static void main(String[] args) {
		Tamhee T = new Tamhee();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
		
	}
	
	public String solution(String str) {
		String answer = "NO";
		
		String tmp = new StringBuilder(str).reverse().toString();
		
		if(str.equalsIgnoreCase(tmp)) answer = "YES";
		return answer;
		
	}

}
