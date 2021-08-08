/*

Given an array, rotate the array to the right by k steps, where k is non-negative.

Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]

*/

/*

if k>n meaning n elements rotated n times is the same 
123 rotated 3 times is 123 Therefore k%n gives us remaning rotations.

Reverse upto n-k-1
Reverse n-k  to n-1
reverse whole
12345 k=2 => 32154 => 45123

*/


public class RotateArray {
    class Solution {
        public void reverse(int[] a,int l, int h)
        {
            // int s = h-l;
            while(l<h)
            {
                int t = a[l];
                a[l] = a[h];
                a[h] = t;
                h--;
                l++;
            }
        }
        public void rotate(int[] a, int k) {
            
            int n = a.length;
            if(k>n)
            {
                k = k%n;
            }
            if(n>1)
            {
                reverse(a,0,n-k-1);
                reverse(a,n-k,n-1);
                reverse(a,0,n-1); 
            }  
        }
    }
}
