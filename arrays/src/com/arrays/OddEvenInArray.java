package com.arrays;

public class OddEvenInArray {
//merging
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	int arr[]= {1,2,3,4};
	int arr1[]= {5,6,7,8};
	int merge[]=new int[arr.length+arr1.length];
	int index=0;
	for(int i=0;i<merge.length;i++)
	{
		if(i<=arr.length-1)
			merge[i]=arr[i];
		else
		{
			merge[i]=arr1[index];
		index++;
	}
	}
	for(int i=0;i<merge.length;i++)
	{
	System.out.println(merge[i]);
		}

	}
	

}
