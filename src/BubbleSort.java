import java.util.Arrays;

// Best Case Complexity - It occurs when there is no sorting required, i.e. the array is already sorted. The best-case time complexity of bubble sort is O(n).
//Average Case Complexity - It occurs when the array elements are in jumbled order that is not properly ascending and not properly descending. The average case time complexity of bubble sort is O(n2).
//Worst Case Complexity - It occurs when the array elements are required to be sorted in reverse order. That means suppose you have to sort the array elements in ascending order, but its elements are in descending order. The worst-case time complexity of bubble sort is O(n2).
public class BubbleSort 
{
	//Time Complexity //
	// Best case O(n);
	// wrost case O(n2);
	// Average case O(n2);
	
	//space complexity O(1);
	
	private static int[] sort(int[] arr) 
	{
		boolean swapped;
		for(int i=0;i<arr.length;i++)
		{
			swapped = false;
			for(int j=1;j<arr.length-i;j++) 
			{
				if(arr[j-1]>arr[j])
				{
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
					swapped=true;
				}
			}
			if(!swapped) 
			{
			  break;
			}
		}
		return arr;
	}
	
	public static void main(String[] args) 
	{
		int[] arr = {1,2,3,4,5};
		int[] ans = sort(arr);
		System.out.println(Arrays.toString(ans));
	}

	

}
