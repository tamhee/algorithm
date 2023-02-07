package problems04.run;

public class Main {
	/* 피보나치 수열 */
	/* for, 배열로 가능하지만, 재귀로도 가능함
	 * 하지만 성능은 for문과 배열로 이용하는 것이 더 좋음
	 * 재귀는 스택 프레임을 사용하기 때문에 시간이 더 오래 걸림
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
		if(fibo[n] > 0) return fibo[n]; /* 이미 재귀호출 만들어놓은 값을 저장한 fibo[n]의 값을 리턴함 */
		if(n==1) return fibo[n] = 1;
		else if(n==2) return fibo[n] = 1;
		else return fibo[n] = DFS(n-2) + DFS(n-1);
	}

}
