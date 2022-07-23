package arrays;

import java.util.Arrays;

public class MergeTwoSortedArrayUsingExtraSpace
{
	public static int[] merge(int[] arr1,int[] arr2,int n,int m)
	{
		int[] mix = new int[n+m];
		int i=0;
		int j =0;
		int k=0;
		
		while(i<n && j<m)
		{
			if(arr1[i]<arr2[j]) 
			{
				mix[k]=arr1[i];
				i++;
			}
			else 
			{
				mix[k]=arr2[j];
				j++;
			}
			k++;
		}
		while(i<n) 
		{
			mix[k]=arr1[i];
			i++;
			k++;
		}
		while(j<m) 
		{
			mix[k]=arr2[j];
			j++;
			k++;
		}
		return mix;
	}
	
	public static void main(String[] args)
	{
		int[] arr1 = {1, 4, 8, 10};
		int[] arr2 = {2, 3, 9};
        int n= arr1.length;
        int m = arr2.length;
        int[] ans = merge(arr1,arr2,n,m);
        System.out.println(Arrays.toString(ans));
	}

}
