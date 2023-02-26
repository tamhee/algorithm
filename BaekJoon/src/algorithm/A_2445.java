package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A_2445 {

	public static void main(String[] args) throws  IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=n; i++) {
			
			for(int k=1; k<=i; k++) {
				sb.append("*");
			}
			
			for(int j=i; j<=2*n-i-1; j++) {
				sb.append(" ");			
			}
			
			for(int k=1; k<=i; k++) {
				sb.append("*");
			}
			sb.append("\n");
		}
		
		
		for(int i=1; i<n; i++) {
			
			for(int k=1; k<=n-i; k++) {
				sb.append("*");
			}
			
			for(int j=1; j<=2*i; j++) {
				sb.append(" ");
				
			}
			
			for(int k=1; k<=n-i; k++) {
				sb.append("*");

			}
			
			sb.append("\n");
		}
		
		System.out.println(sb);
		
		
	}
}
