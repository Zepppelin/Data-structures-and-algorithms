package searchingAndSorting;

public class CeilingInSortedArray 
{
	public static int ceiling(int[] arr, int target) 
	{
		int start =0;
		int end = arr.length-1;
		while(start<=end) 
		{
			int mid = start+(end-start)/2;
			if(target == arr[mid]) 
			{
				return arr[mid];
			}
			else if(target<arr[mid]) 
			{
				end = mid -1;
			}
			else 
			{
				start= mid+1;
			}
		}
		return arr[start];
	}

	public static void main(String[] args) 
	{
		int[] arr = {1, 2, 8, 10, 10, 12, 19};
        int target = 3;
        int ans = ceiling(arr,target);
        System.out.println(ans);
	}

}
