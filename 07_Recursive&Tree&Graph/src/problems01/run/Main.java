package problems01.run;

public class Main {
	/* 재귀함수
	 * -자기가 자기 자신을 호출하는 함수 
	 *
	 **/
	public static void main(String[] args) {
		Main T = new Main();
		T.DFS(3);
	}
	
	public void DFS(int n) {
		
		if(n==0) return;
		else {
			  DFS(n-1);
			  System.out.print(n);
					
		}
	}
	
	
}
