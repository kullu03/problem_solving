import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SolutionM {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        int t = sc.nextInt();
        HashMap<Integer,HashSet<Integer>>childToAncMap = new HashMap<Integer,HashSet<Integer>>();
        while(t > 0){
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
           
            System.out.println(getTheCount(childToAncMap));            
            t = t-1;
            
        }
    }
    
    private static int getTheCount(HashMap<Integer,HashSet<Integer>>childToAncMap){
        HashMap<Integer,HashSet<Integer>>childToAllParents = new HashMap<Integer,HashSet<Integer>>();
        for(Map.Entry<Integer,HashSet<Integer>> e: childToAncMap.entrySet()){
            HashSet<Integer> anc = e.getValue();
            HashSet<Integer> a = new HashSet<Integer>();
            for(Integer in :anc){
                
            }
            
            
        }
		return 0;
        
    }
    
    
}