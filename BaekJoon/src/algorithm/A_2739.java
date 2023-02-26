package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A_2739 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=9; i++) {
			sb.append(n).append(" * ").append(i).append(" = ").append(n*i).append("\n");
		}
		
		System.out.println(sb);
		
		
	}

}
