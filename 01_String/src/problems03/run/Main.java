package problems03.run;

import java.util.Scanner;

public class Main {
	/* 3. ���� �� �ܾ� */
	public String solution(String str) {
		String answer="";
		/*int m = Integer.MIN_VALUE; //���� ���������� �ʱ�ȭ
		String[] s = str.split(" ");
		for(String x : s) {
			int len = x.length();
			if(len>m) {
				m=len;
				answer=x;
			}
			
		}*/
		
		int m= Integer.MIN_VALUE, pos;
		//indexof : Ư�� ���ڿ��� ��ġ�� ã��
		// Ư�� ���ڿ��� ������ -1�� ��ȯ
		// -1�� �ƴҶ����� �ݺ����̴ϱ� Ư�� ���ڿ��� ������� ã��
		// pos�� ���� �ε���
		while((pos=str.indexOf(' '))!= -1) {
			System.out.println(pos);
			// substring(�ε���, �ε���-1����)
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
