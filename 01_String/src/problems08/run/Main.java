package problems08.run;

import java.util.Scanner;

public class Main {
	/* 8. ��ȿ�� �Ӹ���� */
	public String solution(String s) {
		String answer = "NO";
		
		s= s.toUpperCase().replaceAll("[^A-Z]", "");
		String tmp = new StringBuilder(s).reverse().toString();
		if(s.equalsIgnoreCase(tmp)) answer = "YES";
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		System.out.print(T.solution(str));;
		
	}
}
