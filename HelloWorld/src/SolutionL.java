import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SolutionL {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        int t = sc.nextInt();
        HashMap<Integer,HashSet<Integer>>childToAncMap = new HashMap<Integer,HashSet<Integer>>();
        while(n-1 > 0){
            int p = sc.nextInt();
            int c = sc.nextInt();
            if(childToAncMap.get(c) == null){
                HashSet<Integer> anecctor = new HashSet<Integer>();
                anecctor.add(p);
                childToAncMap.put(c,anecctor);
            }
            else{
                HashSet<Integer> existingAnecctor = childToAncMap.get(c);
                existingAnecctor.add(p);
                childToAncMap.put(c,existingAnecctor);
            }
           
                        
            n = n-1;
            
        }
        System.out.println(getTheCount(childToAncMap,t));
    }
    
    private static int getTheCount(HashMap<Integer,HashSet<Integer>>childToAncMap,int t){
    	HashMap<Integer,HashSet<Integer>>childToAllParents = new HashMap<Integer,HashSet<Integer>>();
    	for(Map.Entry<Integer,HashSet<Integer>> e: childToAncMap.entrySet()){
    		HashSet<Integer> anc = e.getValue();
    		HashSet<Integer> a = new HashSet<Integer>();
    		a.addAll(anc);
    		Stack<Integer>s = new Stack<Integer>();
    		s.addAll(anc);
    		while(!s.isEmpty()){
    			Integer poped = s.pop();
    			
    				if(childToAncMap.get(poped) != null){
    					a.addAll(childToAncMap.get(poped));
    					s.addAll(childToAncMap.get(poped));
    				}
    			
    			//childToAncMap.put(e.getKey(),a); 
    			childToAllParents.put(e.getKey(), a);
    		}

    	}
        
        int c = 0;
        for(Map.Entry<Integer,HashSet<Integer>> ee:  childToAllParents.entrySet()){
            int val = ee.getKey();
            HashSet<Integer> ann = ee.getValue();
            for(Integer in : ann){
                if(Math.abs(in-val)<=t){
                    c = c+1;
                }
            }
            
           
        }
         return c;
    }
    
    
}