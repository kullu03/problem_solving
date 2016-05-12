package com.practice.graph;

import java.util.HashSet;
import java.util.Set;

public class Test {
	public static void  main(String[]args) {
		Graph gr = new Graph();
		Vertex a = new Vertex("a");
		Vertex b = new Vertex("b");
		Vertex c = new Vertex("c");
		Vertex d = new Vertex("d");
		Vertex e = new Vertex("e");
		Vertex f = new Vertex("f");
		Vertex g = new Vertex("g");
		
		
		Set<Vertex>vertices = gr.getVertices();
		if(vertices == null){
			vertices  = new HashSet<>();
			vertices.add(a);
			vertices.add(b);
			vertices.add(c);
			vertices.add(d);
			vertices.add(e);
			vertices.add(f);
			vertices.add(g);
		}
		
		Edge ae = new Edge(a, e, 3);		
		Edge ac = new Edge(a, c, 1);
		Edge cf = new Edge(c, f, 9);
		Edge cd = new Edge(c, d, 4);
		Edge eb = new Edge(e, b, 2);
		Edge bd = new Edge(b, d, 5);
		Edge df = new Edge(d, f, 7);
		
	Set<Edge>edges = gr.getEdges();
	if(edges == null){
		edges = new HashSet<Edge>();
		edges.add(ae);
		edges.add(ac);
		edges.add(cf);
		edges.add(cd);
		edges.add(eb);
		edges.add(bd);
		edges.add(bd);
	}
		gr.setVertices(vertices);
		gr.setEdges(edges);
		
	}

}
