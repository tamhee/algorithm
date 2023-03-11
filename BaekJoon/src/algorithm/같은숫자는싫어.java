package algorithm;
import java.util.*;
public class 같은숫자는싫어 {

	//스택/큐
	public class Solution {
	    public int[] solution(int []arr) {
	        int[] answer = {};
	        ArrayList<Integer> newList = new ArrayList<Integer>();
	        
	        newList.add(arr[0]);
	        
	        for(int i =1; i<arr.length; i++){
	            if(arr[i] != arr[i-1]){
	                newList.add(arr[i]);
	            }
	        }
	        
	        answer = new int[newList.size()];
	        
	        for(int i=0; i<newList.size(); i++){
	            answer[i] = newList.get(i);
	        }
	        

	        return answer;
	    }
	}

}
