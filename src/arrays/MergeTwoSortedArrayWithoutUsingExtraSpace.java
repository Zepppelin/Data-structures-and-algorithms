package arrays;

import java.util.Arrays;

public class MergeTwoSortedArrayWithoutUsingExtraSpace 
{
	public static void merge(int[] arr1,int[] arr2,int n,int m) 
	{
		int k;
		for(int i=0;i<n;i++)
		{
			if(arr1[i]>arr2[0]) 
			{
				swap(arr1,arr2,i,0);
			}
			int first = arr2[0];
			for(k =1;k<m && arr2[k]<first;k++) 
			{
				arr2[k-1]=arr2[k];//here insertion sort is used
			}
			arr2[k-1]=first;
		}
	}
	public static void swap(int[] arr1,int[] arr2,int i, int j)
	{
		int temp = arr2[j];
		arr2[j]=arr1[i];
		arr1[i]=temp;
	}
	public static void main(String[] args)
	{
		int[] arr1 = {1, 4, 8, 10};
		int[] arr2 = {2, 3, 9};
        int n= arr1.length;
        int m = arr2.length;
        merge(arr1,arr2,n,m);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
	}
}
