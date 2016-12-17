package com.practice.algorithm.search;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Graph<T> {
	
	// Number of vertices in the graph
	private List<Edge<T>> edges;
	
	// Number of edges in the graph
	private Set<Vertex<T>>vertices;
	
	private Map<Vertex<T>,Set<Vertex<T>>>adjListMap;
	
	// create empty graph having zero vertex and zero edge.
	public Graph(List<Edge<T>> edges,Set<Vertex<T>>vertices){
		this.edges = edges;
		this.vertices = vertices;
	}
	
	public Graph(){
		this.edges = new ArrayList<>();
		this.vertices = new HashSet<>();
		this.adjListMap = new HashMap<>();
	}
	
	// add a vertex to the existing graph.
	public Vertex<T> addVertex( T name){
		Vertex<T> v = new Vertex<T>(name);
		//this.adjListMap.put(v, null);
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
		v1.outDegree = v1.outDegree +1;
		v2.inDegree = v2.inDegree +1;
		if(this.adjListMap.get(v2) != null){
			Set<Vertex<T>> set = this.adjListMap.get(v2);
			set.add(v1);
			this.adjListMap.put(v2, set);
		}else{
			Set<Vertex<T>> set = new HashSet<>();
			set.add(v1);
			this.adjListMap.put(v2, set);
		}
		
		if(this.adjListMap.get(v1) != null){
			Set<Vertex<T>> set = this.adjListMap.get(v1);
			set.add(v2);
			this.adjListMap.put(v1, set);
		}else{
			Set<Vertex<T>> set = new HashSet<>();
			set.add(v2);
			this.adjListMap.put(v1, set);
		}
		
		
		this.vertices.add(v1);
		this.vertices.add(v2);
		this.edges.add(new Edge<T>(v1, v2, weight));
	}
	
	public Set<Vertex<T>> getAdjcentNode(Vertex<T>v){
		if(this.adjListMap != null){
			return this.adjListMap.get(v);
		}
		return null;
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
	 int inDegree;
	 int outDegree;
	 private boolean visited;
	public Vertex(T name){
		this.name = name;
		this.inDegree = 0;
		this.outDegree = 0;
	}
	
	public T getVertexName(){
		return this.name;
	}
	
	public int getInDegree(){
		return this.inDegree;
	}
	
	public int getOutDegree() {
		return this.outDegree;
	}

	@Override
	public String toString() {
		return "Vertex [name=" + name + "]";
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
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
