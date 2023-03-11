package algorithm;
import java.util.*;

public class 기능개발 {

	// 스택/큐
	class Solution {
	    public int[] solution(int[] progresses, int[] speeds) {
	        Queue<Integer> q = new LinkedList();
	        for(int i=0; i<progresses.length; i++){
	            int rest = 100 - progresses[i];
	            if(rest % speeds[i] == 0){
	                q.offer(rest/speeds[i]);
	            }else{
	                q.offer(rest/speeds[i]+1);
	            }
	        }
	        
	        List<Integer> processList = new ArrayList<>();
	        int process = q.peek();
	        int cnt = 0;
	        while(!q.isEmpty()){
	            int n = q.poll();
	            if(process < n){
	                processList.add(cnt);
	                cnt = 0; process = n;
	            }
	            
	            cnt++;
	        }
	        processList.add(cnt);
	        
	        return processList.stream().mapToInt(i -> i).toArray();
	    }
	}
}
