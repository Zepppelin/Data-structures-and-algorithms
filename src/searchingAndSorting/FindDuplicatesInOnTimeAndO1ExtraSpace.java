package searchingAndSorting;

import java.util.Arrays;

//https://www.geeksforgeeks.org/find-duplicates-in-on-time-and-constant-extra-space/
public class FindDuplicatesInOnTimeAndO1ExtraSpace
{
	public static void findDuplicate(int [] arr) 
	{
		int i=0;
		int n = arr.length;
		while(i<n) 
		{
			int correctIndex = arr[i];// arr[i]-1 => In case number is starting from 1
			if(arr[i]!=arr[correctIndex]) 
			{
				swap(arr,i,correctIndex);
			}
			else 
			{
				i++;
			}
		}
		
		for(int index=0;index<n;index++)
		{
			if(arr[index]!=index)//if(arr[index]!=index+1) => In case number is starting from 1
			{
				System.out.println("The repeating numbers are : "+" "+arr[index]);
			}
		}
	}
	public static void swap(int[] arr, int i, int j) 
	{
		int temp = arr[j];
		arr[j]=arr[i];
		arr[i]=temp;
	}
	

	public static void main(String[] args)
	{
		 //int[] arr = { 0, 4, 3, 2, 7, 8, 2, 3, 1 };
		 //int[] arr = {1, 2, 3, 4 ,3};
		//int[] arr = {1, 2, 3, 6, 3, 6, 1};
		int[] arr = {0, 4, 3, 2, 7, 8, 2, 3, 1};
		 findDuplicate(arr);
		 

	}

}
