package problems08.run;

import java.util.Scanner;

public class Tamhee {
	
	public static void main(String[] args) {
		Tamhee T = new Tamhee();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		System.out.println(T.solution(str));
	}
	
	public String solution(String str) {
		String answer = "NO";
		
		str = str.toUpperCase().replaceAll("[^A-Z]", "");
		String tmp = new StringBuilder(str).reverse().toString();
		
		System.out.println(str);
		System.out.println(tmp);
		
		if(str.equalsIgnoreCase(tmp)) answer = "YES";
		
		return answer;
		
	}
	

}
