package com.eclipse.setup;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SolutionK {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            HashMap<Integer,HashSet<Integer>> adj = new HashMap<Integer,HashSet<Integer>>();
            int v = sc.nextInt();
            int e = sc.nextInt();
            while(e>0){
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            if(adj.get(v1) == null){
                HashSet<Integer>arr = new HashSet<Integer>();
                arr.add(v2);
                adj.put(v1,arr);
            }
            else{
               HashSet<Integer>arr1 = adj.get(v1);
                arr1.add(v2);
                adj.put(v1,arr1);
            }
                
                 if(adj.get(v2) == null){
                HashSet<Integer>brr = new HashSet<Integer>();
                brr.add(v1);
                adj.put(v2,brr);
            }
            else{
               HashSet<Integer>brr1 = adj.get(v2);
                brr1.add(v1);
                adj.put(v2,brr1);
            }
              e = e-1;
            }
            int s = sc.nextInt();
            if(adj.get(s) == null){
                adj.put(s,null);
            }
            
            bfs(s,adj,v);
            System.out.println(" ");
            t = t-1;
            
        }      
            
    }
    private static void bfs(int s,HashMap<Integer,HashSet<Integer>> adj,int v){
        boolean[]visited = new boolean[v+1];
        visited[s] = true;
        Integer [] parent = new Integer[v+1];
        Queue<Integer> Q = new LinkedList<>();
        Q.add(s);
        parent[s]=null;
        HashSet<Integer>children = adj.get(s);
        if(children != null && children.size()>0){
            for(Integer child : children){
                parent[child]  = s;
            }
        }
        Q.addAll(adj.get(s));
        while(!Q.isEmpty()){
          int p = Q.remove();
            //parent[p] = s;
            if(!visited[p]){
                Q.addAll(adj.get(p));
                 HashSet<Integer>children1 = adj.get(p);
                 if(children1 != null && children1.size()>0){
                for(Integer child1 : children1){
                	if(parent[child1] == null){
                parent[child1]  = p;
                	}
            }
        }
                visited[p] =true;
                
            }
            
        }
        
        
        for(int i =1;i<=v;i++){
            if(i!=s){
            if(!visited[i]){
                System.out.print("-1"+" ");
            }
            else{
               Integer pp = getParent(parent,i);
                int d = 6;
                while(pp != s){
                  pp = getParent(parent,pp);
                    d =d+6;
                }
                System.out.print(""+d+ " ");
            }
        }
        }
        }
        
    private static Integer getParent(Integer []arr,int i){
        if(i != 0 && i<arr.length){
            return arr[i];
        }
        return null;
        
    }
    
           
}