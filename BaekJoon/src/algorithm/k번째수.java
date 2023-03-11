package algorithm;
import java.util.*;

public class k��°�� {
	/*�迭 array�� i��° ���ں��� j��° ���ڱ��� �ڸ��� �������� ��, k��°�� �ִ� ���� ���Ϸ� �մϴ�.

	���� ��� array�� [1, 5, 2, 6, 3, 7, 4], i = 2, j = 5, k = 3�̶��

	array�� 2��°���� 5��°���� �ڸ��� [5, 2, 6, 3]�Դϴ�.
	1���� ���� �迭�� �����ϸ� [2, 3, 5, 6]�Դϴ�.
	2���� ���� �迭�� 3��° ���ڴ� 5�Դϴ�.
	�迭 array, [i, j, k]�� ���ҷ� ���� 2���� �迭 commands�� �Ű������� �־��� ��, commands�� ��� ���ҿ� ���� �ռ� ������ ������ �������� �� ���� ����� �迭�� ��� return �ϵ��� solution �Լ��� �ۼ����ּ���.*/
	/*[1, 5, 2, 6, 3, 7, 4]	     [[2, 5, 3], [4, 4, 1], [1, 7, 3]]	    [5, 6, 3]*/
	class Solution {
	    public int[] solution(int[] array, int[][] commands) {
	        int[] answer = new int[commands.length];
	        
	        for(int i=0; i<commands.length; i++){
	            List<Integer> newArray = new ArrayList<Integer>();
	            for(int j= commands[i][0]-1; j<commands[i][1]; j++){
	                newArray.add(array[j]);
	            }
	            Collections.sort(newArray);
	            answer[i] = newArray.get(commands[i][2]-1);
	            
	            
	        }
	        
	        return answer;
	    }
	}
	
	class Solution2 {
	    public int[] solution(int[] array, int[][] commands) {
	        int[] answer = new int[commands.length];

	        for(int i=0; i<commands.length; i++){
	            int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
	            Arrays.sort(temp);
	            answer[i] = temp[commands[i][2]-1];
	        }

	        return answer;
	    }
	}

}
