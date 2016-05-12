package com.eclipse.setup;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner reader = new Scanner(System.in);
        int t = reader.nextInt();
        for(int i = 0; i < t ; i++){
            int n = reader.nextInt();
            int arr [] = new int[n];
            for(int j = 0 ; j<n; j++){
                arr[j] = reader.nextInt();
            }
           System.out.println(isSumOfLeftAndEqualSame(arr,n));
        }
    }
    private static String isSumOfLeftAndEqualSame(int[]arr,int n){
        Arrays.sort(arr);
      int mid = n/2;
        int low = 0;
        int high = n;
        while(low <= high){
            mid = (low+high)/2;
            if(getLeftSum(arr,mid-1)==getRightSum(arr,mid+1)){
                return "YES";
            }
            if(getLeftSum(arr,mid-1)-getRightSum(arr,mid+1) < 0){
                low = mid+1;
            }
             if(getLeftSum(arr,mid-1)-getRightSum(arr,mid+1) > 0){
                 high = mid-1;
             }
        }
        return "NO";
    }
    private static int getLeftSum(int []arr,int n){
        int sum =0;
        for(int i = 0; i<=n; i++){
            sum = sum+arr[i];
        }
        return sum;
    }
     private static int getRightSum(int []arr,int n){
        int sum =0;
        for(int i = n; i<arr.length; i++){
            sum = sum+arr[i];
        }
        return sum;
    }
}