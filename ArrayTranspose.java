package JAVA;

import java.util.Scanner;

public class ArrayTranspose{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number of rows:");
		int rows = sc.nextInt();
		System.out.print("Enter number of columns:");
		int cols = sc.nextInt();
		
		int [][] arr = new int[rows][cols];
		System.out.print("Enter  elements of the array:");
		for(int i=0;i<rows;i++)
			for(int j=0;j<cols;j++)
				arr[i][j]= sc.nextInt();
		
		int transpose[][] = new int[cols][rows];
		for(int i=0;i<rows;i++)
			for(int j=0;j<cols;j++)
				transpose[j][i] = arr[i][j];
		
		System.out.print("Transpose of Array:");
		for(int i = 0; i<cols;i++)
			for(int j=0;j<rows;j++)
				System.out.print(transpose[i][j] + " ");
		System.out.println();		
						
}
}