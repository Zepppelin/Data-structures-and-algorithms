package searchingAndSorting;

import java.util.ArrayList;

// https://www.geeksforgeeks.org/find-common-elements-three-sorted-arrays/
//Sol : gfg
public class FindCommonElementsInThreeSortedArrays 
{
	public static ArrayList<Integer> commonElements(int[] A, int[] B, int[] C, int n1, int n2, int n3) 
	{
	    ArrayList<Integer> al = new ArrayList<Integer>();
	    for(int i=0;i<n1;i++)
	    {
	    	if(i!=0 && A[i]==A[i-1]) 
	    	{
	    		continue;
	    	}
	    	if(binarySearch(B,n2,A[i]) && binarySearch(C,n3,A[i]))
	    	{
	    		al.add(A[i]);
	    	}
	    }
		return al;
	    
	}
	
	public static boolean binarySearch(int[] arr, int n, int target)
	{
		int start =0;
	    int end = arr.length-1;
	    
	    while(start<=end)
	    {
	    	int mid = start+(end-start)/2;
	    	if(target==arr[mid])
	    	{
	    		return true;
	    	}
	    	else if(target>arr[mid]) 
	    	{
	    		start=mid+1;
	    	}
	    	else 
	    	{
	    		end = mid-1;
	    	}
	    }
	    return false;
	}
	public static void main(String[] args)
	{
//		int[] A = {1, 5, 10, 20, 40, 80};
//		int[] B = {6, 7, 20, 80, 100};
//		int[] C = {3, 4, 15, 20, 30, 70, 80, 120};
		
		int[] A = {3,3,3};
		int[] B = {3,3,3};
		int[] C = {3,3,3};
		
		int n1 = A.length;
		int n2 = B.length;
		int n3 = C.length;
		ArrayList<Integer> al = commonElements(A,B,C,n1,n2,n3);
		System.out.println(al);
		
	}

}
