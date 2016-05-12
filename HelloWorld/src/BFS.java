import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BFS {

    static class Node {
        public int distance = -1;
        public boolean discovered = false;
        public int i;
        public List<Node> neighbours = new ArrayList<>();
    }
    
    public static void bfs(Node start) {
        Queue<Node> q = new LinkedList<>();
        q.add(start);
        start.distance = 0;
        start.discovered = true;
        while (!q.isEmpty()) {
            Node node = q.remove();
            //System.out.println("Visiting node " + node.i + " with distance " + node.distance);
            for (Node n : node.neighbours) {
                //System.out.println("Iterating node " + n.i);
                if (n.discovered == false) {
                    n.discovered = true;
                    n.distance = node.distance + 6;
                    q.add(n);
                }
            }
            
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            //System.out.println("N: " + n);
            int m = scanner.nextInt();
            //System.out.println("M: " + m);
            Node[] nodes = new Node[n];
            for (int i = 0; i < n; i++) {
                Node node = new Node();
                node.i = i;
                nodes[i] = node;
            }
            for (int i = 0; i < m; i++) {
                int x = scanner.nextInt();
                //System.out.println("X: " + x);
                int y = scanner.nextInt();
                //System.out.println("Y: " + y);
                Node nodeX = nodes[x-1];
                Node nodeY = nodes[y-1];
                nodeX.neighbours.add(nodeY);
                nodeY.neighbours.add(nodeX);
            }
            int s = scanner.nextInt();
            //System.out.println("S: " + s);
            bfs(nodes[s-1]);
            for (int i = 0; i < n; i++) {
                if (i != s-1) {
                    System.out.print(nodes[i].distance + " ");
                }
            }
            System.out.println("");
        }
        
    }
}