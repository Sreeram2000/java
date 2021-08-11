import java.lang.*;
import java.util.*;

/* 
Given an array A[ ] of positive integers of size N, where each value represents 
the number of chocolates in a packet. Each packet can have a variable number of 
chocolates. There are M students, the task is to distribute chocolate packets 
among M students such that :
1. Each student gets exactly one packet.
2. The difference between maximum number of chocolates given to a student and
   minimum number of chocolates given to a student is minimum.

Example 1:

Input:
N = 8, M = 5
A = {3, 4, 1, 9, 56, 7, 9, 12}
Output: 6
Explanation: The minimum difference between 
maximum chocolates and minimum chocolates 
is 9 - 3 = 6 by choosing following M packets :
{3, 4, 9, 7, 9}.
*/

public class ChocolateDistributionProblem {
     /*
    1>Sort the array
    2>find the subarray wher diff between ith and (i+m-1)th element is minimum
    3>Note:(i+m-1 < n), the last set is till (n-1)th from (n-m)th.  
    */
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,m;
        n = sc.nextInt();
        m = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int minDiff = Integer.MAX_VALUE;
        for(int i=0;i+m-1<n;i++)
        {
            if(arr[i+m-1]-arr[i] < minDiff)
            {
                minDiff = arr[i+m-1] - arr[i];
            }
        }
        System.out.print(minDiff);
	}
}
