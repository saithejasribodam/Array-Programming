package com.arrays;

public class SumOfDiagonalNumber {

	public static void main(String[] args) {
		int sum = 0;
		int arr[][]=new int[3][3];
		arr[0][0]=1;
		arr[0][1]=2;
		arr[0][2]=3;
		arr[1][0]=4;
		arr[1][1]=5;
		arr[1][2]=6;
		arr[2][0]=7;
		arr[2][1]=8;
		arr[2][2]=9;
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0; j<=arr[i].length-1;j++)
				
			{
				if(i==j)
				{
					sum=sum+arr[i][j];
				
			}
		}
		}
		System.out.println(sum);


	}

}
