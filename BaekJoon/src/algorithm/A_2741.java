package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A_2741 {
	
	public static void main(String[] args) throws  IOException {
		
		/*Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 1; i<=n; i++) {
			System.out.println(i);
		}*/
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=n; i++) {
			sb.append(i).append("\n");
		}
		
		System.out.println(sb);
		
		
	}

}
