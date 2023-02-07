package problems04.run;

import java.util.ArrayList;
import java.util.Scanner;

public class Tamhee {
	public static void main(String[] args) {
		Tamhee T = new Tamhee();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		String[] str = new String[n];
		for(int i=0; i<n; i++) {
			str[i] = kb.next();
		}
		for(String x : T.solution(str)) {
			System.out.println(x);
		}
		
	}
	
	public ArrayList<String> solution(String[] str) {
		ArrayList<String> answer = new ArrayList<>();
		
		/*for(String x : str) {
			String tmp = new StringBuilder(x).reverse().toString();
			answer.add(tmp);
		}*/
		
		for(String x : str) {
			char[] ch = x.toCharArray();
			int lt = 0; 
			int rt = x.length()-1;
			
			while(lt<rt) {
				char tmp = ch[lt];
				ch[lt] = ch[rt];
				ch[rt] = tmp;
				lt++;
				rt--;
			}
			
			String tmp = String.valueOf(ch);
			answer.add(tmp);
			
		}
		return answer;
		
	}

}
