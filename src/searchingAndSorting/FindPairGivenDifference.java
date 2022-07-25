package searchingAndSorting;

import java.util.Arrays;

// https://practice.geeksforgeeks.org/problems/find-pair-given-difference1559/1
//sol : https://www.youtube.com/watch?v=XGrXiVi7Ces
public class FindPairGivenDifference 
{
	public static boolean findPair(int arr[], int size, int target) 
	{
		 Arrays.sort(arr);
		 int i =0;
		 int j =i+1;
		 
		 while(i<arr.length && j<arr.length) 
		 {
			 if(arr[j]-arr[i]==target && i!=j)
			 {
				 return true;
			 }
			 else if(arr[j]-arr[i]<target) 
			 {
				j++; 
			 }
			 else 
			 {
				 i++;
			 }
		 }
		 return false;
	}
	public static void main(String[] args) 
	{
		//int[] arr= {5, 20, 3, 2, 5, 80};
		int[] arr= {1, 2, 6, 3, 4};
		int size = arr.length;
		int target = 78;
		boolean ans = findPair(arr,size,target);
		System.out.println(ans);
	}

}
