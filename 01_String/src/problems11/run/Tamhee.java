package problems11.run;

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
		str = str + " ";
		int cnt = 1;
		
		// KKHHSSEE 
		// 9∞≥ ±Ê¿Ã
		// 012345678
		for(int i=0; i<str.length()-1; i++) {
			if(str.charAt(i)==str.charAt(i+1)) cnt++;
			else {
				answer += str.charAt(i);
				if(cnt>1) answer += String.valueOf(cnt);
				cnt = 1;
			}
			
		}
		
		
		return answer;
	}

}
