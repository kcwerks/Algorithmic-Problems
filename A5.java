// The cost of a stock on each day is given in an array, 
// find the max profit that you can make by buying and
// selling in those days.

import java.util.ArrayList;

class Interval
{
	int buy, sell;
}

public class A5 
{
	
	/**
	 * Algorithm:
	 * 	1). Find local minima and store it as starting index.
	 * 	2). Find local maxima, store it as ending index. 
	 * 		If end is reached, set the end as ending index.
	 * 	3). Update solution.
	 * 	4). Repeat above if end is not reached.
	 * 
	 * @param price array containing the stock prices.
	 * @param n length of array.
	 */
	public static void StockBuySell(int price[], int n)
	{
		if(n == 1)
		{
			return;
		}
		
		int count = 0;
		
		ArrayList<Interval> solution = new ArrayList<Interval>();
		
		int i = 0;
		while(i < n - 1)
		{
			while ((i < n - 1) && price[i + 1] <= price[i])
			{
				i++;
			}
			
			if(i == n - 1)
			{
				break;
			}
			
			Interval e = new Interval();
			e.buy = i++;
			
			while((i < n) && (price[i] >= price[i - 1]))
			{
				i++;
			}
			
			e.sell = i - 1;
			solution.add(e);
			count++;
		}
		
		if(count == 0)
		{
			System.out.println("There is no day when buying the stock will make profit");
		}
		
		else
		{
			for(int j = 0; j < count; j++)
			{
				System.out.println("Buy on day: " + solution.get(j).buy 
										 + "    " + "Sell on day: " 
						                 + solution.get(j).sell);
			}
		}
		return;
	}
	
	public static void main(String[] args)
	{
		A5 stock = new A5();
		
		int price[] = {100, 180, 260, 310, 40, 535, 695};
		int n = price.length;
		
		A5.StockBuySell(price, n);
	}
}
