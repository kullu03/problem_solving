package com.practice.algorithm.search;

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
		System.out.println(graph);
	}
	
	
}
