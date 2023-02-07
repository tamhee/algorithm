package problems03.run;

import java.util.Scanner;

public class Main {
	/* 3. 문장 속 단어 */
	public String solution(String str) {
		String answer="";
		/*int m = Integer.MIN_VALUE; //가장 작은값으로 초기화
		String[] s = str.split(" ");
		for(String x : s) {
			int len = x.length();
			if(len>m) {
				m=len;
				answer=x;
			}
			
		}*/
		
		int m= Integer.MIN_VALUE, pos;
		//indexof : 특정 문자열의 위치를 찾음
		// 특정 문자열이 없으면 -1을 반환
		// -1이 아닐때까지 반복문이니까 특정 문자열인 띄어쓰기까지 찾음
		// pos는 띄어쓰기 인덱스
		while((pos=str.indexOf(' '))!= -1) {
			System.out.println(pos);
			// substring(인덱스, 인덱스-1까지)
			String tmp = str.substring(0, pos);
			int len=tmp.length();
			if(len>m) {
				m=len;
				answer=tmp;
			}
			str=str.substring(pos+1);
			
		}
		
		System.out.println(str);
		if(str.length()>m) answer=str;
		
		return answer;
		
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		System.out.print(T.solution(str));
		
	}
}
