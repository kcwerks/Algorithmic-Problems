// Java code to find length of the longest subarray
// which contains numbers that can be arranged
// in a contiguous sequence from an array
// of distinct integers.

public class A2 
{
	public static int findMin(int x, int y)
	{
		return (x < y) ? x : y;
	}
	
	public static int findMax(int x, int y)
	{
		return (x > y) ? x : y;
	}
	
	// Returns length of the longest contiguous subarray
	public static int findContiguousLength(int array[], int n)
	{
		int maxLength = 1;
		
		for(int i = 0; i < n; i++)
		{
			int min = array[i];
			int max = array[i];
			
			for(int j = i + 1; j < n; j++)
			{
				min = findMin(min, array[j]);
				max = findMax(max, array[j]);
				
				// Determine if current subarray has all contiguous elements
				if((max - min) == j - 1)
				{
					maxLength = findMax(maxLength, max - min + 1);
				}
			}
		}
		return maxLength;
	}
	
	public static void main(String[] args) 
	{
		int array[] = {14, 12, 11, 20};
		int n = array.length;
		
		System.out.println("Length of the longest contiguos subarray is: "
				+ findContiguousLength(array, n));
	}
}
