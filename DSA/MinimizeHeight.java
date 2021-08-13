/*

Input:
K = 3, N = 5
Arr[] = {3, 9, 12, 16, 20}
Output:
11
Explanation:
The array can be modified as
{6, 12, 9, 13, 17}. The difference between 
the largest and the smallest is 17-6 = 11.

*/
public class MinimizeHeight {
    int getMinDiff(int[] a, int n, int k) {
        Arrays.sort(a); 
        int i,mx=Integer.MAX_VALUE,mn,ans;
        // this can be one possible solution
        ans = a[n-1]-a[0];  // this can be one possible solution
        
        for(i=0;i<n;i++)
        {
            // since height of tower can't be -ve so taking only +ve heights
            if(a[i]>=k)  
            {
                mn = Math.min(a[0]+k, a[i]-k);
                if(i>0)
                {
                    mx = Math.max(a[n-1]-k, a[i-1]+k);
                }
                ans = Math.min(ans, mx-mn);
            }
        }
        return ans;
    }
}
