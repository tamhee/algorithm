package algorithm;

import java.util.Scanner;

public class A_11720 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String a = sc.next();
		String[] str = a.split("");
		
		int sum = 0;
		
		for(int i=0; i<n; i++) {
			sum += Integer.parseInt(str[i]);
		}
		
		System.out.println(sum);

		
		
		
	}

}
