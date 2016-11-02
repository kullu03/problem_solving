package com.practice.algorithm.search;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Graph<T> {
	
	// Number of vertices in the graph
	private List<Edge<T>> edges;
	
	// Number of edges in the graph
	private Set<Vertex<T>>vertices;
	
	// create empty graph having zero vertex and zero edge.
	public Graph(List<Edge<T>> edges,Set<Vertex<T>>vertices){
		this.edges = edges;
		this.vertices = vertices;
	}
	
	public Graph(){
		this.edges = new ArrayList<>();
		this.vertices = new HashSet<>();
	}
	
	// add a vertex to the existing graph.
	public Vertex<T> addVertex( T name){
		Vertex<T> v = new Vertex<T>(name);
		this.vertices.add(v);
		return v;
	}
	
	// get the count of vertex in the graph.
	public int getVertexCount(){
		return this.vertices.size();
	}
	
	// Get the count of edges in the graph.
	public int getEdgeCount(){
		return this.edges.size();
	}
	
	// Add edges from v1 to v2 having weight weight
	public void addEdge(Vertex<T>v1,Vertex<T>v2,int weight){
		this.vertices.add(v1);
		this.vertices.add(v2);
		this.edges.add(new Edge<T>(v1, v2, weight));
	}

	@Override
	public String toString() {
		StringBuilder vertices = new StringBuilder();
		for(Vertex<T> v : this.vertices){
			vertices.append(v.toString());
		}
		
		StringBuilder edge = new StringBuilder();
		for(Edge<T>e : edges){
			edge.append(e.toString());
		}
		return "Graph [edges=" + this.edges + ", vertices=" + "[" + vertices.toString() + "]" + "]";
	}
	
	
}

// This represent vertex of a graph.
class Vertex<T>{
	private T name;
	public Vertex(T name){
		this.name = name;
	}
	
	public T getVertexName(){
		return this.name;
	}

	@Override
	public String toString() {
		return "Vertex [name=" + name + "]";
	}
	
	
}

// this is the edge of a graph.
class Edge<T>{
	private Vertex<T> v1;
	private Vertex<T> v2;
	private int weight;
	
	public Edge(Vertex<T>v1,Vertex<T>v2,int weight){
		this.v1 = v1;
		this.v2 = v2;
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Edge [src=" + v1.getVertexName() + ", dst=" + v2.getVertexName() + ", weight=" + weight + "]";
	}
	
	

}
