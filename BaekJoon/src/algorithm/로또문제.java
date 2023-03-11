package algorithm;

public class �ζǹ��� {

	class Solution {
	    public int[] solution(int[] lottos, int[] win_nums) {
	        int zero = 0;
	        int match = 0;
	        
	        for(int l : lottos){
	            if(l == 0) zero++;
	            else{
	                for(int w : win_nums){
	                    if(l == w) match++;
	                }
	            }
	        }
	        
	        int min = match;
	        int max = match + zero;
	        
	        int[] answer = {Math.min(7 - max, 6), Math.min(7 - min, 6)};
	        return answer;
	        
	        
	    }
	}
}
