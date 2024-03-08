package com.arrays;

import java.util.Scanner;

public class SumOfRows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter number of rows:");
int row=s.nextInt();
System.out.println("enter number of columns");
int column=s.nextInt();
int arr[][]=new int[row][column];
System.out.println("enter "+(row*column)+" no of data");
for(int i=0;i<row;i++)
{
	for(int j=0;j<column;j++)
	{
		arr[i][j]=s.nextInt();
	}
}
for(int i=0;i<arr.length;i++)
{
	int sum=0;
	for(int j=0;j<arr[i].length;j++)
	{
		sum=sum+arr[i][j];
		
	}
	System.out.println("sum of"+(i+1)+" row is"+sum);
}
	}

}
