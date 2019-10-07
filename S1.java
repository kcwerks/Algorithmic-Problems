// Java code to reverse an array
// without affecting special characters.

public class S1 
{

	/*
	 * Algorithm (Efficient Solution):
	 * 	1). Let input string be 'string[]' and length of string be 'n'
	 * 	2). leftPointer = 0, rightPointer = n - 1
	 * 	3). While leftPointer is smaller than rightPointer:
	 * 		a). If string[leftPointer] is not an alphabetic character, leftPointer++
	 * 		b). Else if string[rightPointer] is an alphabetic character, rightPointer--
	 * 		c). Else swap string[leftPointer] and string[rightPointer]
	 */
	
	public static void reverse(char string[])
	{
		int rightPointer = string.length - 1;
		int leftPointer = 0;
		
		while(leftPointer < rightPointer)
		{
			if(!Character.isAlphabetic(string[leftPointer]))
			{
				leftPointer++;
			}
			else if(!Character.isAlphabetic(string[rightPointer]))
			{
				rightPointer--;
			}
			else
			{
				char temp = string[leftPointer];
				string[leftPointer] = string[rightPointer];
				string[rightPointer] = temp;
				leftPointer++;
				rightPointer--;
			}
		}
	}
	
	public static void main(String[] args) 
	{
		String string = "a!!!b.c.d,e'f,ghi";
		char[] charArray = string.toCharArray();
		
		System.out.println("Input " + string);
		
		reverse(charArray);
		String reversedString = new String(charArray);
		
		System.out.println("Output: " + reversedString);
	}

}
