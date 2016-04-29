package Matrix;

import java.util.Scanner;

public class TransposeAMatrix {
	
	public static void main(String[] args) {
		int m, n, c, d;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of rows and columns of Matrix");
		m = in.nextInt();
		n = in.nextInt();
		
		int matrix [][] = new int [m][n];
		
		System.out.println("Enter the elements of matrix");
		
		for (c = 0; c <m; c++)
			for (d = 0; d < n; d++)
				matrix[c][d]= in.nextInt();
		int transpose [][] = new int [n][m];
	}

}
