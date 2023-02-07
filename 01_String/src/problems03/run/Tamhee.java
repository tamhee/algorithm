package problems03.run;

import java.util.Scanner;

public class Tamhee {
	public static void main(String[] args) {
		Tamhee T = new Tamhee();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		System.out.println(T.solution(str));
		
	}

	public String solution(String str) {
		String answer = "";
		
		/*String[] s = str.split(" ");
		int min = Integer.MIN_VALUE;
		
		for(String x : s) {
			int m = x.length();
			if(m > min) {
				min = m;
				answer = x;
			}
		}*/
		
		int min = Integer.MIN_VALUE, pos;
		while((pos=str.indexOf(' ')) != -1) {
			String tmp = str.substring(0, pos);
			int m = tmp.length();
			if(m > min) {
				min = m;
				answer = tmp;
			}
			str = str.substring(pos+1);
		}
		
		if(str.length()>min) answer = str;
		return answer;
	}
}
