/*

Input:
a1[] = {1, 2, 3, 4, 5, 6}
a2[] = {1, 2, 4}
Output:
Yes
Explanation:
a2[] is a subset of a1[]

*/ 
public class ArraySubsetOfArray {
    public String isSubset( long a1[], long a2[], long n, long m) {
        HashSet<Integer> hset = new HashSet<>();

       // hset stores all the values of arr1
       for (int i = 0; i < n; i++) {
           if (!hset.contains(a1[i]))
           {
               Long y = a1[i];
               int x = y.intValue();
               hset.add(x);
           }
       }

       // loop to check if all elements
       //  of arr2 also lies in arr1
       for (int i = 0; i < m; i++) 
       {
           Long y = a2[i];
           int x = y.intValue();
           if (!hset.contains(x))
               return "No";
       }
       return "Yes";
   }
}
