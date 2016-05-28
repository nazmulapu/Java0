package Prices;

import java.util.Scanner;

public class Prices {
	
	public static void main(String[] args) {
		
		double [][] prices = new double [5][2];
		Scanner in = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			
			System.out.println("Enter the original prices: ");
			prices[i][0] = in.nextDouble();
			prices[i][1]= prices[i][0] * .70;
			
		}
		
		for (int i = 0; i < 5; i++) {
			
			System.out.println("original price $" + prices[i][0] +
					"\tdiscounted price $"+prices[i][1]);
			
		}
	}

}
