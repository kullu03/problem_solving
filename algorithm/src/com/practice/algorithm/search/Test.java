package com.practice.algorithm.search;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Set;

public class Test {
	
	public static void  main(String [] args) {
		Graph<String> graph = new Graph<>();
		
		
		Vertex<String> a = graph.addVertex("a");
		Vertex<String> b= graph.addVertex("b");
		Vertex<String> c = graph.addVertex("c");
		Vertex<String> d= graph.addVertex("d");
		Vertex<String> e = graph.addVertex("e");
		graph.addEdge(a, b, 3);
		graph.addEdge(b, c, 4);
		graph.addEdge(c, d, 5);
		graph.addEdge(d, e, 6);
		graph.addEdge(a, e, 7);
		//System.out.println(graph);
		//System.out.println(e.inDegree);
		bfs(graph,a);
	}
	
	
	public static void bfs(Graph<String>graph,Vertex<String>src){
		
		Deque<Vertex<String>> queue = new ArrayDeque<>();

		queue.addLast(src);
		
		while(!queue.isEmpty()){
			Vertex<String> v = queue.removeFirst();
			System.out.println(v.getVertexName());
			v.setVisited(true);
			Set<Vertex<String>> adjcentNode = graph.getAdjcentNode(v);
			if(adjcentNode != null){
				
				for(Vertex<String> adjVer : adjcentNode){
					if(!adjVer.isVisited()){
						queue.addLast(adjVer);
					}
				}
			}
			
			System.out.println("=====================");
			
		}
		
		
		
	}
	
	
}
