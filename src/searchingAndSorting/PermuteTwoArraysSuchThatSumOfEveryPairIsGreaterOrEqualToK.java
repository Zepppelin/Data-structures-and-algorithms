package searchingAndSorting;

import java.util.Arrays;
import java.util.Collections;

//https://www.geeksforgeeks.org/permute-two-arrays-sum-every-pair-greater-equal-k/
public class PermuteTwoArraysSuchThatSumOfEveryPairIsGreaterOrEqualToK 
{
	
	public static boolean isPossible(Integer a[], int b[],int n, int k)
	{
		Arrays.sort(a,Collections.reverseOrder());
		Arrays.sort(b);
		
		for(int i=0;i<n;i++) 
		{
			if(a[i]+b[i]<k) 
			{
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args)
	{
		Integer a[] = {2, 1, 3};
	    int b[] = {7, 8, 9};
	    int k = 10;
	    int n = a.length;
	    boolean ans = isPossible(a,b,n,k);
	    System.out.println(ans);
	}

}
