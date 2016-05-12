import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solutionkkk {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        int []mid = new int[100];
        for(int i = 0; i <n; i++){
           int str = sc.nextInt();
           // String numberOnly= str.replaceAll("[^0-9]", "");
         // System.out.println(numberOnly);
           // int foo = Integer.parseInt("1234");
            int pp = str;
            mid[pp] = mid[pp]+1;
        }
        for(int j =1; j<100;j++){
          
            mid[j] = mid[j] + mid[j-1];
        }
         for(int j = 0; j<100;j++){
            System.out.print(mid[j]+" ");
           // mid[j] = mid[j] + mid[j-1];
        }
    
    }
}