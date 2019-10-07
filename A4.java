// Given an array of integers, and a number x
// find the smallest subarray with sum 
// greater than given value x.

public class A4 
{
	public static int findSmallestSubarray(int arr[], int x, int n)
	{
		int minLength = n + 1;
		
		// Pick every element as starting point...
		for(int start = 0; start < n; start++)
		{
			int currentSum = arr[start];
			
			if(currentSum > x)
			{
				return 1;
			}
			
			// Try different ending points given current starting point...
			for(int end = start + 1; end < n; end++)
			{
				currentSum += arr[end];
				
				if(currentSum > x && (end - start + 1) < minLength)
				{
					minLength = (end - start + 1);
				}
			}
		}
		return minLength;
	}
	
	public static void main(String[] args) 
	{	
		int arr1[] = {1, 4, 45, 6, 10, 19};
		int x = 51;
		int n1 = arr1.length;
		int result1 = findSmallestSubarray(arr1, x, n1);
		if(result1 == n1+1)
		{
			System.out.println("Not Possible!");
		}
		else
		{
			System.out.println(result1);
		}
		
		int arr2[] = {1, 10, 5, 2, 7};
		int y = 9;
		int n2 = arr2.length;
		int result2 = findSmallestSubarray(arr2, y, n2);
		if(result2 == n2+1)
		{
			System.out.println("Not Possible!");
		}
		else
		{
			System.out.println(result2);
		}
	}
}
