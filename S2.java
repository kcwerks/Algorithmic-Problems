// Java code to print all possible
// palindromic partitions of a given string. 

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class S2 
{

	public static void main(String[] args) 
	{
		String input = "geeks";
		
		System.out.println("All possible palindromic partitions for " + input + " are: ");
		allPalindromicPartitions(input);

	}
	
	// Print all possible palindromic partitions of input. 
	private static void allPalindromicPartitions(String input)
	{
		int n = input.length();
		
		// Stores all palindromic partitions found.
		ArrayList<ArrayList<String>> allPartitions = new ArrayList<>();
		
		// Stores current palindromic partition.
		Deque<String> currentPartition = new LinkedList<String>();
		
		allPalindromicPartitionsUtil(allPartitions, currentPartition, 0, n, input);
		
		for(int i = 0; i < allPartitions.size(); i++)
		{
			for(int j = 0; j < allPartitions.get(i).size(); j++)
			{
				System.out.print(allPartitions.get(i).get(j) + " ");
			}
			System.out.println();
		}
	}
	
	// Recursive function to find all palindromic partitions.
	private static void allPalindromicPartitionsUtil(ArrayList<ArrayList<String>> allPartitions,
							Deque<String> currentPartition, int start, int n, String input)
	{
		if(start >= n)
		{
			allPartitions.add(new ArrayList<>(currentPartition));
			return;
		}
		
		// Pick all possible end points for substrings
		for(int i = start; i < n; i++)
		{
			if(isPalindrome(input, start, i))
			{
				currentPartition.addLast(input.substring(start, i + 1));
				
				allPalindromicPartitionsUtil(allPartitions, currentPartition, i + 1, n, input);
				
				currentPartition.removeLast();
			}
		}
	}
	
	// Determines if given input is a palindrome.
	private static boolean isPalindrome(String input, int start, int i)
	{
		while(start < i)
		{
			if(input.charAt(start++) != input.charAt(i--))
			{
				return false;
			}
		}
		return true;
	}
}
