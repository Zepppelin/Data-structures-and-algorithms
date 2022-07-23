package searchingAndSorting;

import java.util.Arrays;

//https://leetcode.com/problems/product-of-array-except-self/
// solution : Nick white
public class ProductOfArrayExceptSelf
{
	public static int[] arrayProduct(int[] arr)
	{
		if(arr.length==0) 
		{
			return null;
		}
		int n = arr.length;
		int[] outputArray = new int[n];
		int R1=1;
		for(int i=0;i<n;i++) 
		{
			outputArray[i]=R1;
			R1=R1*arr[i];
		}
		int R =1;
		for(int i=n-1;i>=0;i--) 
		{
			outputArray[i]=outputArray[i]*R;
			R = R*arr[i];
		}
		return outputArray;
	}

	public static void main(String[] args)
	{
		int[] nums = {1,2,3,4};
		int [] ans = arrayProduct(nums);
		System.out.println(Arrays.toString(ans));

	}

}
