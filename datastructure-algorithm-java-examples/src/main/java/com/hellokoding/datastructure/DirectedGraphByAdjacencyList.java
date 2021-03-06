package com.hellokoding.datastructure;

import java.util.ArrayList;
import java.util.List;

public class DirectedGraphByAdjacencyList {
    private int V;
    private List<Integer>[] adjacencyList;

    public DirectedGraphByAdjacencyList(int V) {
        this.V = V;

        adjacencyList = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            adjacencyList[i] = new ArrayList<>();
        }
    }

    public int getV() {
        return V;
    }

    public List<Integer> getAdjacencyList(int vertex) {
        return adjacencyList[vertex];
    }

    private void print() {
        for (int i = 0; i < V; i++) {
            System.out.printf("Adjacency list of vertex %d is %s %s", i, adjacencyList[i], System.lineSeparator());
        }
    }

    public void addEdge(int source, int dest) {
        adjacencyList[source].add(dest);
    }

    public static void main(String[] args) {
        DirectedGraphByAdjacencyList graph = new DirectedGraphByAdjacencyList(3);
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.print();
    }
}
