package algorithm;
import java.util.*;

public class 가장큰수 {
	
	/*[6, 10, 2]	"6210"
	  [3, 30, 34, 5, 9]	"9534330"*/
	class Solution {
	    public String solution(int[] numbers) {
	       String answer = "";
	        
	        //String 배열로 변경
	        String[] arr = new String[numbers.length];
	        for(int i=0; i<numbers.length; i++){
	            arr[i] = String.valueOf(numbers[i]);
	            
	        }
	        
	        Arrays.sort(arr, new Comparator<String>(){
	            @Override
	            public int compare(String o1, String o2){
	                return (o2+o1).compareTo(o1+o2);
	            }
	            
	        });
	        
	        if(arr[0].startsWith("0")){
	            answer += "0";
	        }
	        else {
	            for(int j=0; j<arr.length; j++){
	                answer += arr[j];
	            }
	        }
	        
	        return answer;
	    }
	}

}
