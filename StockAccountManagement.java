package Day11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StockAccountManagement {
	

	public static void main(String[] args) 
	{
		Portfolio p1 = new Portfolio();
		
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter Portfolio Name : ");
		
		
		String name = in.next();
		p1.name = name;
		
		System.out.println("Please enter number of stocks");
		int number = in.nextInt();
		
		
		for(int i = 0;i < number; i++)
		{
			Stock stock = new Stock();
			System.out.println("Please enter stock name : " + (i + 1));
			stock.name = in.next();
			
			System.out.println("Please enter stock price : " + (i + 1));
			stock.price = in.nextDouble();
			
			System.out.println("Please enter stock quantity : " + (i + 1));
			stock.quantity = in.nextInt();
			
			p1.stockList.add(stock);
		}
		
		p1.printRecords();
		p1.printTotalValue();
		
	}
}	
		
		class Stock {
		public String name;
		public double price;
		public int quantity;
		}
		
		class Portfolio{
			public String name;
			public List<Stock> stockList = new ArrayList<>();
			
			public void printRecords()
			{
				for(int i = 0; i < stockList.size(); i++)
				{
					String stockName = stockList.get(i).name;
					double value = stockList.get(i).price * stockList.get(i).quantity;
					System.out.println(stockName + " " + value);
				}
			}
			
			public void printTotalValue()
			{
				double totalValue = 0;
				
				for(int i = 0; i < stockList.size(); i++)
				{
					totalValue += stockList.get(i).price * stockList.get(i).quantity;
					
				}
				
				System.out.println(totalValue);
			}
			
		}
		
	


