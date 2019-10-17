// Java implementation to create a linked list from a given array.

/*
 * Approach:
 * 	Traverse array from the end and insert every element at
 *  the beginning of the list.
 */

import java.util.*;

public class A7 
{
	static class Node
	{
		int data;
		Node next;
	}
	
	static Node root;
	
	static Node insert(Node root, int item)
	{
		Node temp = new Node();
		temp.data = item;
		temp.next = root;
		root = temp;
		return root;
	}
	
	static void display(Node root)
	{
		while(root != null)
		{
			System.out.print(root.data + " ");
			root = root.next;
		}
	}
	
	static Node arrayToList(int arr[], int n)
	{
		root = null;
		
		for(int i = n - 1; i >= 0; i--)
		{
			root = insert(root, arr[i]);
		}
		
		return root;
	}

	public static void main(String[] args) 
	{
		int arr[] = {1, 2, 3, 4, 5};
		int n = arr.length;
		Node root = arrayToList(arr, n);
		display(root);
	}
}
