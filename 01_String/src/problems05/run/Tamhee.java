package problems05.run;

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
		
		char[] ch = str.toCharArray();
		int lt = 0;
		int rt = str.length()-1;
		
		while(lt < rt) {
			if(!Character.isAlphabetic(ch[lt])) lt++;
			else if(!Character.isAlphabetic(ch[rt])) rt--;
			else {
				char tmp = ch[lt];
				ch[lt] = ch[rt];
				ch[rt] = tmp;
				lt++;
				rt--;
				
			}
		}
		
		answer = String.valueOf(ch);
		
		return answer;
		
	}
}
