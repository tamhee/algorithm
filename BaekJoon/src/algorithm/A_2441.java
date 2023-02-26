package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A_2441 {
	
	public static void main(String[] args) throws  IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<i; j++) {
				sb.append(" ");
			}
			
			for(int k=n-i; k>0; k--) {
				sb.append("*");
			}
			
			sb.append("\n");
		}
		
		System.out.println(sb);
		
	}

}
