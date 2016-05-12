package com.eclipse.setup;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

import com.eclipse.setup.Dijkstra1.Pair;


public class SolutionJMO {

	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		Graph g = new Graph();
		HashMap<Node,HashSet<Node>> adj = g.getGraph();
		while(t > 0){
			int nv = sc.nextInt();
			int me = sc.nextInt();
			for(int i =1; i <= me; i++){
				int u = sc.nextInt();
				int v = sc.nextInt();
				int w = sc.nextInt();
				Node nn = new Node(u,w);
				Node mm = new Node(v,w);
				if(adj.get(mm) == null){
					HashSet<Node> nbrs = new HashSet<Node>();
					nbrs.add(nn);
					adj.put(mm,nbrs);
				}
				else{
					adj.get(mm).add(nn);
				}
				if(adj.get(nn) == null){
					HashSet<Node> nbrs1 = new HashSet<Node>();
					nbrs1.add(mm);
					adj.put(nn,nbrs1);
				}
				else{
					adj.get(nn).add(mm);
				}


			}
			// start node
			int s = sc.nextInt();
			Node ss = g.getNodeByName(s);
			t = t-1;
			doBfs(adj,ss,nv,g);

		}
	}


	private static void doBfs(HashMap<Node,HashSet<Node>> adj,Node s,int v,Graph g){


		int [] dis = new int[v+1];
		int [] visited = new int[v+1];
		Arrays.fill(dis,1000000);
		Arrays.fill(visited,0);
		
		dis[s.name] = 0;
		
		// LinkedHashSet<Integer> q = new LinkedHashSet<Integer>();
		PriorityQueue<Node> q = new PriorityQueue<Node>();/*(new Comparator<Node>() {

			@Override
			public int compare(Node o1, Node o2) {
				// TODO Auto-generated method stub
				if(o1.weight < o2.weight){
					return -1;
				}

				if(o1.weight > o2.weight ){
					return 1;
				}

				return 0;

			}
		} );*/
		
		/*HashMap<Node,HashSet<Node>> newAdj = new HashMap<Node,HashSet<Node>>();
		newAdj.putAll(adj);
		for(Map.Entry<Node,HashSet<Node>> e : newAdj.entrySet()){
			if(e.getKey().name != s.name){
			e.getKey().weight = 100000;
			q.add(e.getKey());
			}
			else{
				e.getKey().weight = 0;
				q.add(e.getKey());
			}
		}
		
		
		*/
		
		s.weight = 0;
		q.add(s);
		
		

		while(!q.isEmpty()){
			Node vv = q.poll();
			HashSet<Node>nbrs = adj.get(vv);
			//dis[vv.name] = vv.weight;
			visited[vv.name]=1;
			
				for(Node n : nbrs){
					if(dis[n.name] > dis[vv.name]+ n.weight){
						dis[n.name] = dis[vv.name]+ n.weight;
						
					}
					
					  if(visited[n.name]==0)
	                        q.add(new Node(n.name ,dis[n.name] ));
	                }
					
			
				
			}
			

		
		for(int i =1; i < dis.length; i++){
			if(i ==s.name){

			}
			else{
				System.out.print(dis[i] + " ");
			}
		}
	}




}


class Node implements Comparable<Node>{
	private int name;
	private int weight;



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + name;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Node other = (Node) obj;
		if (name != other.name)
			return false;
		return true;
	}

	public Node(int name,int weight){
		this.name = name;
		this.weight = weight;

	}

	@Override
	public int compareTo(Node o) {
		Node pr = (Node)o;

            if(weight > pr.weight)
                return 1;
            else
                return -1;

        };
	}

 class Graph{
	private HashMap<Node,HashSet<Node>>adj;
	public Graph(){
		this.adj= new HashMap<Node,HashSet<Node>>();
	}
	public HashMap<Node,HashSet<Node>> getGraph(){
		return this.adj;
	}

	public Node getNodeByName(int n){
		for(Map.Entry<Node, HashSet<Node>>e:adj.entrySet()){
			if(e.getKey().name == n){
				return  e.getKey();
			}
			return null;
		}
		return null;

	}

}