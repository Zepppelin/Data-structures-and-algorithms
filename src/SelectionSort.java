import java.util.Arrays;
//Best Case Complexity - It occurs when there is no sorting required, i.e. the array is already sorted. The best-case time complexity of selection sort is O(n2).
//Average Case Complexity - It occurs when the array elements are in jumbled order that is not properly ascending and not properly descending. The average case time complexity of selection sort is O(n2).
//Worst Case Complexity - It occurs when the array elements are required to be sorted in reverse order. That means suppose you have to sort the array elements in ascending order, but its elements are in descending order. The worst-case time complexity of selection sort is O(n2).
// Space complexity O(1)
public class SelectionSort
{
	static int[] selectionSort(int[] arr)
	{
		for(int i=0;i<arr.length;i++) 
		{
			 int last = arr.length-i-1;
			//find the largest number in the remaining array and swap with the correct index//0 1 2 10
			 int maxIndex = getMaxIndex(arr,0,last);
			 swap(arr,maxIndex,last);
		}
		return arr;
	}

	private static void swap(int[] arr, int i, int j) 
	{
		int temp = arr[j];
		arr[j]=arr[i];
		arr[i]=temp;
	}

	private static int getMaxIndex(int[] arr, int start, int end) 
	{
		int max = start;
		for(int i=start;i<=end;i++) 
		{
			if(arr[i]>arr[max]) 
			{
				max=i;
			}
		}
		return max;
	}

	public static void main(String[] args) 
	{
		int[] arr = {-5,4,3,2,1};
		int[] ans = selectionSort(arr);
		System.out.println(Arrays.toString(ans));
	}

}
