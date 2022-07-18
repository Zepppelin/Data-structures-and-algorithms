import java.util.Arrays;

//Best Case Complexity - In Quicksort, the best-case occurs when the pivot element is the middle element or near to the middle element. The best-case time complexity of quicksort is O(n*logn).
//Average Case Complexity - It occurs when the array elements are in jumbled order that is not properly ascending and not properly descending. The average case time complexity of quicksort is O(n*logn).
//Worst Case Complexity - In quick sort, worst case occurs when the pivot element is either greatest or smallest element. Suppose, if the pivot element is always the last element of the array, the worst case would occur when the given array is sorted already in ascending or descending order. The worst-case time complexity of quicksort is O(n2).

public class QuickSort
{
	public static void sort(int[] arr,int low, int hi)
	{
		//low and hi tells us the range which we are working while start and end is for swipping
		if(low>=hi) 
		{
			return;
		}
		int start =low;
		int end = hi;
		int mid = start+(end-start)/2;
		int pivot = arr[mid];
		
		while(start<=end) 
		{
			while(arr[start]<pivot)
			{
				start++;
			}
			while(arr[end]>pivot)
			{
				end--;
			}
			
			if(start<=end)
			{
				int temp = arr[end];
				arr[end]=arr[start];
				arr[start] = temp;
				start++;
				end--;
			}
		}
		sort(arr,low,end);
		sort(arr,start,hi);
	}
	public static void main(String[] args) 
	{
		int[] arr = {5,4,3,2,1};
		sort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));

	}

}
