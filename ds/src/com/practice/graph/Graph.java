package com.practice.graph;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Graph {
	private Set<Vertex>vertices;
	private Set<Edge>edges;
	private Map<Vertex,List<Edge>>adj;
	
	public Set<Vertex> getVertices() {
		return vertices;
	}

	public void setVertices(Set<Vertex> vertices) {
		this.vertices = vertices;
	}

	public Set<Edge> getEdges() {
		return edges;
	}

	public void setEdges(Set<Edge> edges) {
		this.edges = edges;
	}

	public Map<Vertex, List<Edge>> getAdj() {
		return adj;
	}

	public void setAdj(Map<Vertex, List<Edge>> adj) {
		this.adj = adj;
	}

	public void addVertex(Vertex v){
		this.vertices.add(v);
	}
	
	public void addEdge(Edge e){
		this.edges.add(e);
	}
	

}
