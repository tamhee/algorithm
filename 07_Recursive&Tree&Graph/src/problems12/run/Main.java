package problems12.run;

import java.util.Scanner;

public class Main {
	static int n, m, answer=0;
	static int[][] graph;
	static int[] ch;
	public void DFS(int v) {
		if(v==n) answer++; //������ �����ϸ� ���� �� ++
		else {
			for(int i=1; i<=n; i++) {
				if(graph[v][i]==1 && ch[i]==0) {
					ch[i]=1;
					DFS(i);
					ch[i]=0;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		m = kb.nextInt();
		graph = new int[n+1][n+1];
		ch = new int[n+1]; //�̹� �Դ� ������� üũ
		for(int i=0; i<m; i++) {
			int a = kb.nextInt();
			int b = kb.nextInt();
			graph[a][b] = 1;
		}
		ch[1] =1; //1���� �����ϹǷ� üũ
		T.DFS(1);
		System.out.println(answer);
	}

}
