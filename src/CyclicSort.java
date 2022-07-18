import java.util.Arrays;
// Time Complexity : O(n) (only when the number in the range from 1 to n or 0 to n

//Worst Case : O(n) 
//Average Case: O(n) 
//Best Case : O(n)

//Space complexity :

//The space complexity is constant cause this algorithm is in place so it does not use any extra memory to sort.
//Auxiliary space: o(1)
public class CyclicSort 
{
	
	public static int[] sort(int[] arr)
	{
		int i=0;
		while(i<arr.length) 
		{
			int correctIndex = arr[i]-1;
			if(arr[i]!=arr[correctIndex])
			{
				swap(arr,i,correctIndex);
			}
			else 
			{
				i++;
			}
		}
		return arr;
	}

	public static void swap(int[] arr, int i, int j)
	{
		int temp = arr[j];
		arr[j] = arr[i];
		arr[i]=temp;
	}

	public static void main(String[] args) 
	{
		int[] nums = {5,4,3,2,1};
		int[] ans = sort(nums);
		System.out.println(Arrays.toString(ans));

	}

}
