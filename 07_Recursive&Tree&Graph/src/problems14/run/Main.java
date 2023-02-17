package problems14.run;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static int n, m;
	static ArrayList<ArrayList<Integer>> graph;
	static int[] ch, dis;
	public void BFS(int v) {
		Queue<Integer> queue = new LinkedList<>();
		ch[v]=1;
		dis[v]=0;
		queue.offer(v);
		while(!queue.isEmpty()) {
			int cv = queue.poll();
			System.out.println("cv : " + cv);
			
			for(int nv : graph.get(cv)) {
				System.out.println("nv : " + nv);
				if(ch[nv]==0) {
					ch[nv] = 1;
					queue.offer(nv);
					dis[nv] = dis[cv]+1;
					
				}
			}
		}
		
		
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		n= kb.nextInt();
		m= kb.nextInt();
		graph = new ArrayList<ArrayList<Integer>>();
		for(int i=0; i<=n; i++) {
			graph.add(new ArrayList<Integer>());
		}
		ch = new int[n+1];
		dis = new int[n+1];
		for(int i=0; i<m; i++) {
			int a = kb.nextInt();
			int b = kb.nextInt();
			graph.get(a).add(b);
		}
		T.BFS(1);
		for(int i=2; i<=n; i++) {
			System.out.println(i + " : " + dis[i]);
		}
	}

}
