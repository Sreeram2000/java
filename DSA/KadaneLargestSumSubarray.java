/* 
Given an array arr of N integers. Find the contiguous sub-array with maximum sum.

Example 1:
Input:
N = 5
arr[] = {1,2,3,-2,5}
Output:
9
*/

public class KadaneLargestSumSubarray {    
/* 
1>Kadane's Algorithm is used to solve largest sum in contiguous subarray problem
2>Two variables are used max_so_far and max_ending 
3>max_so_far keep a note of max sum yet and max_ending explores through consecutive elements.
  max_ending += a[i];
5>Update max_so_far if max_ending > max_so_far 
6>if max_ending < 0 it means that the negative elements yet so far out weigh the +ve and 
  therefore the max_ending = 0 => re-initialized
7> For eg: -1 1 2 -1 => 3 => -1 { 1 2 } -1 
*/
    class Solution
    {
        int maxSubarraySum(int arr[], int n)
        {
            
            int max_so_far = Integer.MIN_VALUE,max_ending=0;
            for(int i=0;i<n;i++)
            {
                max_ending += arr[i];
                if(max_so_far < max_ending)
                {
                    max_so_far = max_ending;
                }
                if(max_ending < 0) {
                    max_ending = 0; 
                }
            }
            return max_so_far;
            
        }
    }

}
