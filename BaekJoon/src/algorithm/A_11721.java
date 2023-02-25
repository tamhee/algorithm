package algorithm;

import java.util.Scanner;

public class A_11721 {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		String str = sc.next();
		
		int a = str.length() / 10;
		
		for(int i =0; i<a; i++) {
			sb.append(str.substring(0,  10));
			sb.append("\n");
			str = str.substring(10);
		}


		sb.append(str);
		System.out.println(sb);
		
	}
	

}
