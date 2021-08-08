/* 

Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the 
same color are adjacent, with the colors in the order red, white, and blue.
We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
You must solve this problem without using the library's sort function.

Example 1:
Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2] 

*/

/* 

Use swapping to reverse,rotate and segregate

*/

public class DutchFlagProblem {
    class Solution {
        public void sortColors(int[] a) {
            int l=0,m=0,h=a.length-1;
            while(m <= h)
            {
                switch (a[m]) 
                {
                    case 0 : {
                        int t = a[l];
                        a[l] = a[m];
                        a[m] = t;
                        l++;m++;break;
                    }
                    case 1 : {
                        m++;
                        break;
                    }
                    case 2 : {
                        int t = a[m];
                        a[m] = a[h];
                        a[h] = t;
                        h--;
                        break;
                    }
                }
            }
        }
    }
}
