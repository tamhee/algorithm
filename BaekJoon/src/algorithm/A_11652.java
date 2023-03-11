package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class A_11652 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		HashMap<Long, Integer> cards = new HashMap<>();
		
		int max = 0;
		long min = 0;
		
		for(int i=0; i<n; i++) {
			long card = Long.parseLong(br.readLine());
			
			cards.put(card, cards.getOrDefault(cards, 0)+1);
			
			if(cards.get(card) > max) {
				max = cards.get(card);
				min = card;
			}else if(cards.get(card) == max) {
				min = Math.min(min, card);
			}
		}
		
		System.out.println(min);
		
		
		
	}

	
}
