package com.arrays;

public class InsertingElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,2,3,4};
int ins[]=new int[arr.length+1];
int ind=3;
int data=8;
int index=0;
for(int i=0;i<=ins.length-1;i++)
{
	if(i==ind)
		ins[i]=data;
	else
	{
		ins[i]=arr[index];
	    index++;
}
}
for(int i=0;i<ins.length;i++)
{
	System.out.println(ins [i]);
	}
	}
}
