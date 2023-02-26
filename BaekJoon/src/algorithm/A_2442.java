package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A_2442 {
	
	public static void main(String[] args) throws  IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=n; i++) {
			for(int j=n-i; j>0; j--) {
				sb.append(" ");
			}
			
			for(int k=1; k<=2*i-1; k++) {
				sb.append("*");
			}
			
			sb.append("\n");
		}
		
		System.out.println(sb);
		
	}

}
