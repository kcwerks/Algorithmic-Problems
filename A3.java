// Given a sorted array of positive numbers, 
// find the smallest positive integer value that cannot 
// be represented as sum of elements of any subset of given array.

public class A3 
{
	public static int findSmallest(int array[], int n)
	{
		int result = 1;
		
		for(int i = 0; i < n && array[i] <= result; i++)
		{
			result = result + array[i];
		}
		
		return result;
	}
	
	public static void main(String[] args) 
	{
		int array1[] = {1, 1, 1, 1};
		int n1 = array1.length;
		System.out.println(findSmallest(array1, n1));
		
		int array2[] = {1, 1, 3, 4};
		int n2 = array2.length;
		System.out.println(findSmallest(array2, n2));
	}

}
