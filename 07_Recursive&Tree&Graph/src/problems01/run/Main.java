package problems01.run;

public class Main {
	/* ����Լ�
	 * -�ڱⰡ �ڱ� �ڽ��� ȣ���ϴ� �Լ� 
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
