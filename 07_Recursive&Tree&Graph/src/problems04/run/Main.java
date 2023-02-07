package problems04.run;

public class Main {
	/* �Ǻ���ġ ���� */
	/* for, �迭�� ����������, ��ͷε� ������
	 * ������ ������ for���� �迭�� �̿��ϴ� ���� �� ����
	 * ��ʹ� ���� �������� ����ϱ� ������ �ð��� �� ���� �ɸ�
	 */
	static int[] fibo;
	
	public static void main(String[] args) {
		Main T = new Main();
		int n = 45;
		fibo = new int[n+1];
		T.DFS(n);
		for(int i =1; i<=n; i++ ) System.out.print(fibo[i]+ " ");
	}
	
	public int DFS(int n) {
		if(fibo[n] > 0) return fibo[n]; /* �̹� ���ȣ�� �������� ���� ������ fibo[n]�� ���� ������ */
		if(n==1) return fibo[n] = 1;
		else if(n==2) return fibo[n] = 1;
		else return fibo[n] = DFS(n-2) + DFS(n-1);
	}

}
