/* 
Given an array arr[] of N non-negative integers representing the height of blocks.
If width of each block is 1, compute how much water can be trapped between the blocks 
during the rainy season. 
Example 1:
Input:
N = 6
arr[] = {3,0,0,2,0,4}
Output:
10
Explanation: water = 3 + 3 + 1 + 3 = 10
*/

public class TrappingRainWater 
{
    /* 
    1> Initialize two arrays left[] and right[]
    2> left stores max value or tallest tower from left(first index to i-th)
    3> right stores max value or tallest tower from right(last index to i-th)
    4> The max water that can be stored at any block is the
    min value of two max tower at either side - height of current block or 0 if
    the previous value < 0.
    5> Note:(Towers values of either end are not considered
    as they donot hold water)
        // Storing the result by choosing the minimum of heights of tallest bar to
        // the right and left of the bar at current index and also subtracting the
        // value of current index to get water accumulated at current index.
    */
    class Solution{
        // arr: input array
        // n: size of array
        // Function to find the trapped water between the blocks.
        static int trappingWater(int arr[], int n) { 
            int i;
            int[] left = new int[n];
            int[] right = new int[n];
            left[0] = arr[0];
            for(i=1;i<n;i++)
            {
                left[i] = Math.max(arr[i],left[i-1]);
            }
            right[n-1] = arr[n-1];
            for(i=n-2;i>=0;i--)
            {
                right[i] = Math.max(arr[i],right[i+1]);
            }
            int water = 0;
            for(i=1;i<n-1;i++)
            {
                water += Math.max(0,Math.min(left[i],right[i])-arr[i]);
            }
            return water;
        } 
    }
}
