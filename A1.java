// Java code that determines if there is 
// a Pythagorean triple in a given array.

import java.util.*;
import java.io.*;

public class A1 
{

	/**
	 * Function determines if a given array contains a Pythagorean triplet.
	 * 
	 * Algorithm O(n^2):
	 * 	1). Do square of every element in input array
	 * 	2). Sort the squared array in increasing order.
	 * 	3). To find triplet (a, b, c) such that a^2 + b^2 = c^2:
	 * 		a). Fix 'a' as last element of sorted array.
	 * 		b). Now search for pair (b, c) in subarray between first element and 'a'.
	 * 		c). If no pair found for current 'a', move 'a' back one position and repeat
	 * 			3.b
	 * 
	 * @param array: the array to search for a Pythagorean triplet.
	 * @param n: length of the array.
	 * @return True if given array contains a Pythagorean triplet, false otherwise.
	 */
	public static boolean isPythagoreanTriplet(int array[], int n)
	{
		for(int i = 0; i < n; i++)
		{
			array[i] = array[i] * array[i];
		}
		
		Arrays.sort(array);
		
		for(int i = n -1; i >= 2; i--)
		{
			int leftPointer = 0;
			int rightPointer = i - 1;
			
			while(leftPointer < rightPointer)
			{
				if(array[leftPointer] + array[rightPointer] == array[i])
				{
					return true;
				}
				if(array[leftPointer] + array[rightPointer] < array[i])
				{
					leftPointer++;
				}
				else
				{
					rightPointer--;
				}
			}
		}
		return false;
	}
	
	public static void main(String[] args) 
	{
		int array[] = {3, 1, 4, 6, 5};
		int array_size = array.length;
		
		if(isPythagoreanTriplet(array, array_size) == true)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
	}
}
