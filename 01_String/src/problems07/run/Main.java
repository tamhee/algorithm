package problems07.run;

import java.util.Scanner;

public class Main {
	/* 7. 회문 문자열 */
	public String solution(String str) {
		/*String answer= "YES";
		str= str.toUpperCase();
		int len = str.length();
		
		for(int i=0; i<len/2; i++) {
			if(str.charAt(i)!=str.charAt(len-i-1)) return "NO";		
		}
		*/
		String answer= "NO";
		String tmp = new StringBuilder(str).reverse().toString();
		System.out.println(tmp);
		System.out.println(str);
		if(str.equalsIgnoreCase(tmp)) answer="YES";
		return answer;
		
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.print(T.solution(str));;
		
	}
}
