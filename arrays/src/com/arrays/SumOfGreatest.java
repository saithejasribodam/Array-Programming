package com.arrays;

public class SumOfGreatest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int arr[][]= {{1,2,3,4},
		   {3,2,1,6},
		   {4,5,2,8},
		   {9,8,7,6}};
   for(int i=0;i<=arr.length-1;i++)
   {
	   int max=arr[i][0];
	   for(int j=0;j<arr[i].length;j++)
	   {
		   if(arr[i][j]>max) // if(arr[i][j]<max) ... smallest number in row
			   max=arr[i][j];
	   }
	   System.out.println("the greatest element in the "+(i+1)+" is "+ max);
   }
	}

}
