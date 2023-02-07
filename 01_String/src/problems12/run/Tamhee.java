package problems12.run;

import java.util.Scanner;

public class Tamhee {
	
	public static void main(String[] args) {
		Tamhee T = new Tamhee();
		Scanner kb = new Scanner(System.in);
		int m = kb.nextInt();
		String str = kb.next();
		System.out.println(T.solution(m, str));
		
	}
	
	public String solution(int m, String str) {
		String answer = "";
		
		for(int i=0; i<m; i++) {
			String tmp = str.substring(0,7).replace("#", "1").replace("*", "0");
			//System.out.println(tmp);
			int num = Integer.parseInt(tmp,2);
			answer += (char)num;
			str = str.substring(7);
			
		}
		
		return answer;
		
	}

}
