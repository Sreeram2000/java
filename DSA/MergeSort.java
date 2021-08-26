import java.util.*;
import java.lang.*;

/*
Complexity	        Best case	Average Case	Worst Case
Time Complexity	    O(n log n)	O(n log n)	    O(n log n)
Space Complexity			                       O(n)


-->Merge Sort is a Divide and Conquer algorithm. 
-->It divides the input array into two halves, calls itself for the 
    two halves, and then merges the two sorted halves. 
-->The merge() function is used for merging two halves. 
-->The merge(arr, l, m, r) is a key process that assumes that arr[l..m] and arr[m+1..r]
    are sorted and merges the two sorted sub-arrays into one.

-->MergeSort(arr[], l,  r)
    If r > l
        1. Find the middle point to divide the array into two halves:  
                middle m = l+ (r-l)/2
        2. Call mergeSort for first half:   
                Call mergeSort(arr, l, m)
        3. Call mergeSort for second half:
                Call mergeSort(arr, m+1, r)
        4. Merge the two halves sorted in step 2 and 3:
                Call merge(arr, l, m, r)
*/

public class MergeSort { 
    void merge(int arr[], int beg, int mid, int end)  
    {  
        int l = mid - beg + 1;  
        int r = end - mid;  
        
        int LeftArray[] = new int [l];  
        int RightArray[] = new int [r];  
        
        for (int i=0; i<l; ++i)  
            LeftArray[i] = arr[beg + i];  
        
        for (int j=0; j<r; ++j)  
            RightArray[j] = arr[mid + 1+ j];  
        
        int i = 0, j = 0;  
        int k = beg;  
        while (i<l&&j<r)  
        {  
            if (LeftArray[i] <= RightArray[j])  
            {  
                arr[k] = LeftArray[i];  
                i++;  
            }  
            else  
            {  
                arr[k] = RightArray[j];  
                j++;  
            }  
            k++;  
        }  
        while (i<l)  
        {  
            arr[k] = LeftArray[i];  
            i++;  
            k++;  
        }  
        
        while (j<r)  
        {  
            arr[k] = RightArray[j];  
            j++;  
            k++;  
        }  
    }  
    
    void sort(int arr[], int beg, int end)  
    {  
        if (beg<end)  
        {  
            int mid = (beg+end)/2;  
            sort(arr, beg, mid);  
            sort(arr , mid+1, end);  
            merge(arr, beg, mid, end);  
        }  
    }  
    public static void main(String args[])  
    {  
        int arr[] = {90,23,101,45,65,23,67,89,34,23};  
        MergeSort ob = new MergeSort();  
        ob.sort(arr, 0, arr.length-1);  
        
        System.out.println("\nSorted array");  
        for(int i =0; i<arr.length;i++)  
        {  
            System.out.println(arr[i]+"");  
        }  
    } 
}
