package LeetCode;

public class SaleAndProfit {
	public static void main(String[] args) {

		int [] prices  = {8,6,9,1,3,5};
		System.out.println("Your Profit Value is : "+loseOrProfit(prices)); // Answer will be 4 

	}
	public static int loseOrProfit(int [] a)
	{
		int length = a.length;

		// basic condition
		if( length == 0 || a == null)
		{
			return 0;
		}

		int profit = 0, buy_price = a[0];
		for(int  i=1;i<length;i++)
		{
			if(a[i] < buy_price)
			{
				buy_price = a[i];
				continue;
			}
			profit = Math.max(profit, a[i] - buy_price);
		}
		return profit;
	}
}
