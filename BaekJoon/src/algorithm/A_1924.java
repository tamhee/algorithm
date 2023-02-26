package algorithm;

import java.util.Scanner;

public class A_1924 {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int x,y = 0; 
        int[] month = {31,28,31,30,31,30,31,31,30,31,30,31};
        String[] week ={"SUN","MON","TUE","WED","THU","FRI","SAT"};
        
        x = sc.nextInt();
        y = sc.nextInt();
        
        for(int i=0; i<x-1; i++){

        	y += month[i];  
        	
        }

		y = y%7;
        System.out.println(week[y]);
		
		sc.close();
	}

}
