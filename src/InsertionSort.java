import java.util.Arrays;
//Best Case Complexity - It occurs when there is no sorting required, i.e. the array is already sorted. The best-case time complexity of insertion sort is O(n).
//Average Case Complexity - It occurs when the array elements are in jumbled order that is not properly ascending and not properly descending. The average case time complexity of insertion sort is O(n2).
//Worst Case Complexity - It occurs when the array elements are required to be sorted in reverse order. That means suppose you have to sort the array elements in ascending order, but its elements are in descending order. The worst-case time complexity of insertion sort is O(n2).
public class InsertionSort 
{
	public static int[] sort(int[] arr)
	{
		for(int i=0;i<arr.length-1;i++) 
		{
			for(int j=i+1;j>0;j--) 
			{
				if(arr[j]<arr[j-1]) 
				{
					swap(arr, j,j-1);
				}
			}
		}
		return arr;
	}

	public static void swap(int[] arr, int i, int j) 
	{
		int temp =arr[j];
		arr[j]=arr[i];
		arr[i]=temp;
	}

	public static void main(String[] args) 
	{
		int[] nums = {-25,4,-33,2,1};
		int[] ans = sort(nums);
		System.out.println(Arrays.toString(ans));
	}

}
