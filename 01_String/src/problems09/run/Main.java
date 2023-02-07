package problems09.run;

import java.util.Scanner;

public class Main {

	/* 9. 숫자만 추출 */
/*	public int solution(String s) {
		int answer = 0;
		for(char x : s.toCharArray()) {
			if(x>=48 && x<= 57) {
				answer = answer * 10 + (x-48);
				
			}
			
		}
		return answer;
		
	}*/
	
	public int solution(String s) {
		String answer = "";
		for(char x : s.toCharArray()) {
			if(Character.isDigit(x)) {
				//isDigit : x가 숫자냐? -> 참
				answer+=x;
			}
			
		}
		return Integer.parseInt(answer);
		
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
		
	}
	
}
