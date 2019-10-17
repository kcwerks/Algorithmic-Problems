// Java implementation to find the pair in a given sorted
// array whose sum is closest to a given number x.

public class A6 
{
	
	/*
	 * Algorithm: 
	 * 1). Initalaize a variable diff as infinity.
	 * 2). Initialize two index variables leftPointer and rightPointer 
	 * 	   in the given sorted array.
	 * 3). Loop while leftPointer < rightPointer:
	 * 		a). If abs(arr[leftPointer] + arr[rightPointer] - x) < diff
	 * 			then update diff and result.
	 * 		b). Else if (arr[leftPointer] + arr[rightPointer] < x) 
	 * 			then leftPointer++.
	 * 		c). else rightPointer--.
	 */
	public static void printClosest(int arr[], int n, int x)
	{
		int leftResult = 0;
		int rightResult = 0;
		
		int leftPointer = 0;
		int rightPointer = n - 1;
		int diff = Integer.MAX_VALUE;
		
		// While there are elements to check...
		while(rightPointer > 1)
		{
			// Check if this pair is closer than previous pair...
			if(Math.abs(arr[leftPointer] + arr[rightPointer] - x) < diff)
			{
				leftResult = leftPointer;
				rightResult = rightPointer;
				diff = Math.abs(arr[leftPointer] + arr[rightPointer] - x);
			}
			
			// If this pair has larger sum, move to smaller values...
			if(arr[leftPointer] + arr[rightPointer] < x)
			{
				leftPointer++;
			}
			else
			{
				rightPointer--;
			}
		}
		System.out.println("Closest pair is " + arr[leftResult] + " and " + arr[rightResult]);
	}
	
	
	public static void main(String[] args)
	{
		int arr[] = {10, 22, 28, 29, 30, 40};
		int x = 54;
		int n = arr.length;
		printClosest(arr, n, x);
	}
}
